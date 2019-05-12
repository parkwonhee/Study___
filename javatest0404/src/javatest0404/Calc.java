package javatest0404;
//½Ç½À1
public class Calc {
	
	public static int aba(int a) {
		return a>0?a:-a;
	}
	public static int max(int a,int b) {
		return(a>b)?a:b;
	}
	public static int min(int a,int b) {
		return (a>b)?b:a;
	}
}
class CalcTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calc.aba(-5));
		System.out.println(Calc.max(8,10));
		System.out.println(Calc.min(-3,-8));
	}
}
