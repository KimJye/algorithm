/*
 * 2018/03/11
 	아래와 같이(0 1 2 3 4 5 6 7 8 9 10)출력되도록 addTail 메소드를 구현하라.
	addTail 메소드는 링크드 리스트 끝에 value 값의 Node를 추가해야 한다.

	먼저 반복문으로 addTail 메소드를 구현해 보고,
	그 다음 재귀 호출로 다시 구현하라.
	구현한 메소드의 시간 복잡도는?

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
