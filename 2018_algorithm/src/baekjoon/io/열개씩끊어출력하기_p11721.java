package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 열개씩끊어출력하기_p11721 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		String reg = "[^a-zA-Z]";
		
		str=bf.readLine();
		
		for(int i=0; i<str.length(); ++i) {
			
			if(str.length()>100) break; //입력 최대 100줄
			if(str==reg) break; //알파벳 소문자, 대문자로만 이루어져있다.
			
			if(i%10==0 && i!=0) System.out.println();
			
			System.out.print(str.charAt(i));
		}
		bf.close();
	}
}
