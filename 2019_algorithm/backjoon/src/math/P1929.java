package math;

import java.io.*;
import java.util.*;

/*
 * Date: 2019. 07. 21
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1929
 * Title : 소수 구하기
 * description : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

				첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)


                 입력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)

                 출력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

 * solution : 에라토스테네의 체로 구하라.
 */
public class P1929 {
	static List<Integer> solution(int n) {
		List<Boolean> primeList = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);

		// 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ )
			primeList.add(i, true);

		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		if(N<=1) return;
		List<Integer> primeNumbers = solution(N);
		int index = Collections.binarySearch(primeNumbers, M);
		for (int i = index; i < primeNumbers.size(); ++i) {
			bw.write(String.valueOf(primeNumbers.get(i)));
			bw.newLine();
		}
	}
}
