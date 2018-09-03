/*
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오
 */
package baekjoon.io;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.close();
		
		int sum=0;
		
		for(int i=1;i<=n;++i) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
