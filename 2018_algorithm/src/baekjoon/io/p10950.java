/*
 * 2018.07.18
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package baekjoon.io;

import java.util.Scanner;

public class p10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;//����
		int a,b;
		
		num=input.nextInt();
	
		int [] array = new int[num]; //�̷��� �����ϰԵǸ� ��ü �Է��� �ſ� ū ��쿡 �ſ� ū ũ����
									  // �迭�� �ʿ��ϰ� �ȴ�.
		
		for(int i=0;i<num;++i) {
			a=input.nextInt();
			b=input.nextInt();
			array[i]=a+b;
		}
		
		for(int arr : array) {
			System.out.println(arr);
		}
		
		/* ���� Ǯ��
		while(num-- >0) {
			int a,b;
			a= input.nextInt();
			b= input.nextInt();
			System.out.println(a+b);
		}
		*/
	}

}
