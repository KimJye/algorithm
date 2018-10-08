package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 첫째 줄에 사람의 수 N(1 ≤ N ≤ 1,000)이 주어진다. 
 * 둘째 줄에는 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어진다. (1 ≤ Pi ≤ 1,000)
 * 첫째 줄에 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 출력한다.
 */
public class ATM_p11399 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		int arr [] =new int [num];

		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<num; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int sum=0;
		
		for(int i=0; i<num; ++i) {
			sum+=arr[i]*(num-i);
		}
		
		System.out.println(sum);
	}

}
