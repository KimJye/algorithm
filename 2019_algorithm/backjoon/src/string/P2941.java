package string;

import java.io.*;

/*
 * Date: 2019. 02. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2941
 * Title : 크로아티아 알파벳
 * description : 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
                 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
                 dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다.
                 위 목록에 없는 알파벳은 한 글자씩 센다.

                 입력 : 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
                        단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

                 출력 : 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.


 * solution : 문자열 문제
              contains( ) 메서드 : 특정 문자열이 포함되어 있는지 확인하는 기능을 한다. 특정 문자열이 포함되어 있다면 true를 없다면 false를 반환한다.
              replace("기존문자", "바꿀 문자열")  replace는 첫번째 인자값에 문자열만 들어감.
              replaceAll("기존문자", "바꿀 문자열") replaceAll는 첫번째 인자값에 정규식이 들어감.
 */

public class P2941 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] alph={"c=","c-","dz=","d-","lj","nj","s=","z="};

        String input = br.readLine();

        for(int i=0; i<alph.length; ++i){
            if(input.contains(alph[i])){
                input = input.replace(alph[i],"@");
            }
        }
        br.close();
        bw.write(Integer.toString(input.length()));
        bw.flush();
    }
}
