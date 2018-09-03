/*
 * 2진수에서 8진수로 변환
 */
package baekjoon.math01;

import java.util.*;

public class 이진수애서8진수_p1373 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String s = sc.nextLine(); 
		
		int n = s.length(); 
		
		if (n%3 == 1) { 
			System.out.print(s.charAt(0)); 
		} else if (n%3 == 2) { 
			System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0')); 
		} 
		
		for (int i=n%3; i<n; i+=3) { 
			System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0')); 
		} 
		
		System.out.println(); 
	} 

}


