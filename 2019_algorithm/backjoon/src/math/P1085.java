package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 22
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1085
 * Title : 직사각형에서 탈출
 * description : 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다.
 * 				 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

				 입력 : 첫째 줄에 x y w h가 주어진다.
				 		w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고,
				 		y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.

                 출력 : 첫째 줄에 문제의 정답을 출력한다.
 */
public class P1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int left = Math.min(x,y);
		int right = Math.min((w-x),(h-y));
		System.out.println(Math.min(left,right));
		br.close();

	}
}
