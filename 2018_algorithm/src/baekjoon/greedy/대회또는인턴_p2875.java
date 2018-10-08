package greedy;

import java.util.Scanner;

public class 대회또는인턴_p2875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		
		int result =0;
		
		while(n>=2 && m>=1 && m+n>=k+3) {
			result++;
			n-=2;
			m-=1;
		}
		System.out.println(result);
	}

}
