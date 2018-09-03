package baekjoon.io;

import java.util.Scanner;

public class p10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A,B=0;
		
		while(input.hasNextInt()) {
			A=input.nextInt();
			B=input.nextInt();
			
			if(A==0 && B==0) break;
			if(0<A && B<10) {
				System.out.println(A+B);
			}
		}
	}

}
