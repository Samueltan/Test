package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

/**
 * Created by Samuel on 2014/11/22.
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Server is listening...");
        while(true) {
            Socket s = ss.accept();

            // Receive from client
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String data = dis.readUTF();
            System.out.println(s.getInetAddress() + ":" + s.getPort() + ", Client -> Server: " + data);

            // Send to client
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("From server: ********");
            dos.flush();

            dis.close();
            dos.close();

            s.close();
        }
    }
}
