package sort;

import java.util.Arrays;

public class insertion {

	static void insertionSort(int[]a) {
		
		for(int i=1;i<a.length;++i) {//두번째 원소부터 시작한다.
			int value=a[i];
			int j;
			
			for(j=i-1;j>=0;--j) {//자신보다 앞쪽의 원소는 다 훑어본다.
				if(a[j]>value) {//뒤로 이동
					a[j+1]=a[j];
				}
				else 
					break;
			}
			
			a[j+1]=value;//값 삽입
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {17,14,11,19,13,15};
		
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
