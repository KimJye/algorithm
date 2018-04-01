package generic;

class MyArray2<T> {
	T[] a;
	
	public MyArray2(int size) {
		this.a=(T[])new Object[size];
	}
	
	public T get(int index) {
		return this.a[index];
	}
	
	public void put(int index, T value) {
		this.a[index]=value;
	}
}

public class Example2 {
	public static void main(String[]args) {
		MyArray2 <String> a = new MyArray2<String>(10);
		a.put(0, new String("zero"));
		a.put(1, "one");
		String s0 = a.get(0);
		String s1 = a.get(1);
		System.out.printf("%s %s\n", s0,s1);
	}
}
