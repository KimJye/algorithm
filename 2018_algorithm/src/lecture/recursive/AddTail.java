/*
 * 2018/03/11
 	�Ʒ��� ����(0 1 2 3 4 5 6 7 8 9 10)��µǵ��� addTail �޼ҵ带 �����϶�.
	addTail �޼ҵ�� ��ũ�� ����Ʈ ���� value ���� Node�� �߰��ؾ� �Ѵ�.

	���� �ݺ������� addTail �޼ҵ带 ������ ����,
	�� ���� ��� ȣ��� �ٽ� �����϶�.
	������ �޼ҵ��� �ð� ���⵵��?

 */

package recursive;

import recursive.print_node.Node;

public class AddTail {

	static class Node {
		int value;
		Node next;

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		public void printAll() {


			Node temp = new Node(this.value,this.next);

			while(temp!=null){
				System.out.printf("%d ", temp.value);
				temp=temp.next;
			}

		}

		public void addTail(int value) {

			Node root = new Node(this.value, this.next);

	         while(root != null) {
	            root = root.next;
	         }

	         Node nn = new Node(value, null);
	         root = nn;
	      }
	}


	public static void main(String[] args) {
		Node root = new Node(0, null);

		for (int i = 1; i <= 10; ++i)
			root.addTail(i);

		root.printAll();
	}
}
