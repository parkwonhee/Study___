package javatest0404;
//0502-1
class Shape{
	protected int x,y;
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	private int width, height;
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Circle extends Shape{
	private int radius;
	@Override
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Shape();
		Rectangle s2 = new Rectangle();
		
		if(s1 instanceof Shape)
			System.out.println("O");
		else System.out.println("X");
		
		if(s1 instanceof Rectangle)
			System.out.println("O");
		else System.out.println("X");
		
		if(s1 instanceof Circle)
			System.out.println("O");
		else System.out.println("X");
		
		if(s2 instanceof Circle)
			System.out.println("O");
		else System.out.println("X");
	}

}
