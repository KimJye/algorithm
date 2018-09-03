/*
 * 2018.05.08
 * 김지혜
 * 숫자를 입력받아 연속된 수로 표현하는 방법을 반환
 */
package programmers;

public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		
		for(int i=1;i<num;++i) {
			int sum=0;
			for(int j=i;j<num;++j) {
				sum+=j;
				if(sum==num) {
					answer++;
					break;
				}
			}
		}
		
		/*
		int n=1;
		while(n!=num) {
			int sum=0;
			for(int i=n;i<=num;++i) {
				sum+=i;
				if(sum==num)
					answer++;
			}
			n++;
		}*/
		return answer+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}

}
