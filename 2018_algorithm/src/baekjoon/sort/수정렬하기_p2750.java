/*
 * 2018.07.10
 * 정렬 part
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오
 */
package baekjoon.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 수정렬하기_p2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 배열 이용하는 방법 with Arrays.sort()
		Scanner input = new Scanner(System.in);
		
		int num;// 수의 개수
		num = input.nextInt();
		
		int [] list = new int[num];
		
		for(int i=0; i<num; ++i) {
			list[i]=input.nextInt();
		}
		
		Arrays.sort(list);
		
		for(int x : list) {
			System.out.println(x);
		}
		
		/*
		//ArrayList 사용하기 with Collections.sort()
		Scanner input = new Scanner(System.in);
		
		int num;// 수의 개수
		num = input.nextInt();
		
		List<Integer> list  = new ArrayList();
		
		for(int i=0; i<num; ++i) {
			int temp = input.nextInt();
			list.add(temp);
		}
		
		Collections.sort(list);
		
		for(int x : list) {
			System.out.println(x);
		}
		또는
		for(int i=0; i<num; ++i){
			System.out.println(list.get(i));
			}
		*/
	}

}
