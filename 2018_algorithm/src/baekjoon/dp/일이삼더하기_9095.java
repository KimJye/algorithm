/*
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 * https://gist.github.com/Baekjoon/e019984a7c7f1ac6bd32
 */
package baekjoon.dp;

import java.util.Scanner;

public class 일이삼더하기_9095 {

	static int[]d;
	
	static int plus(int n) {
		d[0]=1;
		d[1]=1;
		d[2]=2;
		
		if(n<=1) return 1;
		
		if(d[n]>1) return d[n];
		
		return d[n]=(plus(n-1)+plus(n-2)+plus(n-3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int num  = input.nextInt();
		
		d = new int [11]; //11보다 작아야하는 조건
		
		while(num-- >0) {
			a=input.nextInt();
			plus(a);
			System.out.println(d[a]);
		}
	}

}
