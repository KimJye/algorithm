package generic;

class MyArray1 {
	Object[] a;
	
	public MyArray1(int size) {
		this.a=new Object[size];
	}
	
	public Object get(int index) {
		return this.a[index];
	}
	
	public void put(int index, Object value) {
		this.a[index]=value;
	}
}

public class Example1 {
	public static void main(String[]args) {
		MyArray1 a = new MyArray1(10);
		a.put(0, new String("zero"));
		a.put(1, "one");
		String s0 = (String)a.get(0);
		String s1 = (String)a.get(1);
		System.out.printf("%s %s\n", s0,s1);
	}
}
