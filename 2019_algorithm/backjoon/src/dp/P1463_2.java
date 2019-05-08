package dp;

import java.util.Scanner;

/*
 재귀문
 메모리 4배 증가. 시간 30배 증가..
 */
public class P1463_2 {

    static int[] d;

    static int solution(int n) {

        if(n==0 || n==1){
            d[n]=0;
            return 0;
        }
        else if(n==2 || n==3){
            d[n]=1;
            return d[n];
        }

        if (d[n]!=0)  return d[n];

        d[n] = solution(n - 1) + 1;

        if (n % 2 == 0) {
            d[n] = Math.min(d[n], solution(n/2) + 1);
        }
        if (n % 3 == 0) {
            d[n] = Math.min(d[n], solution(n/3) + 1);
        }
/*
시간이 매우 줄어든다.
하지만 메모리는 별 차이 없다.
시간이 매우 줄어들지만, 반복문의 시간이 2배다.

        if (n % 2 == 0) {
            int tmp = solution(n / 2) + 1;
            if (d[n] > tmp)
                d[n] = tmp;
        }
        if (n % 3 == 0) {
            int tmp = solution(n / 3) + 1;
            if (d[n] > tmp)
                d[n] = tmp;
        }

 */
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        d = new int[n+1];
        System.out.println(solution(n));
    }
}
