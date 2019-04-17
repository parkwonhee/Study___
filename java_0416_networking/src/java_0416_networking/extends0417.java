package java_0416_networking;
//class Shape {
//	public Shape(String msg) { System.out.println("Shape() : " + msg); }
//	public Shape() { System.out.println("Shape 생성자() "); } 
//}
//class Rectangl extends Shape { 
	//public Rectangl(){ // 컴파일러가 Shape();을 자동 처리 
		//super(); //super("Rectangle!"); 
	//System.out.println("Rectangle 생성자()"); }
//	public Rectangl(String msg) { System.out.println("rectangle() : " + msg);}
//}
class A { 
	public A() { System.out.println("생성자 A"); } 
	public A(int x) { System.out.println("매개변수 생성자 A"+":"+x); } 
} 
class B extends A { 
	public B() { System.out.println("생성자 B"); } 
	public B(int x) { super(x); System.out.println("매개변수 생성자 B"+":"+x); } 
}
class Parent { public void print() { System.out.println("부모 print()"); } }
class Child extends Parent { @Override public void print() {    
	//super.print(); 
	System.out.println("자식 print()"); } }

class Shape {
	int x,y;
	public void draw() {
		System.out.println("Shape");
	}
}
class Circle2 extends Shape{
	int x=1,y=1;
	@Override
	public void draw() {
		System.out.println("Cricle");
	}
}
class Rectangle2 extends Shape{
	int x=2,y=2;
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Triangle extends Shape{
	int x=3,y=3;
	public void draw() {
		System.out.println("Triangle");
	}
}
public class extends0417 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rectangl r = new Rectangl("mmmm");
		B b = new B(5);
		Child obj = new Child(); obj.print();
		Shape s1 = new Circle2();	
		Shape s2 = new Rectangle2();
		Shape s3 = new Triangle();
		System.out.println(s1.x+" , "+s1.y);
		System.out.println(s2.x+" , "+s2.y);
		System.out.println(s3.x+" , "+s3.y);
		s1.draw();
		s2.draw();
		s3.draw();
	}
}
