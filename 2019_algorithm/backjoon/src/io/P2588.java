package io;

import java.util.*;

public class P2588{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		Character []arr = new Character[3];

		for(int i=0; i<3; ++i){
			arr[i] = String.valueOf(B).charAt(i);
		}

		for(int i=arr.length-1; i>=0; --i){
			System.out.println(Integer.parseInt(arr[i].toString())*A);
		}
		System.out.println(A*B);

	}
}
