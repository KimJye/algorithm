package baekjoon.math01;

import java.util.Scanner;

public class ³ª¸ÓÁö_p10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println((A%C+B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
	}

}
