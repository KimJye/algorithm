/*
 * For example, given array A such that:
 * A[0] = 2
 *  A[1] = 3
 *  A[2] = 1
 *  A[3] = 5 
 * the function should return 4, as it is the missing element.
 * Assume that:
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1)
 
 */
package codility;

public class PermMissingElem {
	public int solution(int[] A) {
		
		int a=0;
		
		for(int i=0; i<=A.length+1; ++i) {
			a = a^i;
			System.out.println(a);
			System.out.println("======");
		}
		
		for(int i=0; i<A.length; ++i) {
			a = a^ A[i];
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermMissingElem per = new PermMissingElem();
		int array[] = {2,3,1,5};
		System.out.println(per.solution(array));

	}

}
