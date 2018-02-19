import java.util.*;
import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args ) throws Exception {
	// final String GEP = "localhost";
	final String GEP = "127.0.0.1";
	final int PORT = 12345;	
	// final int PORT = 65535;	
	
		try (
				Socket s = new Socket(GEP, PORT);
				Scanner input = new Scanner(new File("inputToTask3.txt"));
				PrintWriter pw = new PrintWriter(s.getOutputStream());
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
		) {
			while(input.hasNextLine()){
					pw.println(input.nextLine());
			}
			input.close();
		
			pw.flush(); //--> PrintWriter pufferébe került adatok továbbítása

			int calculatedNumber = Integer.parseInt(in.readLine());
			while(calculatedNumber!=0){
				System.out.println(calculatedNumber);
				calculatedNumber = Integer.parseInt(in.readLine());
			}
		}
	
	}
}