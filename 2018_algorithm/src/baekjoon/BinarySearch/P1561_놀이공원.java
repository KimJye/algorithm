package BinarySearch;

import java.util.Scanner;
//Ʋ�Ƚ��ϴ� ����...������ �ֱ�..
/*
 * ����: n���� �ְ� m������ 1�ν� ���̱ⱸ�� �ִ�. 
 * ���� ������ ���̰� Ÿ�� ���̱ⱸ�� ��ȣ�� ���ϴ� ����
 * ��, n��° �л��� ���° ���̱ⱸ(m)�� Ÿ�°�.
 * ���� : 
 * ù° �ٿ� N(1<= N<= 2,000,000,000)�� M(1<= M<= 10,000)�� ��ĭ�� ���̿� �ΰ� �־�����. 
 * ��° �ٿ��� �� ���̱ⱸ�� ���� �ð��� ��Ÿ���� M���� �ڿ����� ������� �־�����.
   ���� �ð��� 1 �̻� 30 ������ �ڿ����̸�, ������ ���̴�
 * Ǯ�� :
 * 	1.���� x���� ���Ѵ�.
 *  2.x�б��� ź �л����� n�� ���Ѵ�.
 *  3.�񱳷� �̺�Ž�� ����
 *  4.x�� ã�´�.
 *  5.x�� ã�� �ڿ��� x�ð� -1������ ž�� �л����� ���� üũ�Ѵ�.
 *  6.�׸��� x�� ���� �������� �ð��� �����ϸ� ž�� �л����� ++ ���ش�.
 *  7.n�� ������ �ش� �ε����� m�̴�.
 */
public class P1561_���̰��� {
	static long x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();// �л���
		int m = input.nextInt();// ���̱ⱸ ����

		int arr[] = new int[m];

		if(n<=m) {
			System.out.println(n);
			return;
		}

		for(int i=0; i<m; ++i) {
			arr[i]=input.nextInt();
		}

		long left=0;
		long right=20;//000000000*30; //�ִ� 30��
		long x=0;
		int sum=0;
		
		while(left<=right) { //�̺�Ž������ xã��
			sum=m; //x��(mid)���� ź �л� �� 0�п� �� Ÿ�ϱ� m
			
			long mid=(left+right)/2;
		
			for(int i=0;i<m;++i) {
				sum+=(mid/arr[i]);
			}
			
			if(sum>n) { //x�б��� ź �л����� n���� Ŭ��
				right=mid-1;
			}else if(sum<n) {
				left=mid+1;
			}else if(sum==n) {
				x=mid;
				break;
			}

		}
		//System.out.println(x);
		long before = (long)m;
		
		for(int i=0; i<m; ++i) {//x�� ã�� �ڿ��� x�ð� -1������ ž�� �л����� ���� üũ�Ѵ�.
			before+=((x-1)/arr[i]);
		}
		//System.out.println("before"+before);
		for(int i=0; i<m; ++i) {
			if(x%arr[i]==0) {
				before++;
				//System.out.println("before"+before);
			}
			if(before==n) {
				System.out.println(arr[i]);
				return;
			}
		}
		input.close();
		
	}

}
