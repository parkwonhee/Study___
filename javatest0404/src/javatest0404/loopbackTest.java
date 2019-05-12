package javatest0404;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class loopbackTest {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub
		try {
			InetAddress add1,add2,add3;
			
			add1 = Inet4Address.getByName("0.0.0.0");
			System.out.println(add1.isAnyLocalAddress());
			add1 = Inet4Address.getByName("172.217.31.228");
			System.out.println(add1.isAnyLocalAddress());
			
			add2 = Inet4Address.getByName("127.0.0.1");
			System.out.println(add2.isLoopbackAddress());
			add2 = Inet4Address.getByName("172.217.31.228");
			System.out.println(add2.isLoopbackAddress());
			
			add3 = Inet4Address.getByName("naver.com");
			byte buffer[] = add1.getAddress();
			
			if(buffer.length <= 4)
				System.out.println("IPv4 Address");
			else
				System.out.println("Ipv6 Address");
			
			if(add3 instanceof Inet4Address)
				System.out.println("IPv4 Address");
			else
				System.out.println("Ipv6 Address");
		}catch(UnknownHostException e) {
			e.printStackTrace();

		}
		

	}

}
