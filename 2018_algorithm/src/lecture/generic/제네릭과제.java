/*
 * 20180401
 * ���� value�϶� put�� get�޼ҵ带 �����ϴ� Ŭ������ ���׸� �������� �����϶�
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
public class ���׸����� {
	
	public static void main(String[]args) {
		generic g = new generic(10);
		g.put(0, "������");
		g.put(1,"�̿���");
		g.put(2,"������");
		g.put(3,"������");
		System.out.printf("%s %s %s %s\n",g.get(0),g.get(1),g.get(2),g.get(3));
	}
}
