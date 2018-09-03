package baekjoon.stack;

import java.util.*;
import java.util.Stack;
import java.io.*;

public class 에디터_p1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
	
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(int i=0; i<str.length(); ++i) {
			left.push(str.charAt(i));
		}
		
		int num = Integer.parseInt(br.readLine());
		
		while(num-- >0) {
			String [] s = br.readLine().split(" ");
			char ch = s[0].charAt(0);
			
			if(ch =='L') { // 왼쪽으로 커서 옮김.
				if(!left.empty()) {
					right.push(left.pop());
				}
			}
			else if(ch =='D') { //오른쪽으로 커서 옮김.
				if(!right.empty()) {
					left.push(right.pop());
				}
			}
			else if(ch =='B') { //커서 왼쪽에 있는 문자를 삭제
				if(!left.empty()) {
					left.pop();
				}
			}
			else if(ch == 'P') { //문자를 커서 왼쪽에 옮김.
				char c = s[1].charAt(0);
				left.push(c);
			}
		}
		while(!left.empty()) {
			right.push(left.pop());
		}
		
		StringBuilder builder = new StringBuilder();
		
		while(!right.empty()) {
			builder.append(right.pop());
		}
		
		System.out.println(builder);
	}

}
