import java.util.Scanner;
import java.net.InetAddress; 
import java.util.ArrayList;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.HexFormat;

public class TestConn {

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 123); // try opening TCP/IP Connection
            OutputStream output = socket.getOutputStream();
            byte[] data = HexFormat.of().parseHex("48656c6c6f20576f726c6421");
            output.write(data);
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("This is a message sent to the server");
            writer.println("So is this");
            writer.println("aaaaaaaaaaaand so is this");
            writer.println("netstat -ano");
            socket.close();
        } catch (Exception ex) {  
       System.err.println(ex);  
     }
    }
}
