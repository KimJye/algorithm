/*
 * N개의 정수가 주어진다. 이 때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오
 */
package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 최소최대p10818 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
		}
		Collections.sort(list);
		
		System.out.printf("%d %d",list.get(0), list.get(list.size()-1));
	}

}
