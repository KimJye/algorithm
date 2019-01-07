package recursive;

import java.util.Scanner;

/*
 * Date: 2019. 01. 07.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/8393
 * Title : 합
 * description : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오
                 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
                 출력 : 1부터 n까지 합을 출력한다

 * solution : 재귀사용

 */
public class P8393 {
    static int f(int n){
        if(n<=1) return 1;
        return n+f(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(f(n));
    }
}
