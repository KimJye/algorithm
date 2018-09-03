/*
 * 2018.07.24
 * ��ȣ ���ڿ��� �־����� ��, �ùٸ� ��ȣ ���ڿ����� �ƴ����� �˾ƺ��� ����
 */
package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ��ȣ_p9012 {

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
						//System.out.println("����");
						count=Integer.MIN_VALUE; //break�� �־�����
					}else {
						stack.pop();
						count--;
						//System.out.println(count);
					}
					
				}
			}
			if(count==0) { //count ��ſ� stack size�ѹ� �Ẹ��
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
