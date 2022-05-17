
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Server {

    public static void main(String[] args){

        try{
            ServerSocket ss=new ServerSocket(123, 1, InetAddress.getByName("127.0.0.1"));
            Socket s=ss.accept();//establishes connection
            var rawIn = s.getInputStream();
            var in = new BufferedReader(new InputStreamReader(rawIn, StandardCharsets.US_ASCII)); {

        while (true){
            String cmd = in.readLine();
            if (cmd == null) break; //client is hung up
            if (cmd.isEmpty()) continue; //empty line was sent
            System.out.println("Client sent: " + cmd);
        }
            }

        }catch(Exception e){System.out.println(e);}

    }
} 
