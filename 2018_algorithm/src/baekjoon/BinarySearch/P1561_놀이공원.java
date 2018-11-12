package BinarySearch;

import java.util.Scanner;
//틀렸습니다 나옴...이유가 멀까..
/*
 * 문제: n명이 있고 m종류의 1인승 놀이기구가 있다. 
 * 줄의 마지막 아이가 타는 놀이기구의 번호를 구하는 문제
 * 즉, n번째 학생이 몇번째 놀이기구(m)를 타는가.
 * 조건 : 
 * 첫째 줄에 N(1<= N<= 2,000,000,000)과 M(1<= M<= 10,000)이 빈칸을 사이에 두고 주어진다. 
 * 둘째 줄에는 각 놀이기구의 운행 시간을 나타내는 M개의 자연수가 순서대로 주어진다.
   운행 시간은 1 이상 30 이하의 자연수이며, 단위는 분이다
 * 풀이 :
 * 	1.범위 x분을 구한다.
 *  2.x분까지 탄 학생수와 n을 비교한다.
 *  3.비교로 이분탐색 실행
 *  4.x를 찾는다.
 *  5.x를 찾은 뒤에는 x시간 -1분전의 탑승 학생수를 전부 체크한다.
 *  6.그리고 x로 나눠 떨어지는 시간이 존재하면 탑승 학생수에 ++ 해준다.
 *  7.n과 같으면 해당 인덱스가 m이다.
 */
public class P1561_놀이공원 {
	static long x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();// 학생수
		int m = input.nextInt();// 놀이기구 종류

		int arr[] = new int[m];

		if(n<=m) {
			System.out.println(n);
			return;
		}

		for(int i=0; i<m; ++i) {
			arr[i]=input.nextInt();
		}

		long left=0;
		long right=20;//000000000*30; //최대 30분
		long x=0;
		int sum=0;
		
		while(left<=right) { //이분탐색으로 x찾기
			sum=m; //x분(mid)까지 탄 학생 수 0분에 다 타니까 m
			
			long mid=(left+right)/2;
		
			for(int i=0;i<m;++i) {
				sum+=(mid/arr[i]);
			}
			
			if(sum>n) { //x분까지 탄 학생수가 n보다 클때
				right=mid-1;
			}else if(sum<n) {
				left=mid+1;
			}else if(sum==n) {
				x=mid;
				break;
			}

		}
		//System.out.println(x);
		long before = (long)m;
		
		for(int i=0; i<m; ++i) {//x를 찾은 뒤에는 x시간 -1분전의 탑승 학생수를 전부 체크한다.
			before+=((x-1)/arr[i]);
		}
		//System.out.println("before"+before);
		for(int i=0; i<m; ++i) {
			if(x%arr[i]==0) {
				before++;
				//System.out.println("before"+before);
			}
			if(before==n) {
				System.out.println(arr[i]);
				return;
			}
		}
		input.close();
		
	}

}
