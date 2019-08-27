package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=9;
		int [] arr = new int[9];
		Map map = new HashMap();

		for(int i=0; i<arr.length; ++i){
			int input = Integer.parseInt(br.readLine());
			arr[i]= input;
			map.put(input,i+1);
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(map.get(arr[arr.length-1]));
		br.close();
	}
}
