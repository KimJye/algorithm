package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//못품 : minus = new StringTokenizer(str.substring(i+1).replaceAll("[+]"," ")); 이문장에서 +가 공백으로 replace가 안됨.
/*
 *
 * 괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 
그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리 이상 연속되는 숫자는 없다. 
수는 0으로 시작할 수 있다.
Tip : -나오면 다음 - 나올때까지 계속 더한 뒤 계산 값에서 빼주면 된다.
 */
/*
 * 혜지,태훈오빠 코드 참신..
 */
public class 잃어버린괄호_p1541 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		
		int a=0,b=0;//a는 +부분 합으로 -가 처음 등장하기 전 값들만 저장 , b는 -부분 합으로 최초 -가 나온 이후 값 저장 
		String tmp = "";
		
		StringTokenizer plus, minus;
		
		
		for(int i=0; i<str.length(); ++i) {
			//-쪽 작업.
			//- 뒤에는 전부 공백으로
			if(str.charAt(i)=='-') {
				minus = new StringTokenizer(str.substring(i+1).replaceAll("\\+|\\-"," "));
				System.out.println(str.toString());
				while(minus.hasMoreTokens()) {
					b+=Integer.parseInt(minus.nextToken()); 
					//System.out.println(b);
					break;
				}
			}else {
				tmp +=str.charAt(i); //숫자와 +들어가 있음.
				//System.out.println(tmp);
			}
		}
		//+쪽 작업.
		plus = new StringTokenizer(tmp,"+");//+빼고 숫자만 담는다.
		
		while(plus.hasMoreTokens()) {
			a+=Integer.parseInt(plus.nextToken());
		}
		System.out.println(a-b);
		
	}

}
