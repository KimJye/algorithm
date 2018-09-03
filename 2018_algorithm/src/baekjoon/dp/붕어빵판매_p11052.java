/*
 * �ؾ N���� ������ �ִ�.
 * �ؾ i���� �ȾƼ� ���� �� �ִ� ������ P[i]�� ��, N���� ��� �Ǹ��ؼ� ���� �� �ִ� �ִ� ���� ���ϱ�
 * D[i]= �ؾ i���� �ȾƼ� ���� �� �ִ� ġ�� ����
 * ������ ��� �����غ���
 * �ؾ 1���� P[1]�� �ȱ� -> ���� �ؾ�� ���� : i-1
 * �ؾ i���� P[i]�� �ȱ� -> ���� �ؾ�� ���� : 0 -> P[i]+D[0]
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

public class �ؾ�Ǹ�_p11052 {

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


/* ��ͷ� Ǯ��

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