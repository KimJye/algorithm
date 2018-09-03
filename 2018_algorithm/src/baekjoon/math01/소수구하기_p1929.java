/*
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
package baekjoon.math01;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수구하기_p1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Boolean> primeList;
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if((a|b)<=1) return;
		
		primeList = new ArrayList<Boolean>(b+1);
		
		primeList.add(false);
		primeList.add(false);
		
		for(int i=2; i<=b;++i) {
			primeList.add(i,true);
		}
		
		for(int i=2; (i*i)<=b; ++i) {
			if(primeList.get(i)) {
				for(int j=i*i; j<=b; j+=i) primeList.set(j, false);
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for(int i=a; i<=b; ++i) {
			if(primeList.get(i)==true) {
				builder.append(i);
				builder.append("\n");
			}
		}
		System.out.println(builder.toString());

	}

}
