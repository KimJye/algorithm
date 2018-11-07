/*
 *2018.03.18
 *������ 
	����:static void insert(int[] a, int index, int value) �޼ҵ带 �����϶�.
   	�迭 a���� index ��ġ ���� ������ �� ĭ�� �ڷ� �а� (�ݺ������� ����)
    index ��ġ�� value�� �־��.

    	�ð� ���⵵��? O(n)
 */

package array;

public class insert {

	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}

	static void insert(int[] a, int index, int value) {
		
		for(int i=a.length-1;i>index;--i){
			
			a[i]=a[i-1];
			
		}
		a[index]=value;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i)
			a[i] = i;

		insert(a, 5, -99);

		print(a);

	}

}
