package io;


import java.util.Scanner;

/*
 * Date: 2019. 01. 03.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2741
 * Title : N찍기
 * description : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
                 입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
                 출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * solution : for문 사용

 */
public class P2741 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>100000)
            return;

        for(int i=1; i<=n; ++i){
            System.out.println(i);
        }
        sc.close();
    }
}
