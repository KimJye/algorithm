/*

 * ���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

 */

package baekjoon.math01;

import java.util.Scanner;

public class GCD��_p9613 {
	
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else {
			return gcd(b, a%b);
		}
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		while(t-- >0) {
			
			int n = input.nextInt();
			
			int [] arr = new int[n];
			
			for(int i=0; i<n; ++i) {
				arr[i] = input.nextInt();
			}
			
			long sum=0;
			
			for(int i=0; i<n; ++i) {
				for(int j=i+1; j<n; ++j) {
					
					sum+=gcd(arr[i],arr[j]);
				}
			}
			
			System.out.println(sum);
		}
	
	}

}
