/*
 * 정수 N을 소인수분해해서 출력하는 문제
 * i*i가 메모리와 시간에서 미세하게 조금 효율적.
 */
package baekjoon.math01;

import java.util.Scanner;

public class 소인수분해_p11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i=2;i<=num;++i) {
			while(num%i==0) {
				System.out.println(i);
				num/=i;
			}
			
		}
		if(num>1) {
			System.out.println(num);
		}
		
	}

}
