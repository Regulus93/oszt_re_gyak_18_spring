
import java.util.*;
import java.io.*;
import java.net.*;

public class Szerver5 {
	static int numberOfConnectedClients = 0;
	
    public static void main(String[] args) throws Exception {
        final int PORT = 12345;


        try (
            ServerSocket ss = new ServerSocket(PORT);
        ) {
            while (true) {
                processNewClient(ss);
            }
        }
    }

    private static void processNewClient(ServerSocket ss) throws Exception {
        try (
            Socket s = ss.accept();
			PrintWriter pw = new PrintWriter(s.getOutputStream());
        ) {
            if(s.isConnected()){
				numberOfConnectedClients++;
			}
			pw.println(numberOfConnectedClients);
			pw.flush();
			s.close();
        }
    }
}
