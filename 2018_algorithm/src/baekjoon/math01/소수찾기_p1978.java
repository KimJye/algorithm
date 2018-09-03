/*
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 */
package baekjoon.math01;

import java.util.Scanner;

public class 소수찾기_p1978 {
	
	public static boolean prime(int n){

		if(n<2) return false;

		for(int i=2; i*i<=n;++i){  

			if(n%i==0) return false;

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		
		for(int i=0; i<num; ++i) {
			int a = input.nextInt();
			
			if(prime(a)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
