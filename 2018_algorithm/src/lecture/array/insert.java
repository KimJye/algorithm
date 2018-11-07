/*
 *2018.03.18
 *김지혜 
	문제:static void insert(int[] a, int index, int value) 메소드를 구현하라.
   	배열 a에서 index 위치 뒤의 값들을 한 칸씩 뒤로 밀고 (반복문으로 구현)
    index 위치에 value를 넣어라.

    	시간 복잡도는? O(n)
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
