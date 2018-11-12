package BinarySearch;

import java.util.Scanner;

/*
 * ���� : ù° �ٿ� ���ʴ�� x, y, c�� �ش��ϴ� ���� �Ǽ� �� ���� �Էµȴ�.
 * �� �������̿� �ʺ� �Ǵ� ��ġ�� �Ҽ��� 4° �ڸ����� �ݿø� �Ͽ� �Ҽ��� 3° �ڸ����� ����Ѵ�.
 * Ǯ�� : c = h1*h2/(h1+h2)
 * 	�Ǽ��̱� ������ for(10000��), left=mid��
 */
public class P2022_��ٸ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		double c=input.nextDouble();
		
		double left=0.0;
		double right=Math.min(x,y);
		
		for(int i=0; i<10000; ++i) {
			double mid = (left+right)/2.0;
			double d = mid;
			
			double h1 = Math.sqrt(x*x-d*d);
			double h2 = Math.sqrt(y*y-d*d);
			double h = (h1*h2)/(h1+h2);
			
			if(h>c) {
				left=mid;
			}else {
				right=mid;
			}
		}
		System.out.printf("%.3f",left);
	}

}
