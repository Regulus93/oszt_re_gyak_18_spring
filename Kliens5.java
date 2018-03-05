
import java.util.*;
import java.io.*;
import java.net.*;

public class Kliens5 {
    public static void main(String[] args) throws Exception {
        final String GEP = "127.0.0.1";
        final int PORT = 12345;
		
        try (
            Socket s = new Socket(GEP, PORT);
			Scanner sc = new Scanner(s.getInputStream());
        ) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

				System.out.println("I was the client number " + line +".");
            }
        }
    }
}
