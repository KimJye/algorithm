package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 05. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/9095
 * Title : 1,2,3 더하기
 * description : 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다.
 *               합을 나타낼 때는 수를 1개 이상 사용해야 한다.
•                1+1+1+1
•                1+1+2
•                1+2+1
•                2+1+1
•                2+2
•                1+3
•                3+1

    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
                        각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
                        n은 양수이며 11보다 작다.

                 출력 : 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

 * solution : 동적 프로그래밍
 *
 * n=1 : 1
 * n=2 : 2
 * n=3 : 4
 * n=4 : 7
 * n=5 : 13
 * n=6 : 24
 * n=7 : 44
 * n=8 : 81
 * n=9 : 149
 * n=10 : 274
 *
 * n = (n-1)+(n-2)+(n-3)
 */
public class P9095 {

    static int [] d = new int[11];

     static int f(int n){

        if(n==1 || n==2){
            d[n]=n;
            return n;
        }else if(n==3){
            d[n]=4;
            return d[n];
        }

        if(d[n]>0) return d[n];

        d[n]= f(n-1)+f(n-2)+f(n-3);

        return d[n];
    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(f(n));
        }

        br.close();
    }
}
