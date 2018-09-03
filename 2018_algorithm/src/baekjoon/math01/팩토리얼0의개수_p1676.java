/*
 * https://gist.github.com/Baekjoon/505cc6839e6d34624cb54c5ffb4534cb
 */
package baekjoon.math01;

import java.util.Scanner;

public class 팩토리얼0의개수_p1676 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count=0;
		
		for(int i=2;i<=num;++i) {
			while(num%i==0) {
				if(num%5==0) count++;
				num/=i;
			}
		}
		System.out.println(count);
	}

}
