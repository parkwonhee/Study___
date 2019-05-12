package javatest0404;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class networkinterface0509_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress address;
		try {
			address = InetAddress.getLocalHost();
			System.out.println(address);
			
			NetworkInterface network = NetworkInterface.getByInetAddress(address);
			System.out.println(network);
			
			byte[] macBuffer = network.getHardwareAddress();
			for(int num : macBuffer) {
				int new_num = num<0? num+256 : num;
				System.out.print(new_num +" ");
			}
			System.out.println("");
			for(int i=0 ; i < macBuffer.length; i++) {
				int new_num = macBuffer[i]<0?  macBuffer[i]+256 :  macBuffer[i];
				System.out.print(new_num +" ");
			}
			System.out.println("");

			System.out.print("MAC Address");
			for(byte num : macBuffer) {
				System.out.printf("%2x ",num);
			}
			System.out.println("");
			
			System.out.print("MAC Address");
			for(byte num : macBuffer) {
				System.out.printf(String.format("%2x ",num));
			}
			System.out.println("");
			
			System.out.print("MAC Address");
			StringBuilder sb = new StringBuilder();
			for(byte num : macBuffer) {
				sb.append(String.format("%2x ",num));
			}
			System.out.println(sb);
			
			
		} catch (UnknownHostException | SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
