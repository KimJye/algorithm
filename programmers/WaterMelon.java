/*
 * 2018/05/08
 * 김지혜
 * 입력 숫자만큼 수박수 출력
 */
package programmers;

import java.util.Arrays;

public class WaterMelon {

	public String watermelon(int n){

		String a="";
		
		
		for(int i=0;i<n;++i) {
			if(i%2==0) {
				a+="수";
				
			}else {
				a+="박";
			}
		}
		
		return a;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}

}
