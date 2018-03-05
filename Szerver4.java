
import java.util.*;
import java.io.*;
import java.net.*;

public class Szerver4 {
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
            Scanner clientInputScanner = new Scanner(s.getInputStream());
            PrintWriter pw = new PrintWriter(s.getOutputStream());
        ) {
            if(clientInputScanner.hasNextLine()) {
                String fileName = clientInputScanner.nextLine();
				readAndSendFileToClient(pw,fileName);
            }
        }
    }
	
	private static void readAndSendFileToClient(PrintWriter pw, String fileName){
		try(
			Scanner fileReadScanner = new Scanner(new File(fileName));
		) {
			while(fileReadScanner.hasNextLine()){
				pw.println(fileReadScanner.nextLine());
			}
			pw.flush();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: \"" + fileName + "\"\nException: " + e);
		}
	}
}
