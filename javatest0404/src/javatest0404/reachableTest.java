package javatest0404;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class reachableTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		String[] add= {"www.google.com","new.syu.ac.kr","www.naver.com"};
		//String add="www.goolge.com";
		for(String a : add) {
			InetAddress[] addresses = InetAddress.getAllByName(a);
			for(InetAddress inetAddress : addresses) {
				try{
					if(inetAddress.isReachable(10000)) {
						System.out.println(inetAddress + " is reachable");
					}else {
						System.out.println(inetAddress + "is not reachable");
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
