import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//КЛИЕНТ
public class Main {
    public static void main(String[] args) {
        int port = 8079;
        String host = "127.0.0.1";

        try (Socket clientsocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()))) {
            out.println("Анна Прохватаева");
            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
