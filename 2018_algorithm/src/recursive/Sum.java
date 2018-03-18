/*
 * 2018/03/11
 * 1부터 n까지 합계를 계산하는 sum 함수를 구현하라.
 * 재귀 호출로 구현하라.
 * 구현한 메소드의 시간 복잡도는? ->O(n)
 */


package recursive;

public class Sum {

	static int sum(int n){
		int sum=0;
		
		if(n==1) return 1;
		sum=n+sum(n-1);
		return sum;
		
		/*
		 * 더 간단하게 하기.
		 * if(n==1) return 1;
			return n+sum(n-1);
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3; i<=10;++i){
			System.out.printf("%d %d\n", i,sum(i));
		}
	}

}
