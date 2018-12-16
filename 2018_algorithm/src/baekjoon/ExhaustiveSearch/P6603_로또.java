package ExhaustiveSearch;

import java.util.Scanner;

/*
 * 크기가 k인 집합 중 6개 뽑아서 순열을 사전식으로 출력
 * 새 배열 roto를 00000011로 선언
 * roto[i]가 0이면 arr[i]선택 출력 뒤 다음 순열 구하기 반복
 * 다음순열 이용해서 풀면 된다.
 */
public class P6603_로또 {

	public static boolean next(int [] arr) {
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

		swap(n,arr, v1, v2);
		return true;
	}

	public static void swap(int n, int[]arr, int v1, int v2) {
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
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num = sc.nextInt();
			if(num==0)return;
			int [] arr = new int[num];

			for(int i=0; i<num; ++i) {
				arr[i] = sc.nextInt();
			}

			int[] roto = new int[num];

			for(int i=0; i<num; ++i) {
				if(i<6)
					roto[i]=0;
				else
					roto[i]=1;
			}
			do {

				for(int i=0; i<num; ++i) {
					if(roto[i]==0) {
						System.out.print(arr[i]+" ");	
					}
				}
				System.out.println();

			}while(next(roto));
			System.out.println();
		}
	}


}
