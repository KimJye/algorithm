package io;

import java.util.Scanner;

/*
 * Date: 2019. 01. 07
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2440
 * Title : 별 찍기 -3
 * description : 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
                 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
                 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
                 *****
                  ****
                   ***
                    **
                     *
 * solution : for문 사용

 */
public class P2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1 || n>100)
            return;

        for(int i=n; i>0; --i){
            for(int j=0; j<=i-1; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
