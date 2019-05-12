package javatest0404;

import java.net.MalformedURLException;
import java.net.URL;

public class urlTest {
	private static void proto(String url) {
		try {
			URL u = new URL(url);
			System.out.println(u.getProtocol()+" : supported");
			System.out.println(u.getHost());
			System.out.println(u.getHost().indexOf('.'));
		}catch(MalformedURLException ex) {
			String protocol = url.substring(0, url.indexOf(':'));
			System.out.println(protocol + " : not supported");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proto("http://www.adc.org");
		proto("https://www.korea.ac.kr");
		proto("ftp://ftp.kaist.ac.kt");
		proto("mailto://abc@gamil.com");
		proto("telent://dibner.ploy.edu/");
		proto("file://Windows/notepad.exe");
		proto("abc://www.abc.org/+/index.html");


	}

}
