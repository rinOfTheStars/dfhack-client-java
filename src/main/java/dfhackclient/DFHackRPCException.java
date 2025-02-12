// (c) 2021- McArcady@gmail.com
// This code is licensed under MIT license (see RPC_CLIENT_LICENSE.txt for details)

package dfhackclient;

import java.io.IOException;

public class DFHackRPCException extends IOException {

	public DFHackRPCException(String msg) {
		super(msg);
	}

	public DFHackRPCException(String msg, Exception e) {
		super(msg, e);
	}

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;

}
