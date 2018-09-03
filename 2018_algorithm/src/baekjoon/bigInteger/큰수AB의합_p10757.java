/*
 * 2018.07.11
 * A+B를 계산하시오.
 * 첫째 줄에 A와 B가 주어진다.(0 < A,B < 10^10000)
 */
package baekjoon.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수AB의합_p10757 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		BigInteger A,B;
		A=input.nextBigInteger();
		B=input.nextBigInteger();
		
		System.out.println(A.add(B));
	}
}
