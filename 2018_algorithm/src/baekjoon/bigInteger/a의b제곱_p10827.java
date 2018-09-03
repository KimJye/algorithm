/*
 * 2018.07.11
 * 실수 a와 정수 b가 주어졌을 때, a의 b제곱을 정확하게 계산하는 프로그램을 작성하시오.
 */
package baekjoon.bigInteger;

import java.math.BigDecimal;
import java.util.Scanner;

public class a의b제곱_p10827 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		BigDecimal a =input.nextBigDecimal();
		
		int b = input.nextInt();
		
		BigDecimal c =a.pow(b);
		
		System.out.println(c.toPlainString());
		
		/*
		//pow() 대신 multiply() 이용하여 제곱하는 방법
		BigDecimal a =input.nextBigDecimal();
		
		int b = input.nextInt();
		
		BigDecimal result = BigDecimal.ONE;
		
		while(b-- >0) {
			result = result.multiply(a);
		}
		System.out.println(result.toPlainString());
		*/
	}
}
