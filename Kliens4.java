
import java.util.*;
import java.io.*;
import java.net.*;

public class Kliens4 {
    public static void main(String[] args) throws Exception {
        final String GEP = "127.0.0.1";
        final int PORT = 12345;
		final String fileName = "in.txt";
		
        try (
            Socket s = new Socket(GEP, PORT);
            Scanner scSock = new Scanner(s.getInputStream());
            PrintWriter pwSock = new PrintWriter(s.getOutputStream());

            PrintWriter pwFile = new PrintWriter(new File("out.txt"));
        ) {
            pwSock.println(fileName);
            pwSock.flush();

            while (scSock.hasNextLine()) {
                String line = scSock.nextLine();

                pwFile.println(line);
            }
            pwFile.flush();
        }
    }
}
