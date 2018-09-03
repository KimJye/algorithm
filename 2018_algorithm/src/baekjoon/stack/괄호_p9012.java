/*
 * 2018.07.24
 * 괄호 문자열이 주어졌을 때, 올바른 괄호 문자열인지 아닌지를 알아보는 문제
 */
package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호_p9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<Character>();
		
		int num = Integer.parseInt(bf.readLine());
		
		String str="";
		
		while(num-- >0) {
			int count=0;
			str=bf.readLine();
			for(int i=0; i<str.length(); ++i) {
				
				if(str.charAt(i)=='(') {
					stack.push('(');
					count++;
					//System.out.println(count);
				}
				else if(str.charAt(i)==')'){
					
					if(stack.empty()) {
						//System.out.println("못뺌");
						count=Integer.MIN_VALUE; //break문 있었으면
					}else {
						stack.pop();
						count--;
						//System.out.println(count);
					}
					
				}
			}
			if(count==0) { //count 대신에 stack size한번 써보기
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
