// 백준에서는 틀렸다고함...
package baekjoon.io;

import java.util.Scanner;

public class p11022 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;//개수
		int a = 0,b=0;
		
		num=input.nextInt();
	
		int [] array = new int[num];
		
		for(int i=0;i<num;++i) {
			a=input.nextInt();
			b=input.nextInt();
			array[i]=a+b;
			System.out.printf("Case #%d : %d + %d = %d",i+1,a,b,array[i]);
			System.out.println();
		}
		
	
	}
}
