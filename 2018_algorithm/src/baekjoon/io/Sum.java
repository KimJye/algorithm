/*
 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
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
