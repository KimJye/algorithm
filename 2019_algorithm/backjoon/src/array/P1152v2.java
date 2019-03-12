package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 03. 12
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1152
 * Title : 단어의 개수
 * description : 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
                 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

                 입력 : 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다.
                        이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.
                        또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다

                 출력 : 첫째 줄에 단어의 개수를 출력한다.


 * solution : 단계별 문제 풀이 - 1차원 배열
                1. 입력 문자열의 길이가 기니까 BufferedReader를 사용한다.
                2. 띄어쓰기로 단어를 구분하니까 StringTokenizer를 쓰자.

Stream : 키보드에서 운영체제로 운영체제에서 프로그램으로 보내주는 무엇인가. 즉, 키보드를 누르면 운영체제가 캐치하여 스트림을 워드 프로그램으로 보내준다.
InputStreamReader : 문자 스트림을 읽기 위한 클래스.
BufferedReader : 다른 Reader들을 버퍼링 하기 위한 클래스. 버퍼는 데이터를 저장했다가 한번에 CPU에 넘겨준다.
 즉, 1. 키보드에서 입력한 문자열을 키보드 버퍼에 저장
     2. 문자열이 JVM에 전달되고, 전달된 문자는 InputStream 객체(System.in)로 저장.
     3. InputStreamReader 객체를 생성하고 BufferedReader클래스 객체 생성한다.
     4. BufferedReader 클래스에는 버퍼가 있어서 문자열을 버퍼에 저장해놓았다가
     5. readerLine() 메소드를 통해 한 줄을 한번에 읽어 들인다.

 구분자 사이에 데이터가 없는 경우 split만 공백의 데이터를 반환한다.
 따라서 다수의 정형화된 문자열을 분리하는데는 StringTokenizer가 편리하지만
 정형화 되지 않은 문자열을 분리하는 경우와 인덱스 접근의 경우는 String.split()가 더 편리할 수 있다.
 성능적 측면 : split은 당연히 String 배열로 남아있지만 , StringTokenizer는 next를 할때 마다 이전 토큰은 사라진다.
               split함수는 함수가 호출될 때마다 정규 표현식을 사용하기 때문에 수행속도가 느리다.

               * 정규 표현식을 사용하기 때문에 느린 이유는 무엇일까?

 */
public class P1152v2 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        br.close();

        StringTokenizer st= new StringTokenizer(input); // 따로 지정안하면, 기본 공백으로 split

        int answer = st.countTokens();

        System.out.println(answer);

    }
}
