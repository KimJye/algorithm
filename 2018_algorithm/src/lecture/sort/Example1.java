package sort;

import java.util.Arrays;

public class Example1 {

	// �迭 a���� i ��ġ�� j ��ġ�� ���� ���� �ٲ۴� 
	static void swap(int[] a, int i, int j) {  
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}

	// �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.
	static int findMin(int[] a, int start) {
		int index=0;
		int min=a[start];
		
		for(int i=start;i<a.length;++i) {
			if(min>=a[i]) {
				min=a[i];
				index=i;
			}
		}
		return index;
	} 
	// selection sort
	static void selectionSort(int[] a) {  
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i); // �迭 a�� i ��ġ���� ���������� ���� ���� ���� ã�Ƽ�            
			swap(a, i, minIndex);         // �� ���� i ��ġ�� �̵��Ѵ�       
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13, 15, 18, 12, 16, 20 }; 
		selectionSort(a);    
		System.out.println(Arrays.toString(a));    
	} 


}
