// 백준에서는 틀렸다고함..
package baekjoon.io;

import java.util.Scanner;

public class p11021 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;//개수
		int a,b;
		
		num=input.nextInt();
	
		int [] array = new int[num];
		
		for(int i=0;i<num;++i) {
			a=input.nextInt();
			b=input.nextInt();
			array[i]=a+b;
		}
		
		for(int i=1; i<=array.length; ++i) {
			System.out.printf("Case #%d : %d",i,array[i-1]);
			System.out.println();
		}
	}
}
