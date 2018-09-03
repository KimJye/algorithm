/*
 * 2018.07.18
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */

package baekjoon.io;

import java.util.Scanner;

//p1000과 뭐가 다른지 모르겠음...
public class p2558 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a,b;
		
		a=input.nextInt();
		if(a<0) System.out.println("0보다 커야함.");

		b=input.nextInt();
		if(b>10) System.out.println("10보다 작아야함");
		
		System.out.println(a+b);
	}

}
