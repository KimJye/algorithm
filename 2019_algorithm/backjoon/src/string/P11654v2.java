package string;

import java.util.Scanner;

/*
 * Date: 2019. 03. 28
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/11654
 * Title : 아스키 코드
 * description : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

                 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

                 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.

 * solution : 문자열 문제
 * 풀이 과정 : 소문자,대문자=>int형 변환
 *             숫자=>char형 변환
 *             그냥 다 문자로 받고 int형변환
 *             scanner는 char형 입력이 없어서 charAt(0)을 쓰자.
 */
public class P11654v2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.next().charAt(0);
        System.out.println(input);
    }
}
