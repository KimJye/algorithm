package baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ť_p10845 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0;i<N;++i) {
			String s = input.next();
			
			switch(s) {
			case "push":
					queue.offer(input.nextInt());
					break;
			case "pop":
					if(queue.isEmpty()) System.out.println("-1");
					else System.out.println(queue.poll());
					break;
			case "size":
					System.out.println(queue.size());
					break;
			case "empty":
					if(queue.isEmpty())System.out.println("1");
					else System.out.println("0");
					break;
			case "front":
					if(queue.isEmpty()) System.out.println("-1");
					else System.out.println(queue.peek());
					break;
			case "back" :
					if(queue.isEmpty()) System.out.println("-1");
					else {
						Object[] arr = queue.toArray();
						System.out.println(arr[queue.size()-1]);
					}
					break;
				
			}
		}
	}

}

