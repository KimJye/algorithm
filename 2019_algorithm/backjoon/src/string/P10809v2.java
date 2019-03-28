package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Date: 2019. 03. 28
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10809
 * Title : 알파벳 찾기
 * description : 알파벳 소문자로만 이루어진 단어 S가 주어진다.
                 각각의 알파벳에 대해서 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며 알파벳 소문자로만 이루어져 있다.

                 출력 : 각각의 알파벳에 대해서 a가 처음 등장하는 위치, b가 처음 등장하는 위치 ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

                        만약 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고 두 번째 글자는 1번째 위치이다.

 * solution : 문자열 문제.
 * 풀이 과정 : 크기가 26인 배열 check를 만든다.
               입력한 문자를 글자 하나하나 탐색한다.
 *             탐색한 문자가 'c'라면, check[c-97]=i
 *             이유는 a는 97이라서 97을빼면 0이니까 인덱스를 표현한다. 그 인덱스에 글자 하나하나 탐색할때 순서를 넣는다.
 *             주의할 점은 중복문자인데, i를 넣을때 기존 인덱스에 해당하는 값이 들어있으면 넣어주지 않는다.
 *             v1보다 코드수는 더 많지만 메모리,시간 많이 줄임
 */
public class P10809v2 {
    //조건 : 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져있다=>입력한 것과 입력한것을 toLower했을때와 비교했을때 다르면 false
    static boolean preRequisites(String s){

        if(s.length()>100) return false;
        if(!s.equals(s.toLowerCase())) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        bf.close();

        if( !preRequisites(input)) return;

        int [] check = new int[26]; // 알파벳 26개

        Arrays.fill(check,-1); // -1로 초기화

        for(int i=0; i<input.length(); ++i){
            if(check[input.charAt(i)-97]==-1)
                check[input.charAt(i)-97]=i;
        }

        for(int result : check)
            System.out.print(result+" ");
    }
}
