package javatest0404;

class Test implements RemontControl {
	boolean onOff =false;
	public void turnOn() {
		onOff = true;
	}
	public void turnOff() {
		onOff=false;
	}
}
public class Television{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.turnOn();
		System.out.println("전원상태"+t.onOff);
		t.turnOff();
		System.out.println("전원상태"+t.onOff);
	}
}
