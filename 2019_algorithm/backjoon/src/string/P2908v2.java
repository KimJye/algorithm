package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 04. 16
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2908
 * Title : 상수
 * description : 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다.
                 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다.
                 그 다음에 크기가 큰 수를 말해보라고 했다. 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
                 예를 들어, 734과 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
                 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

                 출력 : 첫째 줄에 상수의 대답을 출력한다.

 * solution : 문자열 문제
 *            reverse
 */
public class P2908v2 {

    static boolean preRequisites(String a, String b){
        if(a.equals(b)) return false;
        if((a.length()+b.length())!=6) return false;
        if(a.contains("0") || b.contains("0")) return false;
        return true;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine()); // 입력받은 문자 전체를 reverse하기위함.
        br.close();
        StringTokenizer st = new StringTokenizer(sb.reverse().toString()); // reverse한 문자를 공백으로 나눈다.

        String A = st.nextToken();
        String B = st.nextToken();
        // 조건
        if(!preRequisites(A,B)) return;

        // 출력
        System.out.println(Math.max(Integer.parseInt(A), Integer.parseInt(B)));


    }
}
