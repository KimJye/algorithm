package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Date: 2019. 06. 14
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2581
 * Title : 소수
 * description : 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
`				 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중
				 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

                 입력 : 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
						M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

                 출력 : M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
						단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

 * solution : 소수 구하기
 */
public class P2581 {

	// 제곱근까지 나눠서 나눠떨어지는지 여부 확인
	// 주어진 범위의 숫자들이 소수인지아닌지 판별한다.
	static void solution1(int m, int n) {

		List<Integer> list = new ArrayList();

		int sum = 0;

		boolean isPrimeNumber = true;

		for (int i = m; i <= n; ++i) {
			if (i == 0 || i == 1) {
				continue;
			}
			int sqrt = (int) Math.sqrt(i);

			for (int j = 2; j <= sqrt; ++j) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				list.add(i);
				sum += i;
			}
			isPrimeNumber = true;
		}
		if (list.isEmpty()) {
			System.out.print(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		solution1(M, N);
		br.close();
	}
}
