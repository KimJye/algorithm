package baekjoon.math01;

import java.util.Scanner;

public class 진법변환_p2745 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] line = input.nextLine().split(" ");
		String s = line[0];
		int b = Integer.valueOf(line[1]);
		int result=0;
		
		for(int i=0; i<s.length(); ++i) {
			char c = s.charAt(i);
			
			if('0'<=c && c<='9') {
				result = result * b + (c- '0');
			}else {
				result = result * b +(c-'A'+10);
			}
		}
		System.out.println(result);
	}

}
