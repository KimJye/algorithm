package BinarySearch;

import java.util.Scanner;

/*
 * 문제 : 첫째 줄에 차례대로 x, y, c에 해당하는 양의 실수 세 개가 입력된다.
 * 두 빌딩사이에 너비가 되는 수치를 소수점 4째 자리에서 반올림 하여 소수점 3째 자리까지 출력한다.
 * 풀이 : c = h1*h2/(h1+h2)
 * 	실수이기 때문에 for(10000번), left=mid로
 */
public class P2022_사다리 {

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
