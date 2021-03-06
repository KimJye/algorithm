package string;

import java.util.Scanner;

/*
 * Date: 2019. 01. 18
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/11654
 * Title : 아스키 코드
 * description : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

                 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

                 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.

 * solution : 문자열 문제
              charAt-'0' 은 문자를 숫자로 바꿀때.
              이 문제는 문자의 아스키 코드 값을 출력.
 */
public class P11654 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int input = sc.next().charAt(0);
        char str = sc.next().charAt(0);
        System.out.println((int) str);
    }
}
