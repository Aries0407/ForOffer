package JavaSE.day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SendDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader((new InputStreamReader((System.in))));
        String line = null;
        while((line = br.readLine())!=null){
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length,
                    InetAddress.getByName("169.254.65.1"),12345);
            ds.send(dp);
        }

        ds.close();
    }
}
