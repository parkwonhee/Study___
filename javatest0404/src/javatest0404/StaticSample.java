package javatest0404;

public class StaticSample {
	
	public int n;
	private void g() {
		m=20;
	}
	private void h() {
		m=30;
	}
	static public int m;//공유해야될 값
	static private void f() {//다른 클래스라면 public 으로 바꿔준다.
		m=5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample s1,s2;
		s1 = new StaticSample();
		s1.n=5;
		s1.m=50;
		System.out.println(s1.m);
		
		s2 = new StaticSample();
		s2.n=8;
		s2.h();
		s2.f();
		System.out.println(s2.m);
	}

}
