package javatest0404;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

public class enumeration0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Enumeration<NetworkInterface> ifs = NetworkInterface.getNetworkInterfaces();
			
			System.out.print("name \t Display name\n");
			
			for(NetworkInterface e : Collections.list(ifs)) {
				System.out.printf("%s \t %s \n",e.getName(),e.getDisplayName());
				
				Enumeration<InetAddress> addresses = e.getInetAddresses();
				for(InetAddress inetAdds : Collections.list(addresses)) {
					System.out.printf("InetAddress : %s\n",inetAdds);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
