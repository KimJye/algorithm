package sort;

import java.util.Arrays;

public class heap {

	static void swap(int []a, int i, int j) {
		int temp=a[i];
		a[i] = a[j];
		a[j]= temp;
	}
	static void buildHeap(int[]a) {
		int end=a.length-1;
		for(int i=end/2;i>=0;--i)
			heapify(a,i,end);
	}
	
	static void heapify(int[]a,int k,int end) {
		int left=2*k+1, right=2*k+2;
		int smaller;
		if(right<=end)
			smaller=(a[left]<a[right])?left:right;
		else if(left<=end)
			smaller=left;
		else return;
		
		if(a[smaller]<a[k]) {
			swap(a,smaller,k);
			heapify(a,smaller,end);
		}
	}
	
	static void heapSort(int[] a) {
		buildHeap(a);
		for(int end=a.length-1;end>=1;--end) {
			swap(a,0,end);
			heapify(a,0,end-1);
		}
	}
	public static void main(String[] args) {
		int[]a= {3,8,2,10,4,6,7,1,9,5};
		heapSort(a);
		System.out.println(Arrays.toString(a));
	}
}
