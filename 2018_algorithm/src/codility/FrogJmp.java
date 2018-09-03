/*
 * For example, given:
 * X = 10
 * Y = 85
 * D = 30 
 * the function should return 3, because the frog will be positioned as follows:
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Assume that:
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ¡Â Y.
 * Complexity:
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
package codility;

public class FrogJmp {
	 public int solution(int X, int Y, int D) {
	      int count=0;
	      count=(Y-X)/D+1;
	      return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrogJmp frog= new FrogJmp();
		System.out.println("count°ª: "+ frog.solution(10, 85, 30));
	}

}
