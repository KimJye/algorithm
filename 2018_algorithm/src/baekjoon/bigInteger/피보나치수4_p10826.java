/*
 * 2018.07.11
 * BigInteger
 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
 * 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 * 이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
 * n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */
package baekjoon.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class 피보나치수4_p10826 {

	static BigInteger [] a = new BigInteger[100];
	
	static BigInteger fibonacci(int n) {
		
		a[0]=BigInteger.ZERO;
		a[1]=BigInteger.ONE;
		
		if(n<0) return BigInteger.ZERO;
		
		if(a[n]!=null) return a[n];
		
		a[n]= fibonacci(n-1).add(fibonacci(n-2));
		
		return a[n];
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		BigInteger value= fibonacci(num);
		
		System.out.println(value);
	}
}
