/*
 * N!�� ����ϴ� ����
 */
package baekjoon.math01;

import java.util.Scanner;

public class ���丮��_p10872 {
	
	public static int fa(int n) {
		if(n==0)return 1;
		return n*fa(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(fa(num));
	}

}
