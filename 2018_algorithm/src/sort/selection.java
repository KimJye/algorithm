package sort;

import java.util.Arrays;

public class selection {
	static void swap(int[]a,int i,int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	public static void main(String[]args) {
		int[]a= {2,4};
		
		System.out.println(Arrays.toString(a));
		swap(a,0,1);
		System.out.println(Arrays.toString(a));
		}
}
