/*
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 
 * 숫자 M개가 주어졌을 때, 이 숫자가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 * 어떤 카드가 있는지 확인하기 때문에 HashSet쓴다.
 */


package baekjoon.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 숫자카드 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine()); //상근이가 가지고있는 수들
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		HashSet<Integer> d = new HashSet<Integer>();
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			d.add(num);
		}
		
		int b = Integer.parseInt(bf.readLine()); // 상근이가 가지고 있는 숫자인지 아닌지 확인하는 수들
		st = new StringTokenizer(bf.readLine()); // 공백 구분
		
		StringBuilder builder = new StringBuilder(); //여러개 출력
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(d.contains(num)) {
				builder.append("1");
			}else {
				builder.append("0");
			}
		}
		System.out.println(builder);
	}

}
