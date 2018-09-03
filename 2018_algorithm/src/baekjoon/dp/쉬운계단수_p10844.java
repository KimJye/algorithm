/*
 * 45656�̶� ���� ����.

�� ���� ������ ��� �ڸ����� ���̰� 1�� ����. �̷� ���� ��� ����� �Ѵ�.

�����̴� ���� ���̰� N�� ��� ���� �� �� �ִ��� �ñ�������.

N�� �־��� ��, ���̰� N�� ��� ���� �� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (0���� �����ϴ� ���� ����.)
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
ù° �ٿ� ������ 1,000,000,000���� ���� �������� ����Ѵ�.
D[i][j] = ���̰� i�̰� ������ ���ڰ� j�� ��� ���� ����
D[i][j] = D[i-1][j-1]+ D[i-1][j+1]
https://gist.github.com/Baekjoon/7e4e12ce1b0aa740d5d1
 */
package baekjoon.dp;

import java.util.Scanner;

public class �����ܼ�_p10844 {
	//��ͷ� Ǯ��
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




	/* �ݺ������� Ǯ��

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

