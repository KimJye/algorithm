/*
 * String[]배열 정렬 구현
 */

package sort;

import java.util.Arrays;

public class String {

	//배열 a에서 i 위치와 j 위치의 값을 서로 바꿈
	static void swap(String[]a, int i, int j) {
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	//배열 a의 start 위치부터 끝까지에서 가장 작은 값의 위치(index)를 리턴한다.
	static int findMin(String[]a,int start) {
		int minIndex=start;
		for(int i=start+1;i<a.length;++i) {
			if(a[i].compareTo(minValue)<0) {
				minValue=a[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
	
	//selection sort
	static void selectionSort(String[]a) {
		for(int i=0;i<a.length-1;++i) {
			int minIndex=findMin(a,i);//배열 a의 i위치부터 끝까지에서 가장 작은 값을 찾아서
			swap(a,i,minIndex);//그 값을 i 위치로 이동한다.
		}
	}
	
	public static void main(String[]args) {
		String[]a= {"zero","one","two","three","four","five","six","seven"};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
