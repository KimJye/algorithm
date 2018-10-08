package greedy;

import java.util.Scanner;
// N 과 K가 1일때를 생각하자.

/*
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만드려고 한다. 이 때 필요한 동전 개수의 최소값을 구하는 프로그램을 작성하시오
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

 */
/*
 *  알고리즘 스터디 피드백 : stack을 쓰는 방법도 있음.=>이유 : 큰 수 부터 뺴야하니까. 즉 뒤부터 뺀거니까. 인덱스 잘 안쓸때
 */
public class 동전0_p11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt(); //동전 종류 입력
		int K = input.nextInt(); // 구하고자하는 동전의 가치 합 입력
		
		int arr [] = new int[N];
		int count=0;
		
		for(int i=0; i<N; ++i) {
			arr[i] = input.nextInt();
		}
		
		for(int i=N-1; i>=0; --i) {
			if(arr[i]<=K) {
				while(K>=arr[i]) {
					K-=arr[i];
					count++;
				}
			}
		}
		input.close();
		System.out.println(count);
	}

}
