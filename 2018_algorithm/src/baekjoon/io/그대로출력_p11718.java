/*
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 *  각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
 *  또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 */
package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 각 줄은 공백으로 시작하지 않고 공백으로 끝나지 않는다 못풀었엄...
public class 그대로출력_p11718 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		String reg = "[^a-zA-Z0-9]";
		
		while((str=bf.readLine())!=null) {
			
			if(str.length()>100) break; //입력 최대 100줄
			if(str==reg) break; //알파벳 소문자, 대문자, 숫자로만 이루어져있다.
			if(str.isEmpty()) break; //빈 줄은 주어지지 않는다.
			
			System.out.println(str.toString());
		}
		bf.close();
	}
}
