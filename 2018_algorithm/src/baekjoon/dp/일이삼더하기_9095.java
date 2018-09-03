/*
 * ���� n�� �־����� ��, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.
 * https://gist.github.com/Baekjoon/e019984a7c7f1ac6bd32
 */
package baekjoon.dp;

import java.util.Scanner;

public class ���̻���ϱ�_9095 {

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
		
		d = new int [11]; //11���� �۾ƾ��ϴ� ����
		
		while(num-- >0) {
			a=input.nextInt();
			plus(a);
			System.out.println(d[a]);
		}
	}

}
