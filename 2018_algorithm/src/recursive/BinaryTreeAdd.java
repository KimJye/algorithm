/*
 * 2018/03/11
 * ����Ž��Ʈ�� ���� ����
 */

package recursive;

import java.util.Scanner;

public class BinaryTreeAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		Scanner input = new Scanner(System.in);
		System.out.print("�Է��� ����: ");
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

	public void insert(int data){//�ݺ����� ����� ����Ž�� Ʈ�� ����
		Node temp=root;
		Node newNode = new Node(data);

		if(temp==null){
			temp=newNode;
			System.out.printf("%d:�Է¼���",data);
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
	private Node insertKey(Node p, int data) { 
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
