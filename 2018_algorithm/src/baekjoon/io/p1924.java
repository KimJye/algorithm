/*
 * 오늘은 2007년 1월 1일 월요일이다. 
 * 그렇다면 2007년 x월 y일은 무슨 요일일까?
 *  이를 알아내는 프로그램을 작성하시오.
 *  첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
 *  참고로 2007년에는 1, 3, 5, 7, 8, 10,
 *   12월은 31일까지, 4, 6, 9,
 *    11월은 30일까지, 
 *   2월은 28일까지 있다.
 */
package baekjoon.io;

import java.util.Scanner;

public class p1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String s[]= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int m[]= {0,31,28,31,30,31,30,31,31,30,31,30};
		
		int month=input.nextInt();
		int day = input.nextInt();
		input.close();
		
		int sum=0;
		
		if(month>0 && month<13) {
			if(day>0 && day<32) {
				for(int i=1; i<12; ++i) {
					if(i==month) break;
					sum+=m[i];
				}
				sum+=day;
				
				switch(sum%7) {
				case 0:
					System.out.println(s[0]);
					break;
				case 1:
					System.out.println(s[1]);
					break;
				case 2:
					System.out.println(s[2]);
					break;
				case 3:
					System.out.println(s[3]);
					break;
				case 4:
					System.out.println(s[4]);
					break;
				case 5:
					System.out.println(s[5]);
					break;
				case 6:
					System.out.println(s[6]);
					break;
				}
			}
		}



	}

}
