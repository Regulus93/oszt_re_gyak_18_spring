import java.util.*;
import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args ) throws Exception {
	final int PORT = 12345;
	//final int PORT = 65535;
	String text = args[0];
		try (
				ServerSocket ss = new ServerSocket(PORT); //ServerSocket --> eroforras, try blokkba kell tenni
				Socket s = ss.accept(); //dokkolónyilás, program itt megáll, socket-tel tér vissza
				Scanner sc = new Scanner(s.getInputStream());
				PrintWriter pw = new PrintWriter(s.getOutputStream());
				
		) {
			String be = sc.nextLine();
			int numberSentByClient = Integer.parseInt(be);
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < numberSentByClient; ++i){
				sb.append(text);
			}
			sb.append('\n');
			
			pw.println(sb.toString());
		}
	
	}
}