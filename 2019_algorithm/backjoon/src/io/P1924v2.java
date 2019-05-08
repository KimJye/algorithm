package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

/*
 * Date: 2019. 05. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1924
 * Title : 2007년
 * description : 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오
                 입력 : 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다.
                        참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지,
                        4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
                 출력 : 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다

 * solution : 자바 Calendar 사용
 *            자바의 calendar에서 월은 0부터 시작한다.
 *            Calendar.DAY_OF_WEEK : 해당 날짜의 요일을 1~7까지의 숫자로.(일~토)
 */
public class P1924v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calendar c = Calendar.getInstance();

        String days [] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x=0;
        int y=0;

        while(st.hasMoreTokens()){
            x = Integer.parseInt(st.nextToken()); // 월
            y = Integer.parseInt(st.nextToken());// 일
        }


        br.close();

        c.set(2007,x-1,y); // 날짜 세팅

        int day = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(days[day-1]);
    }
}
