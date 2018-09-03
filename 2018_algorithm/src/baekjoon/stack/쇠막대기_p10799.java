package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ¼è¸·´ë±â_p10799 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		
		int num = str.length();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int result=0;
		
		for(int i=0; i<num; ++i) {
			if(str.charAt(i)=='(') {
				stack.push(i);
			}else {
				if(i-1==stack.peek()) {
					stack.pop();
					result+=stack.size();
				}else {
					stack.pop();
					result++;
				}
			}
		}
		System.out.println(result);
		
	}

}
