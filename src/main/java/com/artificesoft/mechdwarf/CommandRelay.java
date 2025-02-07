package com.artificesoft.mechdwarf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Objects;

import org.newsclub.net.unix.AFUNIXServerSocket;
import org.newsclub.net.unix.AFUNIXSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dfhackclient.DFHackRPCClient;

public final class CommandRelay {
    
    private static final int TALON_PROTOCOL_VERSION = 1;
    private static final Logger LOGGER = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    private static final String SOCKET_FILE_NAME = "mechdwarf.socket";
    private static final String TALON_HANDSHAKE = "mechdwarf-talon" + TALON_PROTOCOL_VERSION;
    private static final String RELAY_HANDSHAKE = "mechdwarf-relay" + TALON_PROTOCOL_VERSION;
    private static final int HANDSHAKE_WAIT_TIME_MS = 10000; 

    public static void main(String[] args) {
        LOGGER.info("Starting MechDwarf Java Command Relay...");
        String socketPathString = null;
        if (args.length > 0) {
            socketPathString = args[0];
        }
        Path socketPath = calculateSocketPath(socketPathString);

        LOGGER.info("Opening socket for IPC with Talon at " + socketPath.toString() + "...");
        AFUNIXSocket serverSocket = openTalonSocket(socketPath);
        BufferedReader inputReader = createInputReader(serverSocket);
        BufferedWriter outputWriter = createOutputWriter(serverSocket);

        LOGGER.info("Handshaking with DFHack RPC...");
        DFHackRPCClient dfhClient = doDFHackHandshake(5000); // TODO: custom port argument    

        LOGGER.info("Handshaking with Talon...");
        boolean handshakeSuccess = doTalonHandshake(inputReader, outputWriter);
        
    }

    private static DFHackRPCClient doDFHackHandshake(int port) {
        try {
            DFHackRPCClient client = new DFHackRPCClient("RemoteFortressReader");
            client.connect(port); 
            return client;            
        } catch (IOException e) {
            LOGGER.error("Failed to establish a connection with DFHack:", e);
            System.exit(-1);
        }
        throw new AssertionError("Impossible state!");
    }

    private static Path calculateSocketPath(String talonPluginLocation) {
        try {
            Path socketPath;
            if (Objects.nonNull(talonPluginLocation)) {
                socketPath = Path.of(talonPluginLocation).resolve(SOCKET_FILE_NAME);
                Files.deleteIfExists(socketPath); 
            } else {
                socketPath = UserDataDir.getAppPath("mechdwarf");
                socketPath = socketPath.resolve(SOCKET_FILE_NAME);
                Files.deleteIfExists(socketPath); 
            }
            return socketPath;
        } catch (IOException e) {
            LOGGER.error("IOException occurred during Talon unix socket pre-setup:", e);
            System.exit(-2);
        }
        throw new AssertionError("Impossible state!");
    }

    private static AFUNIXSocket openTalonSocket(Path socketPath) {
        try {
            File file = socketPath.toFile();
            LOGGER.info("Making socket");
            AFUNIXServerSocket server = AFUNIXServerSocket.newInstance();
            LOGGER.info("Binding");
            server.bind(AFUNIXSocketAddress.of(file));
            LOGGER.info("Accepting");
            return server.accept();
        } catch (IOException e) {
            LOGGER.error("IOException occurred while opening Talon unix socket:", e);
            System.exit(-3);
        }
        throw new AssertionError("Impossible state!");
    }

    private static BufferedReader createInputReader(AFUNIXSocket serverSocket) {
        try {
            return new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
        }
        catch (IOException e) {
            LOGGER.error("IOException occurred while opening Talon unix socket:", e);
            System.exit(-4);
        }
        throw new AssertionError("Impossible state!");
    }

    private static BufferedWriter createOutputWriter(AFUNIXSocket serverSocket) {
        try {
            return new BufferedWriter(new OutputStreamWriter(serverSocket.getOutputStream()));            
        }
        catch (IOException e) {
            LOGGER.error("IOException occurred while opening Talon unix socket:", e);
            System.exit(-4);            
        }
        throw new AssertionError("Impossible state!");
    }

    private static boolean doTalonHandshake(BufferedReader inputReader, BufferedWriter outputWriter) {
        Instant now = Instant.now();
        Instant timeout  = now.plusMillis(HANDSHAKE_WAIT_TIME_MS);
        try {
            outputWriter.append(RELAY_HANDSHAKE);
            outputWriter.newLine();
            outputWriter.flush();

            while (inputReader.ready() || now.isBefore(timeout)) {
                if (inputReader.ready()) {
                    String handshake = inputReader.readLine();
                    if (handshake.equals(TALON_HANDSHAKE)) return true;
                }
            }
            return false;
        } catch (IOException e) {
            LOGGER.error("IOException occurred during handshake with Talon:", e);
            System.exit(-5);
        }
        throw new AssertionError("Impossible state!");
    }


}
