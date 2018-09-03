package codility;

import java.util.Arrays;

public class CyclicRotation {
	public int[] solution(int[] A, int k) {
		int[] a = new int[A.length];
		
		for(int i=0;i<A.length;++i) {
			int index=(i+k)%A.length;
			a[index]=A[i];
		}
		return a;
	}
	public static void main(String [] agrs) {
		CyclicRotation cr = new CyclicRotation();
		int array []= {3,8,9,7,6};
		int k=3;
		System.out.println(Arrays.toString(cr.solution(array, k)));
	}
}
