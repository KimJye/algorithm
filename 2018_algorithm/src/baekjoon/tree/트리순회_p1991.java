/*
 * 이진 트리의 프리오더, 인오더, 포스트오더 순서를 출력하는 문제
 * https://gist.github.com/Baekjoon/a0fbbde7274d2c125fcd
 */
package baekjoon.tree;

import java.util.Scanner;

public class 트리순회_p1991 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Tree tree = new Tree();

		int num = input.nextInt();
		input.nextLine();
		String str [];
		while(num-- >0) {
			str = input.nextLine().split(" ");
			
			tree.add(str[0],str[1],str[2]);
		}
		tree.preorder(tree.root);
		System.out.println();
		
		tree.inorder(tree.root);
		System.out.println();
		
		tree.postorder(tree.root);
		System.out.println();
		
		input.close();
		
	}
}
class Node{
	String value;
	Node left;
	Node right;

	public Node(String value) {
		this.value=value;
		this.left=null;
		this.right=null;
	}
}

class Tree{

	Node root;
	
	public void add(String data, String leftdata, String rightdata) {
		if(root==null) {
			if(data!=".") root = new Node(data);
			if(leftdata!=".") root = new Node(leftdata);
			if(rightdata!=".") root = new Node(rightdata);
		}
		else search(root, data, leftdata, rightdata);
	}

	private void search(Node root, String data, String leftdata, String rightdata) {
		if(root==null) return; 
		else if(root.value==data){
			if(leftdata!=".") root.left = new Node(leftdata);
			if(rightdata!=".") root.right = new Node(rightdata);
		}
		else {
			search(root.left, data, leftdata, rightdata);
			search(root.right, data, leftdata, rightdata);
		}

	}
	
	public void preorder(Node root) {
		
		System.out.println(root.value);
		if(root.left!=null) preorder(root.left);
		if(root.right!=null) preorder(root.right);
	}
	
	public void inorder(Node root) {
		
		if(root.left!=null) inorder(root.left);
		System.out.println(root.value);
		if(root.right!=null) inorder(root.right);
	}
	
	public void postorder(Node root) {
		if(root.left!=null) postorder(root.left);
		if(root.right!=null) postorder(root.right);
		System.out.println(root.value);
	}
}

