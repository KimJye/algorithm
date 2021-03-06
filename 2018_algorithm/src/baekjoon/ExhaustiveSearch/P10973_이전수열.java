package ExhaustiveSearch;

import java.util.Scanner;

/*
 * 1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 바로 이전에 오는 순열을 구하는 프로그램을 작성하시오.
 */
public class P10973_이전수열 {

	public static boolean next(int[]arr) {
		int n = arr.length;
		int i = n-1;
		while (i > 0 && arr[i-1] <= arr[i]) {
			i -= 1;
		}
		//마지막 순열
		if(i<=0) {
			return false;
		}
		int v1=0;

		for(int j=n-1; j>0; --j) { //오른쪽부터 훑기
			if(arr[j]<arr[j-1]) {// 찾음
				v1=j-1; //인덱스 저장
				break;
			}
		}

		int v2 = 0;

		for(int j=n-1; j>0; --j) {
			if(arr[j]<arr[v1]) {
				v2=j;
				break;
			}
		}

		//swap
		int temp=0;

		temp = arr[v1]; 
		arr[v1] = arr[v2];
		arr[v2] = temp;

		int k = v1+1;
		int l = n-1;

		while(k<l) {
			temp = arr[k];
			arr[k] = arr[l];
			arr[l] = temp;
			k+=1;
			l-=1;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = new int[n];

		for(int i=0; i<n; ++i) {
			arr[i] = input.nextInt();
		}

		if(next(arr)) {
			for(int i=0; i<n; ++i) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}else {
			System.out.println("-1");
		}

	}
}
