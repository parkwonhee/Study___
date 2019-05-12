package javatest0404;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip4and6Test {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		try {
			InetAddress address;
			
			address = InetAddress.getByName("74.125.21.105");
			System.out.println(address);
			
			address = InetAddress.getByName("::ffff:4a7d:1569");
			System.out.println(address);
			
			address = InetAddress.getByName("::ffff:74.125.21.105");
			//버전4와 6 이 호환이 가능한가???????????
			System.out.println(address);
			
			InetAddress names[] = InetAddress.getAllByName("www.naver.com");
			for(InetAddress add : names) {
				if((add instanceof Inet6Address) && ((Inet6Address)add).isIPv4CompatibleAddress()){
					System.out.println(add + " is IPv4 Compatible Address");
				}else {
					System.out.println(add + " is not a IPv4 Compatible Address");

				}
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
