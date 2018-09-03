package baekjoon.collections;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

//Map으로 해보기.

public class 듣보잡 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		
		int n = Integer.parseInt(line[0]);// 듣도 못한 사람 수 
		int m = Integer.parseInt(line[1]);// 보도 못한 사람 수
		
		HashSet<String> a = new HashSet<String>();
		HashSet<String> b = new HashSet<String>();
		
		for(int i=0; i<n; ++i) {
			a.add(bf.readLine());
		}
		for(int i=0; i<m; ++i) {
			String tmp = bf.readLine();
			if(a.contains(tmp)) b.add(tmp);
		}
		String [] value = b.toArray(new String[b.size()]);
		Arrays.sort(value);
		System.out.println(value.length);
		for(int i=0; i<value.length; ++i) {
			System.out.println(value[i]);
		}
		
	}
}
