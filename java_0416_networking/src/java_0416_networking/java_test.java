package java_0416_networking;

import java.util.Random;
import java.util.Scanner;

public class java_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add
		 /*Scanner input = new Scanner(System.in);
		 int x,y,sum;
		 System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		 x = input.nextInt();//int�� �б� Double,Line ���
		 System.out.print("ù��° ���ڸ� �Է��Ͻÿ�");
		 y = input.nextInt();
		 sum = x+y;
		 System.out.println(sum);
		 input.close();//ó���� ������
		 */
		short a = (short)0x55ff; //���22015
		short b = (short)0xf0ff; //����-3841

		 System.out.printf("%d %d \n",a,b); //10���� 22015 -3841
		 System.out.printf("%04x %04x \n",a,b);//16���� 55ff f0ff
		 //�������� int���̴�.4�ڸ���½� �պκ���0�� ������

		 System.out.printf("%04x \n",(~a));//��Ʈnot ffffaa00
		 System.out.printf("%04x \n",(short)(~a));//aa00
		 System.out.printf("%04x \n",(~b));//0f00 

		 System.out.printf("%04x \n",(a & b));//50ff 
		 System.out.printf("%04x \n",(a | b));//fffff5ff
		 System.out.printf("%04x \n",(a ^ b));//ffffa500
		 
		 //do-while��
		 Scanner scan = new Scanner(System.in);
		
		 int month;
		 do {
			 System.out.print("���Է�(1-12) :");
			 month = scan.nextInt();
		 }while(1 > month || month > 12);  
////�̰ǹ���???? �� &&�δ� �ȵɱ�...�ФФФФФФФ�
		 System.out.println("����� �Է� : "+month+"��");
		 scan.close();
				
	}

}
