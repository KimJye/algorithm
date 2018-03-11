/*
 * 2018/03/11
 * 아래와 같이(10 9 8 7 6 5 4 3 2 1) 출력되도록 printAll 메소드를 구현하라.
 * 먼저 반복문으로 printAll 메소드를 구현해 보고,
 * 그 다음 재귀 호출로 다시 구현하라.
 * 구현한 메소드의 시간 복잡도는? -> O(n)
 */

/*
 * 못품
 * 10이 안나옴
 * root를 못가리킴.
 */
package recursive;

public class print_node {

    static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void printAll() {
        	
        	Node temp=next;
        	if(temp==null)return;
        	System.out.printf("%d ", temp.value);
        	temp.printAll();
        	
        	/*
        	Node temp=next;
        	
        	while(temp!=null){
        		System.out.printf("%d ", temp.value);
        		temp=temp.next;
        	}
        	*/
        	
        	
        }
    }


    public static void main(String[] args) {
        Node root = null;
        for (int i = 1; i <= 10; ++i)
            root = new Node(i, root);
        
        root.printAll();
    }
}

