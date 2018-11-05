package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 절단기의 높이 결정(H)
 * 나무 높이가 M미터보다 크거나 같은 경우 H를 증가.
 * left=0
 * right = 상근이의 나무의 높이의 최댓값
 * check() : 나무의 길이가 a이고 자르려고하는 나무의 높이가 mid일때 적어도 m미터보다 큰지 작은지 비교하는 함수
 * 가능하면 정답을 크게만들고 불가능하면 정답을 작게.
 * 내가 필요한 나무 길이보다 더 얻을 경우 절단기 높이를 줄이고 나무의 길이가 짧을 경우 절단기 높이를 높이는 방식.
 * 
 * 1. 이분 탐색 위한 나무 정렬
 * 2. H 기준으로 잘라진 나무 합이 m보다 작을 경우 h를 늘려서 탐색한다.
 * 3. 반복
 */
public class P2805_나무자르기 {

	public static boolean check(long[]a, long h, int m) {
		long sum=0;
		
		for(long s : a) {
			if(s-h>0) {
				sum+=s-h;//나무높이-절단기 높이
			}
		}
		
		if(sum>=m) {// 얻은 나무 길이가 m보다 큰 경우 절단기 높이 줄이기
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(line[0]);// 나무 수
		int m = Integer.parseInt(line[1]);// 상근이가 집으로 가져가려고 하는 나무 길이
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long arr [] = new long[n];
		long s = 0;
		long e = 0;
		long result=0;
		
		for(int i=0; i<n; ++i) {
			arr[i] = Integer.valueOf(st.nextToken());
			e = Math.max(e,arr[i]);//가장 큰 수를 e에 넣는다.
		}
		
		Arrays.sort(arr);
		
		while(s<=e) {
			long mid =(s+e)/2;
			if(check(arr,mid,m)) {
				result=Math.max(result,mid);
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		br.close();
		System.out.println(result);
	}

}
