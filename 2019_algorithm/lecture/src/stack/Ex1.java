package stack;
/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 스택
 * description : 10개의 요소를 갖는 1차원 배열을 스택으로 이용하라.
 *               이용되는 데이터가 스택의 크기보다 커지면 "Overflow"를 출력하고,
 *               제거할 데이터가 없으면 "Underflow"를 출력한다.
 */
public class Ex1 {
    public static void main(String[]args){
        Stack st = new Stack(5);
        st.push(5);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(1);
        st.push(0);
        st.pop();
        st.pop();

        st.push(15);

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        st.push(30);

    }
}
class Stack{
    int top;
    int [] stack;
    int size;

    public Stack(int size) {
        top = -1;
        stack = new int[size];
        this.size = size;
    }

    public void push(int value) {
        top++;
        if(top>=this.size){
            System.out.println("Overflow");
            return;
        }
        stack[top] = value;
        System.out.println(stack[top] + " PUSH !");
    }

    public int pop() {
        if(top<0){
            System.out.println("Underflow");
        }
        System.out.println(stack[top] + " POP !");
        return stack[top--];
    }

}
