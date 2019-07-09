package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {

	// 카운트로 구현
	static boolean solution2(String s){
		int count=0;

		for(char c : s.toCharArray()){
			if (c == '(') {
				++count;
			}else if(c==')'){
				--count;
			}
			if(count<0) return false;
		}

		return count==0;
	}

	// Stack 으로 구현
	static boolean solution1(String s){

		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()){
			if(c=='('){
				stack.push(c);
			}else if(c==')'){
				if(stack.empty()){
					stack.push(c);
					break;
				}else{
					stack.pop();
				}
			}
		}

		if(stack.empty()){
			return true;
		}else return false;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		while(N-- >0){
			String input = br.readLine();
			System.out.println(solution1(input) ? "YES":"NO");
			System.out.println(solution2(input) ? "YES":"NO");
		}
		br.close();
	}
}
