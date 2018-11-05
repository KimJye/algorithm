package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ���� ������ �� ������ ������ �Ÿ��� Ŀ�� ���� �������� ������ �پ���.
 * c���� �����⸦ n���� ���� ������ ��ġ�ؼ�, ���� ������ �� ������ ������ �Ÿ��� �ִ�� ����.
 * ���� ������ �� ������ ������ �Ÿ��� x�� ����
 * �� �� �����⸦ ��ġ���� �� c�� �̻� ��ġ�� �� ������ ����
 * ������ ���� x�� ũ�� �Ұ����ϸ� �۰�
 * 
 * 		1 	2 	4 	8 	9
�Ÿ� 1	0 	0	0	0	0
�Ÿ� 2	0	x	0	0	x
�Ÿ� 3 	0	x	0	0	x
�Ÿ� 4	0	x	x	0	x
�Ÿ� 5 	0 	x	x	0	x
�Ÿ� 6 	0	x	x	0	x
�Ÿ� 7 	0 	x	x	0	x
�Ÿ� 8	0	x	x	x	0
 */
public class P2110_�����⼳ġ {
	public static boolean check(int []a,int mid, int c) {
		int sum=1;
		int home = a[0];
		for(int s : a) {
			if(s-home>=mid) {
				sum++;
				home=s;
			}
		}
		if(sum>=c) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//���� ����
		int c = sc.nextInt();//�������� ����
		int[]a = new int[n];
		
		for(int i=0;i<n;++i) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int result=1;
		int s=1; //������ �ּ� �Ÿ�
		int e=a[n-1]-a[0];//������ �ִ� �Ÿ�
		
		while(s<=e) {
			int mid=(s+e)/2;
			if(check(a,mid,c)) { //�������� ���� ������. ���� ������
				result = Math.max(result,mid);
				s=mid+1;
			}else {//������ ���� �ø���. ���� ������
				e=mid-1;
			}
		}
		sc.close();
		System.out.println(result);
		
	}

}
