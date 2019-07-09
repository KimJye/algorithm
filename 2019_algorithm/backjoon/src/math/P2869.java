package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2869
 * Title : 달팽이는 올라가고 싶다
 * description : 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
			     달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
			     또, 정상에 올라간 후에는 미끄러지지 않는다.
			     달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

                 출력 : 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

 * solution : 시간 제한 : 0.15초
 *
 * 			  높이 V
 * 			  낮 A
 * 			  밤 B
 *
 * 낮*일 - 밤(일-1) >= 높이
 * 목표에 도달하는게 낮인데, 목표에 도달하면 미끄러지는 작업이 필요없다.
 * 따라서 미끄러짐은 목표 도달하는 일수가 밤보다 하루 적다.
 *
 * A*X - B(X-1) >=V
 * AX -BX +B >=V
 * AX -BX >= V-B
 * X(A-B) >= V-B
 * X >= (V-B) / (A-B)
 *
 * 소수점나오면 올림 필수 => Math.ceil
 */
public class P2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		System.out.println((int)Math.ceil((double)(V-B)/(double)(A-B)));
		br.close();
	}
}
