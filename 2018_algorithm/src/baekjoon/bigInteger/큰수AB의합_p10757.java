/*
 * 2018.07.11
 * A+B�� ����Ͻÿ�.
 * ù° �ٿ� A�� B�� �־�����.(0 < A,B < 10^10000)
 */
package baekjoon.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class ū��AB����_p10757 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		BigInteger A,B;
		A=input.nextBigInteger();
		B=input.nextBigInteger();
		
		System.out.println(A.add(B));
	}
}
