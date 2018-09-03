/*
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 *  주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 
 *  문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 */
package baekjoon.collections;

import java.util.*;

public class 스택 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		input.nextLine(); //정수 뒤에 \n이 있어서 필요.
		
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
