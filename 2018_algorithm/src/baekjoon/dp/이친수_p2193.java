/*
 * 0�� 1�θ� �̷���� ���� �������� �Ѵ�. 
 * �̷��� ������ �� Ư���� ������ ���� �͵��� �ִµ�, �̵��� ��ģ��(pinary number)�� �Ѵ�. 
 * ��ģ���� ������ ������ �����Ѵ�.
1.��ģ���� 0���� �������� �ʴ´�.
2.��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�. 
��, 11�� �κ� ���ڿ��� ���� �ʴ´�.

���� ��� 1, 10, 100, 101, 1000, 1001 ���� ��ģ���� �ȴ�. 
������ 0010101�̳� 101101�� ���� 1, 2�� ��Ģ�� ����ǹǷ� ��ģ���� �ƴϴ�.

N(1 �� N �� 90)�� �־����� ��, N�ڸ� ��ģ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�
https://gist.github.com/Baekjoon/7fbfd8d0963139d638de
 */
package baekjoon.dp;

import java.util.Scanner;

public class ��ģ��_p2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[]d = new long[n+1];
		d[0]=0;
		d[1]=1;
		
		for(int i=2; i<=n; ++i) {
			d[i]=d[i-1]+d[i-2];
		}
		System.out.println(d[n]);
	}

}
