/*
 * A와 P가 주어졌을 떄, 다음과 같은 수열을 정할 수 있다.
 * D[1]=A
 * D[n] = D[n-1]의 각 자리 숫자를 P번 곱한 수의 합
 * A=57, P=2인 경우
 * D[1] = 57
 * D[2]= 5*5 +7*7 = 74
 * D[3]= 7*7 +4*4 = 65
 * D[4]= 6*6 +5*5 = 61
 * 계속해서 수를 만들다가 이전에 만들었던 수를 만들면 그 수가 몇 번째로 만들었던 수인지 리턴하면 된다.
 * int length(int a, int p, int cnt) {
 *  if (check[a] != 0) {
 *   return check[a]-1; 
 *   }
 *   check[a] = cnt; 
 *   int b = next(a, p);
 *    return length(b, p, cnt+1); 
 *    }
 * https://gist.github.com/Baekjoon/a8f0c8b8e92994f9b68cbf526136593f
 */
package baekjoon.graph;

public class 반복수열_p2331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
