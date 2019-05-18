package me.moocar.logbackgelf.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class GraylogUdpServerMain {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(8110);
        while (true) {
            DatagramPacket request = new DatagramPacket(new byte[1024], 1024);
            socket.receive(request);
            System.out.println(new String(request.getData(), request.getOffset(), request.getLength()));
        }
    }

}
