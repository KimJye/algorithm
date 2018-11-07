package exam;

import java.util.Arrays;

public class Ex_merge {
	
	static void merge(int[] a, int start, int middle, int end) {
		int length=(end-start)+1;
		int [] temp = new int [length];
		int i=0;
		int index1=start;
		int index2=middle+1;
		
		while(index1<=middle&&index2<=end) {
			if(a[index1]<a[index2]) 
				temp[i++]=a[index1++];
			else
				temp[i++]=a[index2++];
		}
		while(index1<=middle) {
			temp[i++]=a[index1++];
		}
		while(index2<=end) {
			temp[i++]=a[index2++];
		}
		for(i=0;i<temp.length;++i) {
			a[start+i]=temp[i];
		}
	}
	
	public static void main(String[] args) {
		int[]a1= {10,11,12,13,14,15,16,17,18,19};
		merge(a1,5,(5+9)/2,9);//[15,16,17,18,19]반환
		System.out.println(Arrays.toString(a1));//[10,11,12,13,14,15,16,17,18,19]출력
		
		int[]a2= {10,11,12,13,14,17,18,19,15,16};
		merge(a2,5,(5+9)/2,9);//[15,16,17,18,19]반환
		System.out.println(Arrays.toString(a2));//[10,11,12,13,14,15,16,17,18,19]출력
		
		int[]a3= {10,12,14,11,13,15,16,17,18,19};
		merge(a3,0,(0+4)/2,4);//[10,11,12,13,14]반환
		System.out.println(Arrays.toString(a3));//[10,11,12,13,14,15,16,17,18,19]출력
		
	}
}
