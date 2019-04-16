package string;
/*
 * Date: 2019. 04. 15
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1316
 * Title : 그룹 단어 체커
 * description : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
                 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
                 kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
                 입력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다.
                        단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

                 출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.

 * solution : 문자열 문제
 *            배열을 쓰기 싫다..
 *            방법이 없을까...내 머리론 배열 안쓰면,,,삼중 for문이 될것같은데........
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class P1316v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = num;

        while(num-- >0){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            boolean [] check = new boolean[26]; // a = 97 이용
            input.toLowerCase();

            for(int i=1; i<input.length(); ++i){
                if(input.charAt(i-1)!=input.charAt(i)){
                    if(check[input.charAt(i)-97]){
                        count--;
                        break;
                    }else
                        check[input.charAt(i-1)-97] = true;
                }
            }
        }
        br.close();
        System.out.println(count);
    }
}
