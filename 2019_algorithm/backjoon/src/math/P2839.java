package math;

import java.util.Scanner;

/*
 * Date: 2019. 01. 03.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2839
 * Title : 설탕배달
 * description : 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다
                 입력 : 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
                 출력 : 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
 * solution : 1. 설탕을 최대 5키로로 담는다. = 입력값을 5로 나눈다. 아래부터 반복문.
              2. 설탕이 5키로로 한번에 담아지지 않는다면 = 입력값을 5로 나눈 나머지가 0이 아니라면
              3. 설탕을 3키로씩 담는다. = 입력값을 3으로 뺀다.
              4. 만약에 설탕이 5키로로 한번에 담아진다면 = 입력값을 5로 나눈 나머지가 0이라면
              5. 결과값을 출력하고, 입력값이 음수가 된다면 -1을 출력한다.

 */
public class P2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        while(n%5!=0 && n>=0){
            n-=3;
            count++;
        }

        int answer = n<0 ? -1 : count+n/5;
        System.out.println(answer);
        sc.close();
    }
}
