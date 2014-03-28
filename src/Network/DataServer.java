package Network;
import  java.io.*;
import java.net.*;
import java.util.*;

public class DataServer {

	/**
	 * Runs the server
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket listener=new ServerSocket(7777);
		try
		{
			while(true)
			{
				Socket socket=listener.accept();
				try
				{
					PrintWriter out=
							new PrintWriter(socket.getOutputStream(),true);
					out.println(new Date().toString());
				}
				finally
				{
					socket.close();
				}
			}
		}
		finally
		{
			listener.close();
		}
	}

}
