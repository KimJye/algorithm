package baekjoon.io;

import java.util.Scanner;

public class ±¸±¸´Ü_p2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		input.close();

		for(int i=1;i<10;++i) {
			if(1<=num && num<=9) {
				System.out.printf("%d * %d = %d", num, i, num*i);
				System.out.println();
			}
		}
	}

}
