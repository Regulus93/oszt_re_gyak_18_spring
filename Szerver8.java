
import java.util.*;
import java.io.*;
import java.net.*;

public class Szerver8 {
	static int numberOfConnectedClients = 0;
	
    public static void main(String[] args) throws Exception {
        final int PORT = 12345;
		ArrayList<Socket> clientSockets = new ArrayList<>();
		ArrayList<String> clientNames = new ArrayList<>();
		
        try (
            ServerSocket ss = new ServerSocket(PORT);
			
			Socket s = ss.accept();
			
        ) {
            while (true) {
                processNewClient(ss);
            }
        }
    }

    private static void processNewClient(ServerSocket ss) throws Exception {
        try (
            
			clients.add(s);
			Scanner clientScanner = new Scanner(s.getInputstream());
			if(s.isConnected()){
				numberOfConnectedClients++;
			}
        ) {
			Socket actualSocket = clients.get(0);
			while(!actualSocket.isConnected()){
			
				if(clients.indexOf(actualSocket))
				clients.get()
			}
			//switch
			//checknumberofconnectedcliens
			//waitformessage
			//flush
			pw.flush();
			s.close();
        }
    }
}
