package net;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Samuel on 2014/11/24.
 */
public class UDPServer {
    public static void main(String[] args) throws Exception{
        byte[] buff = new byte[1024];
        ByteArrayInputStream bis = new ByteArrayInputStream(buff);
        DataInputStream dis = new DataInputStream(bis);

        DatagramPacket dp = new DatagramPacket(buff, buff.length);
        DatagramSocket ds = new DatagramSocket(5678);

        while(true){
            ds.receive(dp);
            long n = dis.readLong();
            System.out.println("**** " + dp.getLength());
            System.out.println("n = " + n);
            dis.close();
//            ds.close();
        }

    }
}
