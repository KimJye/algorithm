/*
 * ���� N�� ���μ������ؼ� ����ϴ� ����
 * i*i�� �޸𸮿� �ð����� �̼��ϰ� ���� ȿ����.
 */
package baekjoon.math01;

import java.util.Scanner;

public class ���μ�����_p11653 {

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
