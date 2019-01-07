package io;

import java.util.Scanner;

/*
 * Date: 2019. 01. 07.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1924
 * Title : 2007년
 * description : 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오
                 입력 : 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다.
                        참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지,
                        4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
                 출력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다

 * solution : for문 사용.
              주어진 월의 전월들의 최대 날짜 수를 각각 더하고 주어진 일을 더한다.
              그리고 1을 뺀다. 그 값을 7로 나눈 나머지를 월요일에 더한 요일을 구한다.

 */
public class P1924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int month [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String day [] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        int x = sc.nextInt(); //월
        int y = sc.nextInt(); //일
        int value=0;
        for(int i=0; i<x-1; ++i){
            value+=month[i];
        }
        value+=y;
        System.out.println(day[(value-1)%7]);
        sc.close();
    }
}
