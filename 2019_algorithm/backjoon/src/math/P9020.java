package math;

import java.util.*;

/*
 * Date: 2019. 07. 21
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/9020
 * Title : 골드바흐의 추측
 * description : 1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
 * 				 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다.
 * 				 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

				 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
				 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
				 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
				 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

				 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
				 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

                 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
                  		각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)

                 출력 : 각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다.
                  		출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.

 * solution : 소수 찾기
 * 			  에라토스테네의 체로
 * 			  주어진 수가 짝수만 주어지는 것은,, 뭔가 나누어 떨어진다는거겟지...
 * 			  주어진 수 이하의 소수 목록을 구해놓는다.
 * 			  주어진 수를 반으로 나누고, 두개의 변수에 각각 저장을 한다.
 * 			  그리고 그 각각의 변수들을 하나씩 감소(1까지), 하나씩 증가(n-1까지)하면서 그 값이 소수목록에 있는지 확인한다.
 * 			  소수가 맞으면 하나씩 감소한 변수의 값을 저장한다.
 * 			  서로의 차이가 가장 작은 것을 찾는거니까, 파티션 중에서 감소하는 변수가 가장 큰 것이 답이다.
 */
public class P9020 {
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

	static void solution(int n, int a, int b, List<Integer> list){
		int result=0;

		while(a>0 && b<n){
			if((Collections.binarySearch(list,a)>=0) && (Collections.binarySearch(list,b)>=0) ) {
				result = Math.max(result, a);
			}
			a--;
			b++;
		}
		System.out.println(result+" "+(n-result));
	}

	static boolean preRequest(int n){
		if (n % 2 != 0) {
			System.out.println("짝수 입력하셈.");
			return false;}
		if(n<4 || n>10000) {
			System.out.println("범위 확인하셈.");
			return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- >0){
			int n = sc.nextInt();

			if(!preRequest(n)) continue;
			List<Integer> primeList = isPrime(n);

			int a = n/2;
			int b = n-a;

			solution(n,a,b,primeList);
		}
		sc.close();
	}
}
