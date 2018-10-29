package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9분할하기. 재귀문제.
public class P1780_종이의개수 {
	
	public static boolean same(int[][] a, int x, int y, int n) {

		for (int i=x; i<x+n; i++) {

			for (int j=y; j<y+n; j++) {

				if (a[x][y] != a[i][j]) {

					return false;

				}

			}

		}

		return true;

	}
	public static void solve(int[][] a, int[] cnt, int x, int y, int n) {

		if (same(a, x, y, n)) {

			cnt[a[x][y]+1] += 1;

			return;

		}

		int m = n/3;

		for (int i=0; i<3; i++) {

			for (int j=0; j<3; j++) {

				solve(a, cnt, x+i*m, y+j*m, m);

			}

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[][] a = new int[n][n];
		int[] cnt = new int[3];

		for(int i=0; i<n; ++i) {
			String [] line = br.readLine().split(" ");
			for(int j=0; j<n; ++j) {
				a[i][j] = Integer.valueOf(line[j]);
			}
		}
		solve(a,cnt,0,0,n);

		for(int i=0; i<3; ++i) {
			System.out.println(cnt[i]);
		}
	}

}
