package programmers;

public class palindrome {
	public int solution(int n, int m) {
		int answer=0;

		String num="";
		String s="";
		
		for(int i=n;i<=m;++i) {
			num=Integer.toString(i);
			s=Integer.toString(value(i));
			if(num.equals(s)) {
				answer++;
			}
		}
		
		/*
		for(int j=0;j<num.length();++j) {
	
			//char e = num.charAt(num.substring(beginIndex));
			// answer=s.substring(s.length()/2-1,s.length()/2+1);
			
			//if(s==e)
			//	answer++;
		}
		*/
		return answer;
	}
	public int value(int num) {
		int result=0;
		while(num!=0) {
			result=result*10+num%10;
			num/=10;
		}
		return result;
	}
	public static void main(String[] args) {
		palindrome pa = new palindrome();
		System.out.println(pa.solution(1, 100));
	}
}
//숫자 n,m 을 입력 받는다.
// n~m 사이에 숫자중에서 가운데 숫자 빼고 짝수가 같은 것.

