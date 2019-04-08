package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2675
 * Title : 문자열 반복
 * description : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
                 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
                 QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

                 입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
                        각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
                        S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
                        2
                        3 ABC
                        5 /HTP

                 출력 : 각 테스트 케이스에 대해 P를 출력한다.
                        AAABBBCCC
                        /////HHHHHTTTTTPPPPP

 * solution : 문자열 문제
 *            효율적으로 변함.
 */
public class P2675v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        while(num-- >0){
            st = new StringTokenizer(bf.readLine());
            String word[]=new String[2];
            while(st.hasMoreTokens()){
                word[0]=st.nextToken();
                word[1]=st.nextToken();
            }
            for(int i=0; i<word[1].length(); ++i){
                 for(int j=0; j<Integer.parseInt(word[0]); ++j)
                     System.out.print(word[1].charAt(i));
            }
            System.out.println();
        }
        bf.close();

    }
}
