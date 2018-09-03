/*
 * given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 * For example, given:
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3 
 * the function should return 1, as explained above.
 * Assume that:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N)
 */
package codility;

public class TapeEquilibrium {
	 
	public int solution(int[] A) {
		 int n = A.length;
		 
		 if(n<0) return 0;
		
		 
		 int sum=0;
		 
		 for(int i=0; i<n; ++i) {
			 sum+=A[i];
		 }
		 
		 int sum_left=0;
		 int sum_right=0;
		 int abs=0;//절댓값
		 int value=Integer.MAX_VALUE;//최종 값(최소값을 구하기 위해)
		 
		 for(int j=1; j<n; ++j) {
			 sum_left += A[j-1];
			 sum_right = sum - sum_left;
			 abs= Math.abs(sum_left-sum_right);
			 value = Math.min(value, abs);
		 }
		 return value;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TapeEquilibrium tape = new TapeEquilibrium();
		int array[] = {3,1,2,4,3};
		System.out.println(tape.solution(array));
	}

}
