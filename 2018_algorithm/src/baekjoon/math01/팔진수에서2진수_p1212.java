/*
 * 8진수에서 2진수로 변환
 */
package baekjoon.math01;

import java.util.Scanner;

public class 팔진수에서2진수_p1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String[] eight = {"000","001","010","011","100","101","110","111"}; 
		String s = sc.nextLine(); 
		boolean start = true; 
		if (s.length() == 1 && s.charAt(0) == '0') { 
			System.out.print(0); 
		} 
		for (int i=0; i<s.length(); i++) { 
			int n = s.charAt(i) - '0'; 
			if (start == true && n < 4) { 
				if (n == 0) { 
					continue; 
				} else if (n == 1) { 
					System.out.print("1"); 
				} else if (n == 2) { 
					System.out.print("10"); 
				} else if (n == 3) { 
					System.out.print("11"); 
				} 
				start = false; 
			} else { 
				System.out.print(eight[n]); 
				start = false; 
			} 
		} 
		System.out.println(); 
	}

}
