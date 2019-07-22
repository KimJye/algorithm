package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 22
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/3009
 * Title : 네 번째 점
 * description : 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

				 입력 : 첫세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

                 출력 : 직사각형의 네 번째 점의 좌표를 출력한다.

 * solution : xor
 */
public class P3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[][] = new int[3][2];

		for(int i=0; i<a.length; ++i){
			StringTokenizer st = new StringTokenizer(br.readLine());
			a[i][0] = Integer.parseInt(st.nextToken());
			a[i][1] = Integer.parseInt(st.nextToken());
		}

		int x = a[0][0]^a[1][0]^a[2][0];
		int y = a[0][1]^a[1][1]^a[2][1];

		System.out.println(x+" "+y);
		br.close();
	}
}
