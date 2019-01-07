package io;

import java.util.Scanner;

/*
 * Date: 2019. 01. 03.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2439
 * Title : 별 찍기 -2
 * description : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
                 하지만, 오른쪽을 기준으로 정렬한 별.
                 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
                 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
                   *
                  **
                 ***
                ****
               *****

 * solution : for문 사용

 */
public class P2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1 || n>100)
            return;

        for(int i=1; i<=n; ++i){
            for(int j=0; j<n-i; ++j){
                System.out.print(" ");
            }
            for(int j=0; j<i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
