/*
 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ�
 * ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 *  �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. 
 *  ������ �������� ���� ����� �־����� ���� ����.
 */
package baekjoon.collections;

import java.util.*;

public class ���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		input.nextLine(); //���� �ڿ� \n�� �־ �ʿ�.
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; ++i) {
			String line = input.nextLine();
			String [] s = line.split(" ");
			String cmd = s[0];
			
			if(cmd.equals("push")) { //push
				int num = Integer.parseInt(s[1]);
				stack.push(num);
			}else if(cmd.equals("top")) { //top
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}else if(cmd.equals("size")) { //size
				System.out.println(stack.size());
			}else if(cmd.equals("empty")) { //empty
				if(stack.empty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(cmd.equals("pop")) { //pop
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.pop());
				}
			}
			
				
			
		}
	}
}
