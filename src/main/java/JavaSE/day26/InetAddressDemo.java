package JavaSE.day26;

import java.net.InetAddress;
import java.net.UnknownHostException;

public interface InetAddressDemo {
    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName("10.27.4.74");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String ip = address.getHostAddress();
        String name = address.getHostName();
        System.out.println(name+"---"+ip);

    }
}
