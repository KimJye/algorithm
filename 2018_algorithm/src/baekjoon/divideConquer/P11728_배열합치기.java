package divideConquer;
/*
 * ���ĵǾ� �ִ� �� �迭 A�� B�� �־�����. �� �迭�� ��ģ ���� �����ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �迭 ũ��, ��° �ٿ��� �迭 A����, ��° �ٿ��� �迭B����
 * �迭�� ����ִ� ���� ���밪�� 10^9���� �۰ų� ���� �����̴�.
 */
/*
 * ��Ǯ ���� 
 * 1. �迭 A, B ���� �޴´�.
 * 2. ���ο� �迭 C�� ���ؼ� ��ģ��.
 */

import java.io.*;
import java.util.StringTokenizer;

public class P11728_�迭��ġ�� {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�迭 ���� �Է�
		StringTokenizer num = new StringTokenizer(br.readLine());
		
		//�迭 ����
		int a [] = new int[Integer.parseInt(num.nextToken())]; 
		int b [] = new int[Integer.parseInt(num.nextToken())];
		
		//a �迭 ���� �Է�
		StringTokenizer ast = new StringTokenizer(br.readLine());
		
		for(int i=0; i<a.length; ++i) {
			a[i]=Integer.parseInt(ast.nextToken());
		}
		
		//b �迭 ���� �Է�
		StringTokenizer bst = new StringTokenizer(br.readLine());
		for(int i=0; i<b.length; ++i) {
			b[i]=Integer.parseInt(bst.nextToken());
		}
		
		br.close();
		
		int j=0; //a�迭 ����Ű�� index
		int k=0; //b�迭 ����Ű�� index
		int l=0; //c�迭 index
		
		int clen = a.length+b.length; 
		int c [] = new int[clen];
		
		while(j<a.length && k<b.length) {
			if(a[j]<=b[k]) {
				c[l++] = a[j++];
			}else {
				c[l++] = b[k++];
			}
		}
		while(j<a.length) {
			c[l++] = a[j++];
		}
		while(k<b.length) {
			c[l++] = b[k++];
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<c.length; ++i) {
			sb.append(c[i]+" ");
		}
		
		System.out.println(sb.toString());
		
	}

}
