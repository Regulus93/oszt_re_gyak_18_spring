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
			List<Integer> numberList = new ArrayList<>();
			
			while(sc.hasNextInt()){
				int num = sc.nextInt();
				numberList.add(num);
			}
			
			for (int num : numberList){
				pw.println(num);
				pw.flush();
			}
		}
	
	}
	
	private static int calculate(int n){
		return 2*n+1;
	}
}