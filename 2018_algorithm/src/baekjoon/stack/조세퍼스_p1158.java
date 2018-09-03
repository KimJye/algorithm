package baekjoon.stack;

import java.util.*;

public class 조세퍼스_p1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		StringBuilder builder = new StringBuilder();
		builder.append('<');
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; ++i) {
			queue.offer(i);
		}
		
		for(int i=0; i<n-1; ++i) {
			for(int j=0; j<m-1; ++j) {
				queue.offer(queue.poll());
			}
			builder.append(queue.poll() + ", ");
		}
		builder.append(queue.poll()+">");
		System.out.println(builder.toString());
	}

}
/* 큐 안쓰고 LinkedList로만 풀기
 * public class Main {
    
    static int N;
    static int M;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        sb.append("<");
        N = sc.nextInt();
        M = sc.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=N; ++i){
            list.add(i);
        }
        f(list);
        
        System.out.println(sb.toString().substring(0,sb.length()-2)+">");
    }
    
    public static void f(LinkedList<Integer> list){
        
        int kill = 0; 
        while(N>0){
            for(int i=0; i<M-1; ++i){
                ++kill;
                if(kill > N-1) { kill=0;}
            }
            sb.append(list.get(kill)+", ");
            list.remove(kill);
            if(kill==list.size()) kill=0;
            
            N--;
        }
    }
}
*/


