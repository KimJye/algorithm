package sort;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {
		Person[] a = new Person[] {
				new Person("ȫ�浿",18),
				new Person("����ġ",23),
				new Person("�Ӳ���",22),
		};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	}
}
