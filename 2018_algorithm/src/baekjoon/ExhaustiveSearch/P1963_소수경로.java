package ExhaustiveSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * ���ڸ� �Ҽ� n�� m�� �־����� �� n�� m���� �ٲٴ� �ּҺ�ȯȽ�� ���ϱ�
 * �ѹ��� n���� ���ڸ��� �ٲ� �� �ְ� �ٲ� ���ڵ� �Ҽ��̾�� �Ѵ�.
 * �� �ڸ����� ���� ��, ���ڸ� �ٲ㰡�鼭 �Ҽ��� ������ ����.
 * 1000���� 10000���� �Ҽ����� �ƴ��� ���ѵ� Ǯ��.
 * 1000�� �ڸ����� 1�ڸ����� ���� �����Ҷ� �Ҽ��鼭1000���� �����ʰ� ������ �˻����� ������ 
 * ť�� ��Ƽ� ���� ���ö����� bfs
 */
public class P1963_�Ҽ���� {

	public static int change(int num, int index, int digit) {
		if (index == 0 && digit == 0) {
			return -1;
		}
		String s = Integer.toString(num);
		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(index, (char)(digit + '0'));
		return Integer.parseInt(sb.toString());
	}
	
	public static int bfs(boolean[] prime, int[] value, int start, int target) {
		boolean [] check = new boolean[100001];
		value[start]=0;
		check[start]=true;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		while(!q.isEmpty()) {
			int x = q.remove();
			for(int i=0; i<4; ++i) {
				for(int j=0; j<=9; ++j) {
					int next = change(x, i, j);
					if(next!=-1) {
						if(prime[next] && check[next]==false ) {
							q.add(next);
							value[next] = value[x]+1;
							check[next] = true;
						}
					}
				}
			}
			if(x==target) break;
			if(value[target]==-1) {
				return -1;
			}
		}
		return value[target];


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean [] prime = new boolean[10001];
		int value [] = new int[10001];

		//�Ҽ� �ƴѰ͵� true�� ���� �س���
		for(int i=2; i<10001; ++i) {
			if(prime[i]==false) {
				for(int j=i*i; j<10001; j+=i) {
					prime[j] = true;
				}
			}
		}
		for(int i=0; i<=10000; ++i) {
			prime[i] = !prime[i];
		}
		int num = sc.nextInt();
		while(num-- >0) {
			int start = sc.nextInt();
			int target = sc.nextInt();

			System.out.println(bfs(prime,value,start,target));
		}
	}

}
