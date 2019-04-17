package java_0416_networking;

import java.util.Random;
import java.util.Scanner;

public class test0417 {
	public static void main(String[] args) {
		 Random generator = new Random();
		 Scanner input = new Scanner(System.in);
		 System.out.print("난수의 개수");
		int count = input.nextInt();
		int sum = 0;
		//Math.random()*100 난수를 구하는 두가지 방법
		for(int i=0;i<count;i++) {
			int number = (int)(Math.random()*100);
			//int number = generator.nextInt(100);
			System.out.println("난수" + number);
			sum +=number;
		}
		System.out.print("난수" + count+"개 의 합" +sum);
		input.close();
		
		int[] intArray = new int[10];
		intArray[1] = 2;
	}
}
