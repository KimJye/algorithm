/*
 * ������ ���� ���� �ڸ��� ���������� �̷�� ���� ���Ѵ�. �� ��, ������ ���� ���Ƶ� ������������ ģ��.

���� ���, 2234�� 3678, 11119�� ������ ��������, 2232, 3676, 91111�� ������ ���� �ƴϴ�.

���� ���� N�� �־����� ��, ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� 0���� ������ �� �ִ�.
ù° �ٿ� N (1 �� N �� 1,000)�� �־�����.
ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
https://gist.github.com/Baekjoon/264f68b19e93cc9b46aa
 */
package baekjoon.dp;

import java.util.Scanner;

public class ��������_p11057 {

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
 * ��ͷ� Ǯ��
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
