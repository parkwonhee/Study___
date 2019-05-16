package javatest0404_2;
class Car{
	void drive() {
		System.out.println("I'm a car");
	}
}
public class CarTest extends Car implements Flyable{
	public void fly() {
		System.out.println("I'm flying");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarTest a = new CarTest();
		a.drive();
		a.fly();
	}

}
