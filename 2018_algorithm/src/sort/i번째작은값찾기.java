package sort;

import java.util.Arrays;
import java.util.Random;

public class i��°������ã�� {
	
	//a �迭�� start~end���� nth��° ���� ���� �����Ѵ�.
	//static int select(int[]a, int start, int end, int nth) {
		//if(start>=end) return a[start];//ã�� �迭�� ũ�Ⱑ 1�̸� ����
		//int middle=partition(a,start,end);//�迭 ������
	//	int middle_nth=middle-start+1;
	//}
	public static void main(String[] args) {
		Random random = new Random();
		int[]a=new int[10];
		
		for(int i=0;i<a.length;++i) {
			a[i]=random.nextInt(20);
		}
		
		System.out.println(Arrays.toString(a));
		//System.out.printf("1��° ���� ��=%d\n",select(a,0,a.length-1,1));
		//System.out.printf("2��° ���� ��=%d\n",select(a,0,a.length-1,2));
		//System.out.printf("3��° ���� ��=%d\n",select(a,0,a.length-1,3));
		//System.out.printf("4��° ���� ��=%d\n",select(a,0,a.length-1,4));
	}
}
