package java_0416_networking;

import java.util.Scanner;

public class arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("5���� ���� �Է� : ");
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0;i <arr.length;i++ ) {
			arr[i] = input.nextInt();
			sum += i;

		}
		for(int j:arr) 
			System.out.println(j+" "+arr[j]+" ");
		double avg = (double)sum/arr.length; //��������ȯ
		System.out.print("��� : "+avg);
		input.close();
		
		int arr1[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};//�ʱ�ȭ
		for(int[] i : arr1)
			for(int j : i) {
				System.out.print(j+" "+arr1[1][1]+" ");//+arr[i][j]
				}
	}

}
