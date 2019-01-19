package string;

import java.util.Scanner;

/*
 * Date: 2019. 01. 19
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10809
 * Title : 알파벳 찾기
 * description : 알파벳 소문자로만 이루어진 단어 S가 주어진다.
                 각각의 알파벳에 대해서 단어에 포함되어 있는 경우에는 처음 등장하는 위치를 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며 알파벳 소문자로만 이루어져 있다.

                 출력 : 각각의 알파벳에 대해서 a가 처음 등장하는 위치 b가 처음 등장하는 위치 ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고 두 번째 글자는 1번째 위치이다.


 * solution : 문자열 문제
              String의 indexOf 사용문제.
              indexOf()는 파라미터의 해당 첫 인덱스를 리턴하고 없으면 -1 리턴.
 */
public class P10809 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        sc.close();

        for(char c = 'a'; c<='z'; ++c){
           System.out.print(input.indexOf(c)+" ");
        }

    }
}
