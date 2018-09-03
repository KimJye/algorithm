/*
 * N!을 출력하는 문제
 */
package baekjoon.math01;

import java.util.Scanner;

public class 팩토리얼_p10872 {
	
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
