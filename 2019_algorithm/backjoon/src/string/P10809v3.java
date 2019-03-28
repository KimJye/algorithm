package string;

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
 * 풀이 과정 : v1 코드를 참고했을 때, v2와 비교해보면, v1이 코드가 훨씬 간결하다.
 *             v2는 버퍼를 사용해서 더 효율적인지가 궁금해졌고 정답이었다.
 *             결국 v3가 가장 효율적이다.
 *             v2와 v3의 가장 큰 차이점은, v2에서 알파벳 배열을 만들었고 Arrays.fill()로 -1을 다 채운 후 아스키코드를 이용해서 해당 인덱스에 찾는 순서인 i값을 넣었다.
 *             그에비해, v3는 indexOf()를 이용하였다. indexOf()는 파라미터의 해당 인덱스 값을 즉시 리턴한다. 그래서 중복 걱정이 없다. 없으면 -1을 리턴한다.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        bf.close();

        // 조건
        if(input.length()>100) return;
        if(!input.equals(input.toLowerCase())) return;

        for(char c = 'a'; c<='z'; ++c){
            System.out.print(input.indexOf(c)+" ");
        }
    }
}
