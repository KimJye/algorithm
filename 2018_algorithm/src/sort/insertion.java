package sort;

import java.util.Arrays;

public class insertion {

	static void insertionSort(int[]a) {
		
		for(int i=1;i<a.length;++i) {//�ι�° ���Һ��� �����Ѵ�.
			int value=a[i];
			int j;
			
			for(j=i-1;j>=0;--j) {//�ڽź��� ������ ���Ҵ� �� �Ⱦ��.
				if(a[j]>value) {//�ڷ� �̵�
					a[j+1]=a[j];
				}
				else 
					break;
			}
			
			a[j+1]=value;//�� ����
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {17,14,11,19,13,15};
		
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
