package baekjoon.math01;

import java.util.*;

public class 진법변환2_p11005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n =input.nextInt();
		int b = input.nextInt();
		
		StringBuilder builder = new StringBuilder();
		
		while(n>0) {
			int r = n%b;
			
			if(r<10) {
				builder.append((char)(r+'0'));
			}else {
				builder.append((char)(r-10 + 'A'));
			}
			n/=b;
		}
		System.out.println(builder.reverse());
	}

}
