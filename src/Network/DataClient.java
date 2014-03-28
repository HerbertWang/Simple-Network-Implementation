package Network;
import java.net.*;
import java.io.*;

import javax.swing.*;;
public class DataClient {

	/**Runs the client as an application
	 */
	public static void main(String[] args) throws IOException{
		String serverAddress=JOptionPane.showInputDialog(
				"Enter IP Address of a machine that is\n"+
				"running the data Serveice on port 7777");
		Socket s=new Socket(serverAddress,7777);
		BufferedReader input=
				new BufferedReader(new InputStreamReader(s.getInputStream()));
				String answer=input.readLine();
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
	}

}
