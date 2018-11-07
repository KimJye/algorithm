package exam;

import java.util.Arrays;

public class Ex_partition {

	static void swap(int[]a,int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static int partition(int[]a, int start, int end) {
		int value=a[end];
		int i=start-1;
		for(int j=start;j<=end-1;++j) {
			if(a[j]<value)
				swap(a,++i,j);
		}
		swap(a,i+1,end);
		return i+1;
	}
	public static void main(String[] args) {
		int []a = {31,8,48,73,11,3,20,29,65,15};
		
		System.out.println(Arrays.toString(a));
		int middle= partition(a,0,a.length-1);
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, middle))+"  ");
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, middle, a.length))+"  ");
	}
}
