/*
 * 45656이란 수를 보자.

이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
D[i][j] = 길이가 i이가 마지막 숫자가 j인 계단 수의 개수
D[i][j] = D[i-1][j-1]+ D[i-1][j+1]
https://gist.github.com/Baekjoon/7e4e12ce1b0aa740d5d1
 */
package baekjoon.dp;

import java.util.Scanner;

public class 쉬운계단수_p10844 {
	//재귀로 풀기
	 static int dp[][];
	   final static int mod= 1000000000;
	    
	    public static void main(String[] args) {
	            
	        Scanner sc = new Scanner(System.in);
	        int N=sc.nextInt();
	        
	        dp= new int[101][10];
	        int sum=0;
	        for(int i=0; i<10; i++){
	            sum= (sum+f(N,i))%mod;
	             
	        }
	      
	        System.out.println(sum);
	        sc.close();
	     }
	     
	    public static int f(int i, int j){
	        
	        if(j<0 || j>9) return 0;
	        if(i==0) return 0;
	        if(i==1 && j==0) return 0;
	        if(i==1) return 1;
	      
	       if(dp[i][j] > 0) 
	             return dp[i][j]; //memoization
	         
	          dp[i][j] = (f(i-1,j-1) + f(i-1, j+1));
	         
	         return dp[i][j];
	     }
}




	/* 반복문으로 풀기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][]d = new int[101][101];
		
		int sum=0;
		
		for(int i=1; i<10; ++i) {
			d[1][i]=1;
		}
		for(int j=2; j<=num; ++j) {
			for(int k=0; k<10; ++k) {
				if(k==0)
					d[j][k]=d[j-1][1]%1000000000;
				else if(k==9)
					d[j][k]=d[j-1][8]%1000000000;
				else
					d[j][k] = (d[j-1][k-1]+d[j-1][k+1])%1000000000;
			}
		}
		for(int i=0; i<10; ++i) {
			sum = (sum+d[num][i])%1000000000;
		}
		System.out.println(sum);
	}
	*/

