package dp;

import java.util.Scanner;

/*
 * Date: 2019. 04. 29
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1463
 * Title : 1로 만들기
 * description : 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
                 X가 3으로 나누어 떨어지면, 3으로 나눈다.
                 X가 2로 나누어 떨어지면, 2로 나눈다.
                 1을 뺀다.
                 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
                 연산을 사용하는 횟수의 최솟값을 출력하시오.

                 입력 : 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.

                 출력 : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

 * solution : 다이나믹 프로그래밍
 *              n이 0 또는 1일때 최소값은 0이다.
 *              n이 2 또는 3일때 최소값은 1이다.
              d[n] = d[n-1] +1;
              d[n] = d[n/3] +1;
              d[n] = d[n/2] +1;

              반복문
 *
 */
public class P1463 {

    static int solution(int n){

        int d [] = new int[n+1];

        d[0]=d[1]=0;

        for(int i=2; i<=n; ++i){
            d[i] = d[i-1]+1;
            if(i%2==0) d[i] = Math.min(d[i],d[i/2]+1);
            if(i%3==0) d[i] = Math.min(d[i],d[i/3]+1);
        }
        return d[n];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(solution(n));
    }
}
