package greedy;

/*
 * ���� : 1���� N������ ���� �� ���� �̿��ؼ� �ִ� �κ� ���� ������ ���̰� M�̰�, �ִ� �κ� ���� ������ ���̰� K�� ������ ���ϴ� ����
 * �� ������ �ִ� ���� 1���� ������ �� �ֱ� ������ N>=M+K-1�̾�� �Ѵ�.
 * ���� M+K-1 <=N <=MK�� ��쿡�� ���� ã�� �� �ִ�.
 * 1. ��������
 * 2. ���� M���. �� �� �׷쿡 ����ִ� ���� K���� �۰ų� ���ƾ� �ϸ�, ��� �� �׷��� ����ִ� ���� ������ K�̾�� �Ѵ�.
 * 3. �� �׷쿡 ����ִ� ���� ������ �����´�.
 * LIS(longest increasing subsequence) : 
 * selected part sequence is the maximum length, while selecting the number in the order that it is increasing.
 * �迭�� �����°� ������� ��Ǯ����
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
