package com.artificesoft.mechdwarf;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;

/**
 * Based on https://stackoverflow.com/a/74923998
 */
public final class UserDataDir {
    private static final Path UNDEFINED = Path.of("/");
    private static final String PROP_USER_HOME = System.getProperty("user.home");
    private static final String PROP_OS_VERSION = System.getProperty("os.version");
    private static final String ENV_APPDATA = System.getenv("AppData");
    private static final String ENV_XDG_DATA_HOME = System.getenv("XDG_DATA_HOME");

    private static Path home(final String... paths) {
        return Path.of(PROP_USER_HOME, paths);
    }

    private static boolean ensureExists(final Path path) {
        final File file = path.toFile();
        return file.exists() || file.mkdirs();
    }

    private static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    private static boolean isMacOS() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }

    private static boolean isUnixLike() {
        return System.getProperty("os.name").toLowerCase().contains("nix");
    }

    public static Path getAppPath(final String appName) throws FileNotFoundException {
        final Path osPath = isWindows()
            ? getWinAppPath()
            : isMacOS()
            ? getMacAppPath()
            : isUnixLike()
            ? getUnixLikeAppPath()
            : UNDEFINED;

        final Path path = osPath.equals(UNDEFINED)
            ? getDefaultAppPath(appName)
            : osPath.resolve(appName);
        
        if (ensureExists(path)) {
            return path;
        } else {
            throw new FileNotFoundException(path.toString());
        }
    }

    private static Path getWinAppPath() {
        return ENV_APPDATA == null || ENV_APPDATA.isBlank()
            ? home(getWinVerAppPath())
            : Path.of(ENV_APPDATA);
    }

    private static String[] getWinVerAppPath() {
        return PROP_OS_VERSION.startsWith("5.")
            ? new String[]{"Application Data"}
            : new String[]{"AppData", "Roaming"};
    }

    private static Path getMacAppPath() {
        final Path path = home("Library", "Application Support");
        return ensureExists(path) ? path : UNDEFINED;
    }

    private static Path getUnixLikeAppPath() {
        Path path = home(".local", "share");

        if (ENV_XDG_DATA_HOME != null && !ENV_XDG_DATA_HOME.isBlank()) {
            final Path xdgPath = Path.of(ENV_XDG_DATA_HOME);
            path = ensureExists(xdgPath) ? xdgPath : path;
        }
        return path;
    }

    private static Path getDefaultAppPath(final String appName) {
        return home('.' + appName);
      }

}
