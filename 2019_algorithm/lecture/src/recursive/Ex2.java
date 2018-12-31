package recursive;
/*
1부터 n까지 합계를 계산하는 sum 함수를 구현하라.
재귀 호출로 구현하라.
시간 복잡도 : O(n)
 */
public class Ex2 {

    static int sum(int n){
        if(n<=1) return 1;
        return n + sum(n-1);
    }
    public static void main(String[]args){
        for(int i=3; i<=10; ++i){
            System.out.printf("%d %d\n",i,sum(i));
        }
    }
}
