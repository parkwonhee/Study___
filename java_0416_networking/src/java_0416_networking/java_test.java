package java_0416_networking;

import java.util.Random;
import java.util.Scanner;

public class java_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add
		 /*Scanner input = new Scanner(System.in);
		 int x,y,sum;
		 System.out.print("첫번째 숫자를 입력하시오");
		 x = input.nextInt();//int로 읽기 Double,Line 등등
		 System.out.print("첫번째 숫자를 입력하시오");
		 y = input.nextInt();
		 sum = x+y;
		 System.out.println(sum);
		 input.close();//처리가 빨라짐
		 */
		short a = (short)0x55ff; //양수22015
		short b = (short)0xf0ff; //음수-3841

		 System.out.printf("%d %d \n",a,b); //10진수 22015 -3841
		 System.out.printf("%04x %04x \n",a,b);//16진수 55ff f0ff
		 //연산결과는 int형이다.4자리출력시 앞부분의0은 생략됨

		 System.out.printf("%04x \n",(~a));//비트not ffffaa00
		 System.out.printf("%04x \n",(short)(~a));//aa00
		 System.out.printf("%04x \n",(~b));//0f00 

		 System.out.printf("%04x \n",(a & b));//50ff 
		 System.out.printf("%04x \n",(a | b));//fffff5ff
		 System.out.printf("%04x \n",(a ^ b));//ffffa500
		 
		 //do-while문
		 Scanner scan = new Scanner(System.in);
		
		 int month;
		 do {
			 System.out.print("월입력(1-12) :");
			 month = scan.nextInt();
		 }while(1 > month || month > 12);  
////이건뭐지???? 왜 &&로는 안될까...ㅠㅠㅠㅠㅠㅠㅠㅠ
		 System.out.println("사용자 입력 : "+month+"월");
		 scan.close();
				
	}

}
