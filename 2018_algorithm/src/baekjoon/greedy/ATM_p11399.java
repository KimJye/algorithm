package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * ù° �ٿ� ����� �� N(1 �� N �� 1,000)�� �־�����. 
 * ��° �ٿ��� �� ����� ���� �����ϴµ� �ɸ��� �ð� Pi�� �־�����. (1 �� Pi �� 1,000)
 * ù° �ٿ� �� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ����Ѵ�.
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
