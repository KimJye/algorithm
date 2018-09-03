package programmers;

import java.util.*;
public class ChangeStringtoInt {
	public int solution(String s) {
		String st=s;
		int answer=0;

		answer=Integer.parseInt(st);

		return answer;
	}
	public static void main(String[] args){
		ChangeStringtoInt ch = new ChangeStringtoInt();
		Scanner input = new Scanner(System.in);
		String str="";
		String regex="^[-?1-9]*$";
		System.out.print("문자 입력: ");
		str=input.nextLine();
		
		if(str.length()<1||str.length()>10000) {
			System.out.println("문자의 길이는 1 이상 10,000이하입니다");
		}
		else if(str.charAt(0)=='0') {
			System.out.println("문자는 0으로 시작하지 않습니다. 0제외후 다시 입력하세요.");
		}else if(!str.matches(regex)){
			System.out.println("조건불일치! 숫자만 입력하세요!");
		}else {
			System.out.printf("숫자로 변환: %d",ch.solution(str));
		}

	}
}
