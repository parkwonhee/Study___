package javatest0404;

import java.util.ArrayList;
import java.util.Scanner;

public class genericarray0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<4; i++) {
			System.out.println("�̸��Է�>>");
			String s = scan.next();
			a.add(s);
		}
		
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		
		for(int i = 0; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length());
				longestIndex = i;
		}
		System.out.println("\n ���� �� �̸� : "+a.get(longestIndex));

	}

}
