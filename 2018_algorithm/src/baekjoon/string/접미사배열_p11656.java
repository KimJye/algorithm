package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 접미사배열_p11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int n = str.length();
		String [] arr = new String[n];
		
		for(int i=0;i<n;++i) {
			arr[i]=str.substring(i);
		}
		Arrays.sort(arr);
		
		for(int i=0; i<n; ++i) {
			System.out.println(arr[i]);
		}
	}
	
}
