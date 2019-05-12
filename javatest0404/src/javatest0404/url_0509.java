package javatest0404;

import java.net.MalformedURLException;
import java.net.URL;

public class url_0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL u1 = new URL("http://www.naver.com");
			URL u2 = new URL("http://naver.co.kr");
			URL u3 = new URL("http://naver.com");
			
			if(u1.equals(u2)) {
				System.out.println(u1+" = "+u2);
			}else {
				System.out.println(u1+" != "+u2);
			}
			
			if(u1.equals(u3)) {
				System.out.println(u1+" = "+u3);
			}else {
				System.out.println(u1+" != "+u3);
			}

		}catch(MalformedURLException ex) {
			System.err.println(ex);
		}
	}
}
