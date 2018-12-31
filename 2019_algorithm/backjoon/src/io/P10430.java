package io;

import java.util.Scanner;

/*
 * Date: 2019. 01. 01.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10430
 * Title : 나머지
 * description : (A+B)%C는 (A%C + B%C)%C 와 같을까?
                 (A×B)%C는 (A%C × B%C)%C 와 같을까?
                 세 수 A, B, C가 주어졌을 때,
                 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 */
public class P10430 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println((a%c+b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%c*b%c)%c);

        sc.close();
    }
}
