package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

/*
 * Date: 2019. 07. 21
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/4948
 * Title : 베르트랑 공준
 * description : 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
				 이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

				 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19)
				 			또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

                 입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
                 		각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
						입력의 마지막에는 0이 주어진다.

                 출력 : 각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.

 * solution : 소수 찾기
 *			  기존에 구현한 에라토스테네의 체를 이용한다.
 *			  2n의 소수 개수와 n의 소수 개수를 빼면 된다.
 */
public class P4948 {
	static List<Integer> isPrime(int n) {
		List<Boolean> primeList = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);

		for(int i=2; i<=n; i++ )
			primeList.add(i, true);

		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*2; j<=n; j+=i) primeList.set(j, false);
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i)
			if (primeList.get(i)) result.add(i);

		return result;
	}

	public static int solution(int n){
		int m = 2*n;

		return isPrime(m).size() - isPrime(n).size();

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;
			System.out.println(solution(n));
		}
		br.close();
	}
}
