package baekjoon.io;

import java.io.*;
import java.util.StringTokenizer;

public class 더하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//StringTokenizer로 구현
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line,",");
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
		
		/*
		//split 메소드로 구현
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(",");
		
		int sum=0;
		
		for(int i=0; i<line.length; ++i) {
			sum+=Integer.parseInt(line[i]);
		}
		System.out.println(sum);
		 */
	}

}
