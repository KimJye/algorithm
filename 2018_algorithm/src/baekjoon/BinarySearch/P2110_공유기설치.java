package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 가장 인접한 두 공유기 사이의 거리가 커질 수록 공유기의 개수는 줄어든다.
 * c개의 공유기를 n개의 집에 적당히 설치해서, 가장 인접한 두 공유기 사이의 거리를 최대로 만듦.
 * 가장 인접한 두 공유기 사이의 거리를 x로 결정
 * 이 때 공유기를 설치햇을 때 c개 이상 설치할 수 있으면 가능
 * 가능한 경우면 x를 크게 불가능하면 작게
 * 
 * 		1 	2 	4 	8 	9
거리 1	0 	0	0	0	0
거리 2	0	x	0	0	x
거리 3 	0	x	0	0	x
거리 4	0	x	x	0	x
거리 5 	0 	x	x	0	x
거리 6 	0	x	x	0	x
거리 7 	0 	x	x	0	x
거리 8	0	x	x	x	0
 */
public class P2110_공유기설치 {
	public static boolean check(int []a,int mid, int c) {
		int sum=1;
		int home = a[0];
		for(int s : a) {
			if(s-home>=mid) {
				sum++;
				home=s;
			}
		}
		if(sum>=c) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//집의 개수
		int c = sc.nextInt();//공유기의 개수
		int[]a = new int[n];
		
		for(int i=0;i<n;++i) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int result=1;
		int s=1; //가능한 최소 거리
		int e=a[n-1]-a[0];//가능한 최대 거리
		
		while(s<=e) {
			int mid=(s+e)/2;
			if(check(a,mid,c)) { //공유기의 수를 줄이자. 간격 넓히기
				result = Math.max(result,mid);
				s=mid+1;
			}else {//공유기 수를 늘리자. 간격 좁히기
				e=mid-1;
			}
		}
		sc.close();
		System.out.println(result);
		
	}

}
