package divideConquer;

import java.util.Scanner;

// Æ²·È½À´Ï´Ù..
public class P2447_º°Âï±â10 {
	static char [][] star;
	
	static void solve(int x, int y, int num) {
		if(num==1) {
			star[x][y]='*';
			return;
		}
		int div = num/3;
		
		for(int i=0; i<3; ++i) {
			for(int j=0; j<3; ++j) {
				if(i==1 && j==1)
					return;
				else
					solve(x+(i*div),y+(j*div), div);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		star = new char[n][n];
		solve(0,0,n);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				sb.append(star[i][j]);
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
