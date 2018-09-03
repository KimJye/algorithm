/*
 * n개의 정수로 이루어진 임의의 수열이 주어진다.
 * 우리는 이 중 연속된 몇 개의 숫자를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다.
 * 단, 숫자는 한개 이상 선택해야 한다.
 * 예를 들어서 10,-4,3,1,5,6,-35,12,21,-1 이라는 수열이 주어졌다고 하자.
 * 여기서 정답은 12+21인 3이 정답이 된다.
 * D[i] = i번째 수로 끝나는 가장 큰 연속합
 * 이렇게 식을 구했으면, i번째 수에게 가능한 경우를 세야한다.
 * i번째 수에게 가능한 경우
 * 1. i-1번째 수의 연속합에 포함되는 경우
 * 2. 새로운 연속합을 시작하는 경우
 * D[i] = max(D[i-1]+A[i], A[i])
 * D[i] = i번째 수로 끝나는 가장 큰 연속합
 * https://gist.github.com/Baekjoon/885882aa75ec74535c45
 */
package baekjoon.dp;

public class 연속합_p1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
