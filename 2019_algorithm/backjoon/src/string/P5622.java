package string;

import java.io.*;

/*
 * Date: 2019. 02. 02
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/5622
 * Title : 다이얼
 * description : 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
                 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
                 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
                 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오

                 입력 : 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.
                 출력 : 첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.

 * solution : 문자열 문제
              switch문을 생각했으나 그동안 알파벳 관련 배열 문제가 생각났다.
              charAt(index)-65는 해당 문자열의 인덱스를 표현하기 위함이다.
              A는 index 0, B는 index 1을 뜻하기 위함.
 */

public class P5622 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] alph = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,10,10};

        String str = br.readLine();
        br.close();

        int count=0;

        for(int i=0; i<str.length(); ++i){
            count+=alph[str.charAt(i)-65];
        }
        bw.write(Integer.toString(count));
        bw.flush();
    }
}
