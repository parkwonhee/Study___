package javatest0404;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class addressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] adds = {"127.0.0.1","0::1","www.oreily.com","224.0.2.1","ff01:0:0:0:0:0:0:1","224.0.0.0","ff05:0:0:0:0:0:0:101","239.192.0.0"};
		
		for(int i=0; i<adds.length; i++) {
			try {
				InetAddress address = InetAddress.getByName(adds[i]);
				if(address.isAnyLocalAddress())System.out.println(address + " : wildcard address");
				if(address.isLoopbackAddress())System.out.println(address + " : loopback address");
				if(address.isLinkLocalAddress())System.out.println(address + " : lick-local address");
				else if(address.isSiteLocalAddress())System.out.println(address + " : site-local address");
				else System.out.println(address + " : global address");
				
				if(address.isMulticastAddress()) {
					if(address.isMCGlobal())System.out.println(address + " : global multicast address");//MC는 멀티캐스트
					else if(address.isMCOrgLocal())
						System.out.println(address + " : organization-wide multicast address");
					else if(address.isMCSiteLocal())
						System.out.println(address + " : site-wide multicast address");
					else if(address.isMCLinkLocal())
						System.out.println(address + " : subnet-wide multicast address");
					else if(address.isMCNodeLocal())
						System.out.println(address + " : node-wide multicast address");
					else System.out.println(address + " : unknown multicast address");
				}

			}catch(UnknownHostException e) {
				System.err.println("could not resolve "+adds[i]);
			}
			
		}

	}

}
