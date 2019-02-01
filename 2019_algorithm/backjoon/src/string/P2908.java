package string;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Date: 2019. 02. 01
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
              String클래스는 불변 객체이기 때문에 문자열 연산이 많은 프로그래밍이 필요할 때 계속해서 인스턴스를 생성하므로
              성능이 떨어지지만 조회가 많은 환경, 멀티쓰레드 환경에서 성능적으로 유리하다.

              StringBuffer클래스와 StringBuilder클래스는 문자열 연산이 자주 발생할 때 문자열이 변경가능한 객체기 때문에 성능적으로 유리하다.

              StringBuffer와 StringBuilder의 차이점은 동기화지원의 유무이다.
              동기화를 고려하지 않는 환경에서 StringBuilder가 성능이 더 좋고,
              동기화가 필요한 멀티쓰레드 환경에서는 StringBuffer를 사용하는 것이 유리하다.

 */
public class P2908 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력한 문자를 stringbuilder 클래스에 생성
        StringBuilder sb = new StringBuilder(br.readLine());

        // stringbuilder클래스에 생성한 문자열을 역순(reverse)한다.
        // 그리고 역순한 그 문자를 StringTokenizer 클래스에 생성한다.
        StringTokenizer st = new StringTokenizer(sb.reverse().toString());

        // 띄어쓰기 단위로 문자열을 int형으로 파싱해서 각각 저장한다.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

        // A와B 비교한다.
        // BufferedWriter은 string형이라서 숫자 크기(int) 한 결과를 파싱해준다.
        bw.write(String.valueOf(Math.max(A,B)));
        bw.flush();
    }
}
