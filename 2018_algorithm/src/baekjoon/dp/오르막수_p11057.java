/*
 * 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이 때, 인접한 수가 같아도 오름차순으로 친다.

예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.

수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.
첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.
https://gist.github.com/Baekjoon/264f68b19e93cc9b46aa
 */
package baekjoon.dp;

import java.util.Scanner;

public class 오르막수_p11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[][]d = new int[101][101];
		
		int sum=0;
		
		for(int i=0; i<=9; ++i) d[1][i]=1;
		
		for(int i=2; i<=num; ++i) {
			for(int j=0; j<=9; ++j) {
				for(int k=0; k<=j; ++k) {
					d[i][j] +=d[i-1][k];
					d[i][j] %=10007;
				}
			}
		}
		
		for(int i=0; i<10; ++i) sum += d[num][i];
		sum %= 10007;
		
		System.out.println(sum);
	}
}

/*
 * 재귀로 풀기
 * import java.util.Scanner;
 
public class Main {
    
    public static int[][] dp;
    public static int N;
    final static int mod =10007;
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        sc.close();
        
        dp =  new int[1001][10];
        int max=0;
        for(int i=0; i<10; i++){
             max += f(N,i)%mod; 
        }
        
        System.out.println(max%mod);
    } 
    
    public static int f(int N,int i){
        
        if(dp[N][i]>0)return dp[N][i];
        if(N==0)return 0;
        if(N==1 || i==0) return 1;
        
        for(int s=0; s<=i; s++){
            
            dp[N][i]+=f(N-1,s)%mod;
        }
        
        return dp[N][i];
    }
    }




 */
