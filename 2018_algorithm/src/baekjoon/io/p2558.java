/*
 * 2018.07.18
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 */

package baekjoon.io;

import java.util.Scanner;

//p1000�� ���� �ٸ��� �𸣰���...
public class p2558 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		a=input.nextInt();
		if(a<0) System.out.println("0���� Ŀ����.");

		b=input.nextInt();
		if(b>10) System.out.println("10���� �۾ƾ���");
		
		System.out.println(a+b);
	}

}
