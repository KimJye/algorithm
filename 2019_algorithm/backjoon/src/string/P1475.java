package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Date: 2019. 05. 20
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1475
 * Title : 방번호
 * description : 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
                 다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
                  다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오.
                  (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

                 입력 : 첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.

                 출력 : 첫째 줄에 필요한 세트의 개수를 출력한다.

 * solution : 문자열
 *            규칙찾기
 */
public class P1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        br.close();
        input = input.replace('6','9');

        int [] number = new int[10];

        for(int i=0; i<input.length(); ++i){
            ++number[input.charAt(i)-'0'];
        }

        number[9]= number[9]/2 + number[9]%2;

        int answer = Arrays.stream(number)
                .max()
                .getAsInt();

        System.out.println(answer);

    }
}
