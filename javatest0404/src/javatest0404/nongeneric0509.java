package javatest0404;
class Box {
	private Object data;
	public void set(Object data) {
		this.data = data;
	}
	public Object get() {
		return data;
	}
}
public class nongeneric0509 {//generic �ƴѰ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.set("�ڹ�");
		String s = (String)b.get();
		System.out.println(s);
		
		b.set(10);
		Integer i = (Integer)b.get();
		System.out.println(i);
	}

}
