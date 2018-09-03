/*
 * 2018.07.11
 * BigInteger
 * �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. 
 * �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
 * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package baekjoon.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class �Ǻ���ġ��4_p10826 {

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
