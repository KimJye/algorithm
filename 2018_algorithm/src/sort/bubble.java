package sort;

import java.util.Arrays;

public class bubble {
	
	//배열 a에서 i위치와 j위치의 값을 서로 바꾼다.
	static void swap(int[]a, int i, int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		
	}
	
	//bubble sort
	static void bubbleSort(int[]a) {
		for(int i=a.length-1;i>0;--i) {//가장 큰 수를 마지막에 놓기 위함
		
			for(int j=0;j<i;++j) {//마지막 원소 하나 전까지
				if(a[j]>a[j+1]) {//2개씩 비교하면서 첫번째 원소가 더 크면
					swap(a,j,j+1);
					
				}
			}//for j end
			
		}// for i end
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {17,14,11,19,13,15,20,12,16,18};
		
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
