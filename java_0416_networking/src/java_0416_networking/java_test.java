package java_0416_networking;

import java.util.Random;
import java.util.Scanner;

public class java_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add
		 /*Scanner input = new Scanner(System.in);
		 int x,y,sum;
		 System.out.print("湛腰属 収切研 脊径馬獣神");
		 x = input.nextInt();//int稽 石奄 Double,Line 去去
		 System.out.print("湛腰属 収切研 脊径馬獣神");
		 y = input.nextInt();
		 sum = x+y;
		 System.out.println(sum);
		 input.close();//坦軒亜 察虞像
		 */
		short a = (short)0x55ff; //丞呪22015
		short b = (short)0xf0ff; //製呪-3841

		 System.out.printf("%d %d \n",a,b); //10遭呪 22015 -3841
		 System.out.printf("%04x %04x \n",a,b);//16遭呪 55ff f0ff
		 //尻至衣引澗 int莫戚陥.4切軒窒径獣 蒋採歳税0精 持繰喫

		 System.out.printf("%04x \n",(~a));//搾闘not ffffaa00
		 System.out.printf("%04x \n",(short)(~a));//aa00
		 System.out.printf("%04x \n",(~b));//0f00 

		 System.out.printf("%04x \n",(a & b));//50ff 
		 System.out.printf("%04x \n",(a | b));//fffff5ff
		 System.out.printf("%04x \n",(a ^ b));//ffffa500
		 
		 //do-while庚
		 Scanner scan = new Scanner(System.in);
		
		 int month;
		 do {
			 System.out.print("杉脊径(1-12) :");
			 month = scan.nextInt();
		 }while(1 > month || month > 12);  
////戚闇更走???? 訊 &&稽澗 照吃猿...ばばばばばばばば
		 System.out.println("紫遂切 脊径 : "+month+"杉");
		 scan.close();
				
	}

}
