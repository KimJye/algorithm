/*
 * 2018.07.11
 * �Ǽ� a�� ���� b�� �־����� ��, a�� b������ ��Ȯ�ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package baekjoon.bigInteger;

import java.math.BigDecimal;
import java.util.Scanner;

public class a��b����_p10827 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		BigDecimal a =input.nextBigDecimal();
		
		int b = input.nextInt();
		
		BigDecimal c =a.pow(b);
		
		System.out.println(c.toPlainString());
		
		/*
		//pow() ��� multiply() �̿��Ͽ� �����ϴ� ���
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
