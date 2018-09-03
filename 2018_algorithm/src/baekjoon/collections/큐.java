package baekjoon.collections;

import java.util.*;

public class 큐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		input.nextLine(); //정수 뒤에 \n이 있어서 필요.
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<n; ++i) {
			String line = input.nextLine();
			String [] s = line.split(" ");
			String cmd = s[0];
			
			if(cmd.equals("push")) { //push
				int num = Integer.parseInt(s[1]);
				queue.offer(num);
			}else if(cmd.equals("front")) { //front
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.peek());
				}
			}else if(cmd.equals("size")) { //size
				System.out.println(queue.size());
			}else if(cmd.equals("empty")) { //empty
				if(queue.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(cmd.equals("pop")) { //pop
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.poll());
				}
			}else if(cmd.equals("back")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}
			}
			
		}
		
	}

}
