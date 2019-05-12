package javatest0404;

import java.util.ArrayList;
import java.util.Collections;

public class array0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<6; i++)
			list.add(i,(int)(Math.random()*45+1));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("---오른차순정렬---");
		System.out.println(list);

		Collections.reverse(list);
		System.out.println("---내림차순정렬---");
		System.out.println(list);

	}

}
