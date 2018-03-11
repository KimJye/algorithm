/*
 * 2018/03/11
 * �Ʒ��� ����(10 9 8 7 6 5 4 3 2 1) ��µǵ��� printAll �޼ҵ带 �����϶�.
 * ���� �ݺ������� printAll �޼ҵ带 ������ ����,
 * �� ���� ��� ȣ��� �ٽ� �����϶�.
 * ������ �޼ҵ��� �ð� ���⵵��? -> O(n)
 */

/*
 * ��ǰ
 * 10�� �ȳ���
 * root�� ������Ŵ.
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

