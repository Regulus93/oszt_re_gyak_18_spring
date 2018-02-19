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
			String be = sc.nextLine();
			System.out.println(be);
			pw.println(be);
		}
	
	}
}