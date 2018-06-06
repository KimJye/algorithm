/*
 * 자연수 N이 주어지면 N의 각 자릿수 합을 구하라.
 * 예를 들어 N=123이면 1+2+3 = 6을 return 하라.
 * N의 범위 : 100000000이하의 자연수
 */

/*	알게된 점
 * Integer.toString()과 String.ValueOf()의 차이
 * 공통점: String값을 리턴해준다.
 * 차이점: nullPointException 발생 유무이다.
 * 		예를 들어 
 * 		int i=0;
 * 		String a =Integer.toString(i);//null point Exception
 * 		String b = String.valueOf(i);// no exception
 * 		여기서 toString은 CharSequence 인터페이스를 가지고 있고 Object 클래스를 상속받으며 string 자체를 리턴한다.
 * 		반면에 valueOf는 Integer.toString이 한번 리턴된것이나 다름없다. 따라서 Integer.toString(int,int)로 볼수가 있다.
 */
package programmers;

import java.util.*;

public class NumPlus {
	
	public int solution(int n) {
		int answer=0;
		
		String str=Integer.toString(n);//숫자를 문자열로 변환
		
		/*valueOf메소드
		for(int i=0;i<str.length();++i) {
			array[i]=String.valueOf(str.charAt(i));
		}
		*/
		
		/*toString에소드
		for(int i=0;i<str.length();++i) {
			array[i]=Character.toString(str.charAt(i));//배열에 저장
		}
		*/
		//합치기
		for(int i=0;i<str.length();++i) {
			answer+=Integer.parseInt(String.valueOf(str.charAt(i)));//각 원소 더하기
		}

		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		
		NumPlus np = new NumPlus();
		
		System.out.print("자연수 N: ");
		number=input.nextInt();
		
		if(number<0||number>100000000) {
			System.out.println("N조건 틀립니다.");
		}else {
			System.out.printf("자리수의 합: %d",np.solution(number));	
		}
	}

}
