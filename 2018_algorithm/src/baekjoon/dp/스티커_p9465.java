/*
 * 스티커 2n개가 2*n 모양으로 배치되어 있다.
 * 스티커 한 장을 떼면 변을 공유하는 스티커는 모두 찢어져서 사용할 수 없다.
 * 점수의 합을 최대로 만드는 문제
 * D[i][j] = 2Xi에서 얻을 수 있는 최대 점수, i번 열에서 뜯는 스티커는 j
 * j=0 ->뜯지 않음
 * j=1 ->위쪽 스티커를 뜯음
 * j=2 -> 아래쪽 스티커를 뜯음
 * https://gist.github.com/Baekjoon/a05b5a7ef6e5cd8f7951
 */
package baekjoon.dp;

import java.io.*;

public class 스티커_p9465 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.valueOf(br.readLine());
		while(t-- >0) {
			int n = Integer.valueOf(br.readLine());
			long[][] a = new long[n+1][2];
			
		}
	}

}
