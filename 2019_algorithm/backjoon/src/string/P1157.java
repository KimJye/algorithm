package string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Date: 2019. 01. 19
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1157
 * Title : 단어 공부
 * description : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
                 단, 대문자와 소문자를 구분하지 않는다.

                 입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다..

                 출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

 * solution : 문자열 문제
              아스키 코드를 이용. A=65.
 */
public class P1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase(); //대문자로
        br.close();

        int [] alph = new int[26];

        for(int i=0; i<input.length(); ++i){
            alph[input.charAt(i)-65]++;
        }

        int max=alph[0];
        int num=0;

        for(int i=0; i<alph.length; ++i) {
            if (max < alph[i]) {
                max=alph[i];
                num=i;
            }
        }
        //System.out.println((char)(max+65));
        Arrays.sort(alph);

        if(alph[24]==alph[25]){
            System.out.println("?");
        }else{
            System.out.println((char)(num+65));
        }
    }
}
