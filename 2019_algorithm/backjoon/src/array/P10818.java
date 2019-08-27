package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10818 {
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		int index = 0;

		while(st.hasMoreTokens()){
			arr[index++]= Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		System.out.println(arr[0]+" "+arr[arr.length-1]);

		br.close();

	}
}
