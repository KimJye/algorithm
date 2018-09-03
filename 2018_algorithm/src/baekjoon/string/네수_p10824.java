package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ³×¼ö_p10824 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		String a = line[0] + line[1];
		String b = line[2] + line[3];
		long ans = Long.valueOf(a) + Long.valueOf(b);
		System.out.println(ans);
		}
}
