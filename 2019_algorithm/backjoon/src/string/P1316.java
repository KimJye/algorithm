package string;

import java.io.*;
import java.util.StringTokenizer;

/*
 * Date: 2019. 01. 31
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
              간단하게 생각하면, 문자가 연속해서 나오지 않고 떨어져서 나오면 그룹 단어가 아니다.
              1. 크기가 26인 boolean 배열을 만든다. 이 배열의 인덱스는 알파벳을 의미한다. ex) index 0 = 'a', index 25 = 'z'
              2. 입력한 문자열 하나하나를 비교한다.
              3. 비교할때 문자 앞 뒤가 서로 다르고, 뒤 문자가 해당하는 인덱스의 값이 true이면 N--을 한다. false이면 앞 문자가 해당하는 인덱스의 값을 true로 저장.
              4. 비교할때 문자 앞 뒤가 서로 같으면 연속한다고 생각하여 넘어간다.
 */
public class P1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        //입력 N
        int n = Integer.parseInt(st.nextToken());
        //그룹 단어 갯수
        int count = n;

        while(n-- >0){
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();

            boolean check[] = new boolean[26];//초기 false임.

            for(int i=1; i<word.length(); ++i){
                if(word.charAt(i-1)!=word.charAt(i)){
                    if(check[word.charAt(i)-97]==true){
                        count--;
                        break;// 문자 하나하나 탐색하다가 한글자라도 그룹 단어가 아니면 그 뒤는 count할 필요가 없음.
                    }else{
                        check[word.charAt(i-1)-97]=true;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

    }
}
