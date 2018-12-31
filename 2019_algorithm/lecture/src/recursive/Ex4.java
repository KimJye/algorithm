package recursive;
/*
addTail 메소드는 링크드 리스트 끝에 value 값의 Node를 추가해야 한다.
먼저 반복문으로 addTail 메소드를 구현해 보고,
그 다음 재귀 호출로 다시 구현하라.
구현한 메소드의 시간 복잡도는? O(1)

 */
public class Ex4 {

    static class Node{
        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        public void printAll(){
            System.out.printf("%d", this.value);
            if(next!=null) next.printAll();
        }
        public void addTail(int value){
            if(next!=null) next.addTail(value);
            else next = new Node(value,null);
        }
    }
    public static void main(String[]args){
        Node root = new Node(0,null);

        for(int i=1; i<=10; ++i)
            root.addTail(i);

        root.printAll();
    }
}
