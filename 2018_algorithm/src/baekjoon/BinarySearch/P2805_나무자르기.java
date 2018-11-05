package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ���ܱ��� ���� ����(H)
 * ���� ���̰� M���ͺ��� ũ�ų� ���� ��� H�� ����.
 * left=0
 * right = ������� ������ ������ �ִ�
 * check() : ������ ���̰� a�̰� �ڸ������ϴ� ������ ���̰� mid�϶� ��� m���ͺ��� ū�� ������ ���ϴ� �Լ�
 * �����ϸ� ������ ũ�Ը���� �Ұ����ϸ� ������ �۰�.
 * ���� �ʿ��� ���� ���̺��� �� ���� ��� ���ܱ� ���̸� ���̰� ������ ���̰� ª�� ��� ���ܱ� ���̸� ���̴� ���.
 * 
 * 1. �̺� Ž�� ���� ���� ����
 * 2. H �������� �߶��� ���� ���� m���� ���� ��� h�� �÷��� Ž���Ѵ�.
 * 3. �ݺ�
 */
public class P2805_�����ڸ��� {

	public static boolean check(long[]a, long h, int m) {
		long sum=0;
		
		for(long s : a) {
			if(s-h>0) {
				sum+=s-h;//��������-���ܱ� ����
			}
		}
		
		if(sum>=m) {// ���� ���� ���̰� m���� ū ��� ���ܱ� ���� ���̱�
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(line[0]);// ���� ��
		int m = Integer.parseInt(line[1]);// ����̰� ������ ���������� �ϴ� ���� ����
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long arr [] = new long[n];
		long s = 0;
		long e = 0;
		long result=0;
		
		for(int i=0; i<n; ++i) {
			arr[i] = Integer.valueOf(st.nextToken());
			e = Math.max(e,arr[i]);//���� ū ���� e�� �ִ´�.
		}
		
		Arrays.sort(arr);
		
		while(s<=e) {
			long mid =(s+e)/2;
			if(check(arr,mid,m)) {
				result=Math.max(result,mid);
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		br.close();
		System.out.println(result);
	}

}
