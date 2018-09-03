/*
 * 붕어빵 N개를 가지고 있다.
 * 붕어빵 i개를 팔아서 얻을 수 있는 수익이 P[i]일 때, N개를 모두 판매해서 얻을 수 있는 최대 수익 구하기
 * D[i]= 붕어빵 i개를 팔아서 얻을 수 있는 치대 수익
 * 가능한 경우 생각해보기
 * 붕어빵 1개를 P[1]에 팔기 -> 남은 붕어빵의 개수 : i-1
 * 붕어빵 i개를 P[i]에 팔기 -> 남은 붕어빵의 개수 : 0 -> P[i]+D[0]
 * D[i] = max(P[j]+D[i-j]) (1<_j<_i)
 * for (int i=1; i<=n; i++) {
	for (int j=1; j<=i; j++) {
		d[i] = max(d[i],d[i-j]+a[j]);
	}
}
 * https://gist.github.com/Baekjoon/efaf5dee617b4ee9d305
 */
package baekjoon.dp;

import java.util.Scanner;

public class 붕어빵판매_p11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int [] d = new int [num+1];
		int [] p = new int [num+1];
		
		for(int i=1; i<=num; ++i) {
			p[i]=input.nextInt();
		}
		d[0] =0;
		for(int i=1; i<=num; ++i) {
			d[i]=0;
			for(int j=1; j<=i; ++j) {
				d[i] = Math.max(d[i],d[i-j]+p[j]);
			}
		}
		System.out.println(d[num]);
		input.close();
	}

}


/* 재귀로 풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n+1];
        int i=1;
        while(st.hasMoreTokens()){
            arr[i++]=Integer.parseInt(st.nextToken());
        }
        
        System.out.println(f(arr,n));
    }
    
    public static int f(int[] arr, int n){
        int[] dp = new int[n+1];
        dp[1]=arr[1];
        
        for(int i=2; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                if(i-j>=0)
                dp[i]=Math.max(dp[i],dp[i-j]+arr[j]);
            }
        }
        return dp[n];
    }
}



*/