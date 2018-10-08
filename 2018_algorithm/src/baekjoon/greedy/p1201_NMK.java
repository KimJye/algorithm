package greedy;

/*
 * 문제 : 1부터 N가지의 수를 한 번씩 이용해서 최대 부분 증가 수열의 길이가 M이고, 최대 부분 감소 수열의 길이가 K인 수열을 구하는 문제
 * 두 수열은 최대 정수 1개를 공유할 수 있기 때문에 N>=M+K-1이어야 한다.
 * 따라서 M+K-1 <=N <=MK인 경우에만 답을 찾을 수 있다.
 * 1. 오름차순
 * 2. 수를 M등분. 이 때 그룹에 들어있는 수는 K보다 작거나 같아야 하며, 적어도 한 그룹은 들어있는 수의 개수가 K이어야 한다.
 * 3. 각 그룹에 들어있는 수의 순서를 뒤집는다.
 * LIS(longest increasing subsequence) : 
 * selected part sequence is the maximum length, while selecting the number in the order that it is increasing.
 * 배열을 나누는게 어려워서 못풀엇음
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1201_NMK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt(); // num
		int m = input.nextInt(); // LIS
		int k = input.nextInt(); // LDS
		
		if(!(m+k-1<=n && n<=m*k)) {
			System.out.println(-1);
			return;
		}
		
		int [] num = new int[n];
		
		for(int i=0; i<n; ++i) {
			num[i]=i+1;
		}
		
		List<Integer> group = new ArrayList<Integer>();
		
		int index=0; // begin index on both group
		for(int i=0; i<m; ++i) {
			
		}
		
		
	}

}
