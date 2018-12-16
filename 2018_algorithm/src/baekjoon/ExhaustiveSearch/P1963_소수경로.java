package ExhaustiveSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 네자리 소수 n과 m이 주어졌을 때 n을 m으로 바꾸는 최소변환횟수 구하기
 * 한번에 n에서 한자리만 바꿀 수 있고 바꾼 숫자도 소수이어야 한다.
 * 네 자리수가 있을 때, 숫자를 바꿔가면서 소수를 만들어가는 문제.
 * 1000부터 10000까지 소수인지 아닌지 구한뒤 풀기.
 * 1000의 자리부터 1자리까지 숫자 변경할때 소수면서1000보다 작지않고 이전에 검사한적 없으면 
 * 큐에 담아서 값이 나올때까지 bfs
 */
public class P1963_소수경로 {

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

		//소수 아닌것들 true로 구분 해놓기
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
