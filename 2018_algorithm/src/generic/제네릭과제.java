/*
 * 20180401
 * 값은 value일때 put과 get메소드를 구현하는 클래스를 제네릭 형식으로 구현하라
 */
package generic;

import java.util.Arrays;

class generic<T>{
	T[] array;
	
	generic(int size){
		array=(T[])new Object[size];
	}
	void put(int index, T value) {
		this.array[index]=value;
	}
	
	T get(int index) {
		return this.array[index];
	}
}
public class 제네릭과제 {
	
	public static void main(String[]args) {
		generic g = new generic(10);
		g.put(0, "김지혜");
		g.put(1,"이예지");
		g.put(2,"이혜지");
		g.put(3,"명혜연");
		System.out.printf("%s %s %s %s\n",g.get(0),g.get(1),g.get(2),g.get(3));
	}
}
