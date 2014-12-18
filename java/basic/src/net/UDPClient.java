package net;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * Created by Samuel on 2014/11/24.
 */
public class UDPClient {
    public static void main(String[] args) throws Exception{
        long n = 1307;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeLong(n);
        byte[] buff = bos.toByteArray();
        System.out.println("len = " + buff.length);
        DatagramPacket dp = new DatagramPacket(buff, 0, buff.length,
                new InetSocketAddress("127.0.0.1", 5678));

        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}
