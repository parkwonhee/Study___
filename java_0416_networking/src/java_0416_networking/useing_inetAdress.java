package java_0416_networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class useing_inetAdress {
	public static void displayinformatuon(InetAddress address){
		System.out.println("--InetAddress information--");
		System.out.println("CanonicalHostName :" +address.getCanonicalHostName());
		System.out.println("Hostaddress :"+ address.getHostAddress());
		System.out.println("HostName :"+ address.getHostName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress[] addresss = InetAddress.getAllByName("www.naver.com");
			
			System.out.println(addresss);
			for(InetAddress i: addresss) {
			displayinformatuon(i);
			}
		}catch(UnknownHostException ex) {
			ex.printStackTrace();
		}
	}
}
		/*--InetAddress information--
		CanonicalHostName :125.209.
		Hostaddress :125.209.
		HostName :www.nav
		--InetAddress information--
		CanonicalHostName :210.89.
		Hostaddress :210.89.
		HostName :www.nav*/
