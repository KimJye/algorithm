package binaryTree;

import java.util.Random;

public class Example1 {
	static class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value=value;
			this.left=null;
			this.right=null;
		}
		
		public void add(int value) {
			if(value<this.value) {
				if(left==null) left= new Node(value);
				else left.add(value);
			}else if(value>this.value) {
				if(right==null)right=new Node(value);
				else right.add(value);
			}
		}
		
		public void print() {
			if(left !=null) left.print();
			System.out.printf("%d,",value);
			if(right !=null) right.print();
		}
		public boolean contains(int value) {
			if(value<this.value) return left!=null&&left.contains(value);
			else if(value>this.value) return right!=null&&right.contains(value);
			else return true;
			
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Node root = new Node(random.nextInt(20));
		for(int i=0;i<15;++i)
			root.add(random.nextInt(20));
		
		root.print();
		System.out.println();
		
		for(int i=0;i<20;++i) {
			int value = random.nextInt(20);
			System.out.printf("%d %s\n",value,root.contains(value));
		}
	}
}
