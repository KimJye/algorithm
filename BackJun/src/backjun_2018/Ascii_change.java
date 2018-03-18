/*
 * 2018.03.18
 * 김지혜
	문제: 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
		 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */


package backjun_2018;

import java.util.Scanner;

public class Ascii_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String regexa="[a-z]";//소문자
		String regexb="[A-Z]";//대문자
		String regexc="[0-9]";//숫자
		
		String value;
		
		System.out.print("입력: ");
		value=input.next();
		
		char result=value.charAt(0);
		
		if(value.matches(regexa)){
			System.out.println(Integer.valueOf(result));
		}else if(value.matches(regexb)){
			System.out.println(Integer.valueOf(result));
		}else if(value.matches(regexc)){
			System.out.println(Integer.valueOf(result));
		}
		
		
	}

}
