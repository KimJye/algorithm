package ExhaustiveSearch;

import java.util.Scanner;

/*
 * 1부터 N까지의 수로 이루어진 순열이 있다. 
 * 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 작성하시오.
 * 풀이 :
 * 1. 오른쪽부터 훑어서 오른쪽보다 왼쪽이 작은 수를 찾는다.
 * 2. 다시 오른쪽에서 확인해서 아까 찾은 수 보다 큰 첫번째 수를 찾는다.
 * 3. 그 두 수를 swap한다.
 * 4. 아까 찾은 수 자리 뒤를 역순으로 뒤집는다.
 */
public class P10972_다음순열 {

	public static boolean next(int[]arr) {
		int n = arr.length;
		int i = n-1;
		while (i > 0 && arr[i-1] >= arr[i]) {
			i -= 1;
		}
		//마지막 순열
		if(i<=0) {
			return false;
		}
		int v1=0;

		for(int j=n-1; j>0; --j) { //오른쪽부터 훑기
			if(arr[j]>arr[j-1]) {// 찾음
				v1=j-1; //인덱스 저장
				break;
			}
		}

		int v2 = 0;

		for(int j=n-1; j>0; --j) {
			if(arr[j]>arr[v1]) {
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
