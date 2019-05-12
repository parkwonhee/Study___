package javatest0404;

import java.net.URI;
import java.net.URISyntaxException;

public class uriTest {
	private static void displayURI(URI uri) {
		System.out.println("<URI Informaiton>");
		System.out.println("Aythority : "+uri.getAuthority());
		System.out.println("Scheme : "+ uri.getScheme());
		System.out.println("SchemeSpecificPart : "+uri.getSchemeSpecificPart());
		System.out.println("Host : "+uri.getHost());
		System.out.println("Path : "+uri.getPath());
		System.out.println("getQuery : "+uri.getQuery());
		System.out.println("getFragment : "+uri.getFragment());
		System.out.println("getUserInfo : "+uri.getUserInfo());
		System.out.println("normalize : "+uri.normalize());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URI uri = new URI("https://www.naver.com/index.html");
			displayURI(uri);
		}catch(URISyntaxException ex) {
			ex.printStackTrace();
		}	
	}
}
/*<URI Informaiton>
Aythority : www.naver.com
Scheme : https//protocol Á¾·ù
SchemeSpecificPart : //www.naver.com/index.html
Host : www.naver.com
Path : /index.html
getQuery : null
getFragment : null
getUserInfo : null
normalize : https://www.naver.com/index.html*/