/*
 * 수 N개가 주어졌을 때, N개의 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 N(1 ≤ N ≤ 100)개의 수가 공백으로 구분되어서 주어진다. 
 * 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다. 
 * 또, 0으로 시작하는 수는 주어지지 않는다.
 */

package baekjoon.io;

import java.io.*;
import java.util.*;

public class 더하기3 {
	
	public static void main(String[] args) throws IOException {
		//StringTokenizer로 구현
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
		
		/*BufferedReader로 구현
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		
		//if(Integer.parseInt(bf.readLine())<1) return; //종료 조건 구현하면 오류남...
		
		int sum=0;
		
		for(int i=0; i<line.length; ++i) {
			sum+=Integer.parseInt(line[i]);
		}
		System.out.println(sum);
		*/
		
		
		/* Scanner로 풀기
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(input.hasNextInt()) {
			sum+=input.nextInt();
		}
		System.out.println(sum);
		*/
	}
	
}
