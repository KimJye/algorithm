package sort;

import java.util.Arrays;
import java.util.*;
import java.util.Comparator;
import java.lang.String;

public class Example2a {

	static void swap(Comparable[]a,int i,int j) {
		Comparable temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	//bubble sort
	static void bubbleSort(Comparable[] a) {
		for(int i=a.length-1;i>=1;--i) {
			boolean 완료 = true;
			for(int j=0;j<i;++j) {
				if(a[j].compareTo(a[j+1])>0)
					swap(a,j,j+1);
					완료= false;
			}
			if(완료)break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]a= {"zero","one","two","three","four","five","six","seven"};
		
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

}
