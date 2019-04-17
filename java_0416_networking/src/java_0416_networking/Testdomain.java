package java_0416_networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

class test3{
	test3(){
		try {
			InetAddress add = InetAddress.getLocalHost();
			System.out.println("test3 "+add);
		}catch(UnknownHostException ex) {
			System.out.println("Could not find this computer's address");
		}
	}
}

class test4 {
	test4() throws UnknownHostException{
		byte[] address = {107,23,(byte)216,(byte)196};
		InetAddress add = InetAddress.getByAddress(address);
		InetAddress name_add = InetAddress.getByAddress("Test.com",address);
		System.out.println("test4 "+add);
		System.out.println("test4 "+name_add);//127보다 큰 값은 음수로나타내느것을 막기
	}
}

class test5{
	test5() throws UnknownHostException{
		InetAddress machine1 = InetAddress.getLocalHost();
		String host1 = machine1.getHostName();
		System.out.println("test5() "+host1);
	}
}

class test6{
	test6() throws UnknownHostException{
		InetAddress machine2 = InetAddress.getLocalHost();
		String host2 = machine2.getCanonicalHostName();  //임의로 정해줘야지 다른값이 나온다
		System.out.println("test6() " +host2);
	}
}

class test7{
	test7() throws UnknownHostException{
		InetAddress machine3 = InetAddress.getLocalHost();
		String host3 = machine3.getHostAddress();
		System.out.println("test7() "+ host3);
	}
}

class test8{
	test8() throws UnknownHostException{
		InetAddress machine4 = InetAddress.getByName("naver.com");
		byte[] address = machine4.getAddress();
		System.out.println("test8() "+ address);
		
		System.out.print("test9() ");
		for(int i=0;i<4; i++) {
			System.out.print(address[i]+" ");
		}
		
		System.out.print("\ntest10() ");
		for(int i=0;i<4; i++) {
			int num = address[i] <0 ?address[i] +256 :address[i];
			System.out.print(num+" ");
		}
		
		System.out.print("\ntest11() ");
		for(int n:address) {
			int num2 = n <0 ?n+256 :n;
			System.out.print(num2+" ");
		}
	}
}

public class Testdomain {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getByName("www.naver.com");
		System.out.println("test1 "+address);
		//test1 www.naver.com/125.209.222.141
		InetAddress[] address2 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress add: address2)
		System.out.println("address2 "+add);
		//address2www.naver.com/125.
		//address2www.naver.com/125.
		
		test3 t3 = new test3();   //test3 LAPTOP/172
		test4 t4 = new test4();   //test4 Test.com/107.23.216.196
		test5 t5 = new test5();   //test5() LAPTOP
		test6 t6 = new test6();   //test6() LAPTOP
		test7 t7 = new test7();   //test7() 172.30.5
		test8 t8 = new test8();   
		/*test8() [B@70dea4e
		test9() 125 -47 
		test10() 125 209 
		test11() 125 209 */
	}
}
