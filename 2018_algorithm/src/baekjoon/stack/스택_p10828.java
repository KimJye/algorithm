package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ½ºÅÃ_p10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(bf.readLine());
		Stack stack = new Stack(num);
		
		while(num-- >0) {
			String [] str = bf.readLine().split(" ");
			
			switch(str[0]) {
			case "push" : stack.push(Integer.parseInt(str[1]));
				  	break;
			
			case "pop" : System.out.println(stack.pop());
					break;
			
			case "top" : System.out.println(stack.top());
					break;
					
			case "size" : System.out.println(stack.size());
					break;
			
			case "empty" : System.out.println(stack.empty());
					break;
					
			}
		}
	}
}

class Stack{
	private int [] stack;
	private int top,size,count;
	
	Stack(int num){
		size=num;
		stack = new int[num];
		top=-1;
		count=0;
	}
	
	public void push(int n) {
		if(top==this.size-1) {
			System.out.println("Stack is full!!");
		}
		else {
			stack[++top] = n;
			count++;
		}
	}
	
	public int pop() {
		if(top<0) {
			return -1;
		}
		else {
			count--;
			return stack[top--];
			
		}
	}
	
	public int size() {
		return count;
	}
	
	public int empty() {
		if(top==-1) return 1;
		else return 0;
	}
	
	public int top() {
		if(this.empty()==1) return -1;
		else {
			return  stack[top];
		}
	}
}
