package sort;

import java.util.Arrays;

public class bubble {
	
	//�迭 a���� i��ġ�� j��ġ�� ���� ���� �ٲ۴�.
	static void swap(int[]a, int i, int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		
	}
	
	//bubble sort
	static void bubbleSort(int[]a) {
		for(int i=a.length-1;i>0;--i) {//���� ū ���� �������� ���� ����
		
			for(int j=0;j<i;++j) {//������ ���� �ϳ� ������
				if(a[j]>a[j+1]) {//2���� ���ϸ鼭 ù��° ���Ұ� �� ũ��
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
