package java_0416_networking;

import java.util.Random;
import java.util.Scanner;

public class test0417 {
	public static void main(String[] args) {
		 Random generator = new Random();
		 Scanner input = new Scanner(System.in);
		 System.out.print("������ ����");
		int count = input.nextInt();
		int sum = 0;
		//Math.random()*100 ������ ���ϴ� �ΰ��� ���
		for(int i=0;i<count;i++) {
			int number = (int)(Math.random()*100);
			//int number = generator.nextInt(100);
			System.out.println("����" + number);
			sum +=number;
		}
		System.out.print("����" + count+"�� �� ��" +sum);
		input.close();
		
		int[] intArray = new int[10];
		intArray[1] = 2;
	}
}
