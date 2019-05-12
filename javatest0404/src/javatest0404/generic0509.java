package javatest0404;
class Boxes <T> {
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}
public class generic0509 {//generic 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxes <String> b = new Boxes <String>();
		Boxes <String> b = new Boxes <>();
		b.set("ÀÚ¹Ù");
		String s = b.get();
		System.out.println(s);
		
		//Boxes <Integer> b2 = new Boxes <Integer>();
		Boxes <Integer> b2 = new Boxes <>();
		b2.set(10);
		Integer i = b2.get();
		System.out.println(i);
	}

}
