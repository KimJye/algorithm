package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 04. 23
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
 */
public class P2941v2 {
    public static int solution(String s){
        String [] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String str = s;
        for(int i=0; i<croatia.length; ++i){
            if(str.contains(croatia[i])){
                str = str.replaceAll(croatia[i],"!");
            }
        }
        return str.length();
    }
    public static boolean preRequisites(String s){

        if(s.length()>100 || s.length()<=0) return false;
        String regx = "[a-z].*|[-,=].*";
        if(!s.matches(regx)) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        if(!preRequisites(input)) return;

        System.out.println(solution(input));
    }
}
