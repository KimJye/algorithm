/*
 * 2018/03/11
 * ����Ž��Ʈ�� ���� ����
 */

package recursive;

import java.util.Scanner;

import recursive.AddTail.Node;

public class BinaryTree {

	private static Node root=null;

	private static class Node {
		private int data;
		private Node leftnext;
		private Node rightnext;

		private Node(int data) {
			this.data = data;
		}
	}

	public static void insert(int data){//�ݺ����� ����� ����Ž�� Ʈ�� ����
		Node temp=root;
		Node newNode = new Node(data);

		if(temp==null) temp=newNode;

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
		}//�ݺ��� ��
	}

	/*
	 *��͹� ����� ����Ž�� Ʈ�� ����
	 *
	 *
	 *
	public static void insert(int data) {   
		root = insertKey(root, data); 
	} 


	// p�� ��Ʈ�� �ϴ� Ʈ���� key�� �����ϴ� �޼ҵ� (��� �˰���) 
	private static Node insertKey(Node p, int data) { 
		if(p == null) {		 
			Node newNode = new Node(data); 
			return newNode;	 
		} 
		else if(data < p.data) { 
			p.leftnext = insertKey(p.leftnext, data); 
			return p;		// ��Ʈ �Һ� 
		} 
		else if(data > p.data) { 
			p.rightnext = insertKey(p.rightnext, data); 
			return p;		// ��Ʈ �Һ�         
		}
		return p; 
	}    
	 */



	@Override 
	public static String toString() { 
		String result = inorder(root); 
		return result; 
	} 



	private static String inorder(Node p) { 
		String result = ""; 
		if(p != null) { 
			result += inorder(p.leftnext); 
			result += p.data + " "; 
			result += inorder(p.rightnext); 
		} 
		return result; 
	} 



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��� ����: ");
		int number=input.nextInt();
		insert(number);
		toString();

	}
}
