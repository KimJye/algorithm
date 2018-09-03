package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자의합_p11720 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine()); 
		
		String line = bf.readLine();
		
		int n =line.length();
		
		int sum = 0;
		for(int i=0; i<n; ++i){
			sum+=Integer.valueOf(line.charAt(i)-'0');
		}
		System.out.println(sum);
	}

}
