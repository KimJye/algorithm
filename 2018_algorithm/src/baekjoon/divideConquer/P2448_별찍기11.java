package divideConquer;

import java.util.Scanner;

public class P2448_º°Âï±â11 {
	static char [][] c;
	
	static void solve(int x, int y, int n) {
		if(n==3) {
			c[x][y]='*';
			c[x-1][y+1]='*';
			c[x+1][y+1]='*';
			c[x-2][y+2]='*';
			c[x-1][y+2]='*';
			c[x][y+2]='*';
			c[x+1][y+2]='*';
			c[x+2][y+2]='*';
		}
		
		int div = n/2;
		solve(x,y,div);
		solve(x-div, y+div,div);
		solve(x+div, y+div, div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		c = new char[n][n];
		
		for(int i=0; i<2*n-1; ++i) {
			for(int j=0; j<n; ++j) {
				c[i][j]=' ';
			}
		}
		
		solve(n-1,0,n);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<2*n-1;++j) {
				sb.append(c[i][j]);
				sb.append("\n");
			}
		}
		input.close();
	}

}
