package baekjoon.math01;

import java.util.Scanner;

public class 최소공배수_p1934 {
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		while(N-- >0) {
			
			int a = input.nextInt();
			int b = input.nextInt();
			
			int gcd = gcd(a,b);
			int lcm = gcd*(a/gcd)*(b/gcd);
			System.out.println(lcm);
			
		}
		
	}
	

}
