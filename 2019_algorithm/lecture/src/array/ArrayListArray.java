package array;

import java.util.ArrayList;

public class ArrayListArray {
	public static void main(String[] args) {
		ArrayList<Integer>[] a = new ArrayList[10];

		for (int i = 0; i < a.length; ++i) {
			a[i] = new ArrayList<Integer>();
			;
		}

		for (int i = 0; i < 100; ++i) {
			int index = i % a.length;
			a[index].add(i);
		}

		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
	}
}
