package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 23
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/4153
 * Title : 직각삼각형
 * description : 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
 * 				 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 *
				 입력 : 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
				 		각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.

                 출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

 * solution :
 */
public class P4153 {
	// 좋은코드인가..
	static String Y = "right";
	static String N = "wrong";

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int [] t = new int[3];

			while(true){
				StringTokenizer st = new StringTokenizer(br.readLine());
				t[0] = Integer.parseInt(st.nextToken());
				t[1] = Integer.parseInt(st.nextToken());
				t[2] = Integer.parseInt(st.nextToken());

				Arrays.sort(t);

				if(t[0]==0) break;

				System.out.println(t[2]*t[2] == (t[0]*t[0] + t[1]*t[1])?Y:N);
			}
			br.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
