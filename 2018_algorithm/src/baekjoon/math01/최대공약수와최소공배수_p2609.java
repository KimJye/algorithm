package baekjoon.math01;

import java.util.Scanner;

public class 최대공약수와최소공배수_p2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int gcd = gcd(a,b);
		int lcm = gcd*(a/gcd)*(b/gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);		
		
	}
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else {
			return gcd(b, a%b);
		}
	}

}
