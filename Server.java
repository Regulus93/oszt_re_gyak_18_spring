import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args ) throws Exception {
	final int PORT = 12345;
	//final int PORT = 65535;

		try (
				ServerSocket ss = new ServerSocket(PORT); //ServerSocket --> eroforras, try blokkba kell tenni
				Socket s = ss.accept(); //dokkolónyilás, program itt megáll, socket-tel tér vissza
				Scanner sc = new Scanner(s.getInputStream());
				PrintWriter pw = new PrintWriter(s.getOutputStream());
				
		) {
			if(sc.hasNextLine()){
				String sentByClient = sc.nextLine();
				int n = Integer.parseInt(sentByClient);
				pw.println(Server.calculate(n));
			}

			pw.flush();
		}
	
	}
	
	private static int calculate(int n){
		return 2*n+1;
	}
}