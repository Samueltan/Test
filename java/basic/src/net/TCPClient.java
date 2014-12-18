package net;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
/**
 * Created by Samuel on 2014/11/22.
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        int port;
        int data;
        while(true) {
//            port = (int) (6000 + 1000 * Math.random());
            port = 6666;
            data = (int) (1000 * Math.random());
            Socket s = new Socket("127.0.0.1", port);

            // send data to server
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("From client: " + data);
            dos.flush();

            // receive data from server
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("Server -> Client: " + dis.readUTF());
            dis.close();
            dos.close();

            Thread.sleep(1000);
        }
    }
}
