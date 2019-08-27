package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set set = new HashSet();

		int N = 10;

		while(N-- >0){
			int number = Integer.parseInt(br.readLine());
			set.add(number%42);
		}
		System.out.println(set.size());
		br.close();
	}
}
