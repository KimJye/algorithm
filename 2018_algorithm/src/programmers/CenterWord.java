/*
 * 김지혜
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
package programmers;

import java.util.Scanner;
import java.util.*;

public class CenterWord {
	 public String solution(String s) {
	     
		  if((s.length()<1)&&(s.length()>100)) {
	    	  System.out.println("s는 길이가 1이상 100이하여야 합니다.");
	    	  return"";
	      }
	 
	      String answer = "";
	      if(s.length()%2==0) {
	    	  answer=s.substring(s.length()/2-1,s.length()/2+1);
	      }else {
	    	  answer=s.substring(s.length()/2,s.length()/2+1);
	      }
	      return answer;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		CenterWord cw = new CenterWord();
		
		String str="";
		
		System.out.print("단어 입력: ");
		str=input.nextLine();
		
		System.out.print("단어 str의 가운데 글자를 반환:");
		System.out.printf("%s",cw.solution(str));
	}

}
