package java_0416_networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAdress_2 {
	
	public static void displayinformatuon(InetAddress address){
		System.out.println("-2016100876-");
		System.out.println("HostName :"+ address.getHostName());
		System.out.println("CanonicalHostName :" +address.getCanonicalHostName());
		System.out.println("Hostaddress(문자열처리) :"+ address.getHostAddress());
		System.out.print("Hostaddress(바이트처리) :");
		byte[] add = address.getAddress();
		for(int n:add) {
			int num = n <0 ?n+256 :n;
			System.out.print(num);
			if(n == add[add.length-1]) break;
			System.out.print(".");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress add = InetAddress.getLocalHost();
			displayinformatuon(add);
		}catch(UnknownHostException ex) {
			ex.printStackTrace();
		}
	}
}
