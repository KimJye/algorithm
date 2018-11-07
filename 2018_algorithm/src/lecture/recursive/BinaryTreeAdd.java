/*
 * 2018/03/11
 * 이진탐색트리 삽입 과제
 */

package recursive;

import java.util.Scanner;

public class BinaryTreeAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		Scanner input = new Scanner(System.in);
		System.out.print("입력할 정수: ");
		int number=input.nextInt();
		bt.insert(number);
		bt.toString();
	}

}

class BinaryTree{
	private static Node root=null;

	private static class Node {
		private int data;
		private Node leftnext;
		private Node rightnext;

		private Node(int data) {
			this.data = data;
		}
	}

	public void insert(int data){//반복문을 사용한 이진탐색 트리 삽입
		Node temp=root;
		Node newNode = new Node(data);

		if(temp==null){
			temp=newNode;
			System.out.printf("%d:입력성공",data);
		}

		while(temp!=null){

			if(data<temp.data){
				if(temp.leftnext!=null){
					temp=temp.leftnext;
				}
				else if(temp.leftnext==null){
					temp.leftnext=newNode;
				}
			}
			else if(data>temp.data){
				if(temp.rightnext!=null){
					temp=temp.rightnext;
				}
				else if(temp.rightnext==null){
					temp.rightnext=newNode;
				}
			}
		}//반복문 끝
	}

	/*
	 *재귀문 사용한 이진탐색 트리 삽입
	 *
	 *
	 *
	public static void insert(int data) {   
		root = insertKey(root, data); 
	} 


	// p를 루트로 하는 트리에 key를 삽입하는 메소드 (재귀 알고리즘) 
	private Node insertKey(Node p, int data) { 
		if(p == null) {		 
			Node newNode = new Node(data); 
			return newNode;	 
		} 
		else if(data < p.data) { 
			p.leftnext = insertKey(p.leftnext, data); 
			return p;		// 루트 불변 
		} 
		else if(data > p.data) { 
			p.rightnext = insertKey(p.rightnext, data); 
			return p;		// 루트 불변         
		}
		return p; 
	}    
	 */


	@Override
	public String toString() { 
		String result = inorder(root); 
		return result; 
	} 



	private String inorder(Node p) { 
		String result = ""; 
		if(p != null) { 
			result += inorder(p.leftnext); 
			result += p.data + " "; 
			result += inorder(p.rightnext); 
		} 
		return result; 
	} 

}
