package javatest0404;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class networkinterface0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			System.out.println(address);
			
			NetworkInterface network = NetworkInterface.getByInetAddress(address);
			System.out.println(network);
			
			NetworkInterface network2 = NetworkInterface.getByName("wlan2");
			System.out.println(network2);
			
			System.out.println(network.getName());
			System.out.println(network.getDisplayName());
		} catch (UnknownHostException | SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
