package baekjoon.io;

import java.util.Scanner;// Scanner
import java.io.*;

//입/출력
//

public class 네수 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*
	//BufferedReader로 풀어보기.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
	*/
		
	// Scanner로 문제 풀어보기
		Scanner input = new Scanner(System.in);
		
		String A,B,C,D;
		
		System.out.print("입력(ABCD순서대로): ");
		
	//	if(Integer.parseInt(input.nextLine())<1 || Integer.parseInt(input.nextLine())>1000000) return; //조건
		
		//입력
		A=input.next();
		B=input.next();
		C=input.next();
		D=input.next();
		input.close();
		
		long a = Long.parseLong(A+B);
		long b = Long.parseLong(C+D);
		
		System.out.println(a+b);
	
				
	}

}
