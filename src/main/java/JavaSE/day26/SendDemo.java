package JavaSE.day26;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "hello UDP!".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("169.254.65.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        ds.send(dp);
        ds.close();
    }
}
