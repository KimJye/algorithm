package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 06. 14
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1978
 * Title : 소수 찾기
 * description : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

                 입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
                 		다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

                 출력 : 주어진 수들 중 소수의 개수를 출력한다.

 * solution : 소수 구하기
 * 			  소수란 약수가 1과 자기 자신 뿐인 수.
			 소수는 1과 N 만을 약수로 가진다.
		  	 그럼 2부터 N-1까지의 수로는 나눠져서는 안된다.
		 	 소수는 n의 배수가 아니어야 한다.
			 그러나 모두 나누어볼 필요없이, 루트 n 까지만 나누어서 떨어지면 소수가 아니다.
 */
public class P1978v2 {

	static int count = 0;

	static void solution(int n) {
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; ++i) {
			if (n % i == 0) {
				count++;
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if(num<=1) count++;
			solution(num);
		}
		br.close();
		System.out.println(N-count);
	}
}
