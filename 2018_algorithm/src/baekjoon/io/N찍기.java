package baekjoon.io;

import java.io.IOException;
import java.util.Scanner;

public class N찍기 {
	public static void main(String[] args) throws IOException {
		
		//StringBuilder으로 구현 156ms걸림.
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=1; i<=n; ++i) {
			builder.append(i+"\n");
		}
		System.out.println(builder);
		/*Scanner 이용 약 880ms 걸림
		Scanner input = new Scanner(System.in);
		
		int n=0;
		
		n=input.nextInt();
		input.close();
		
		for(int i=1; i<=n; ++i) {
			System.out.println(i);
		}
		*/
	}
}
