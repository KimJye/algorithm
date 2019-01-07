package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 01. 07.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/11721
 * Title : 열 개씩 끊어 출력하기
 * description : 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
                 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
                 입력 : 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며,
                        길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
                 출력 : 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다.
                        단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다
 * solution : for문 사용.

 */
public class P11721 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for(int i=1; i<=input.length(); ++i){
            System.out.print(input.charAt(i-1));
            if(i%10==0)
                System.out.println();
        }
        br.close();
    }
}
