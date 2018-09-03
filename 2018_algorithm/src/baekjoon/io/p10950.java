/*
 * 2018.07.18
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
package baekjoon.io;

import java.util.Scanner;

public class p10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;//개수
		int a,b;
		
		num=input.nextInt();
	
		int [] array = new int[num]; //이렇게 구현하게되면 전체 입력이 매우 큰 경우에 매우 큰 크기의
									  // 배열을 필요하게 된다.
		
		for(int i=0;i<num;++i) {
			a=input.nextInt();
			b=input.nextInt();
			array[i]=a+b;
		}
		
		for(int arr : array) {
			System.out.println(arr);
		}
		
		/* 백준 풀이
		while(num-- >0) {
			int a,b;
			a= input.nextInt();
			b= input.nextInt();
			System.out.println(a+b);
		}
		*/
	}

}
