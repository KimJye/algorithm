package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//아니 왜 틀렸습니다 나오냐규ㅠㅠ
/*
 * 우선순위 큐를 씀. 자동적으로 정렬을 해줌. heap처럼. 보통 heap처럼 쓰기위해서 큐를 씀.
 * Collections.reverse: 메소드로 들어가기때문에 정해진 값들을 정렬한다.  reverseOrder: 값이 들어갈때마다 정렬이 된다. 차이 알기.
 */
public class 수묶기_p1744 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		List<Integer> plus = new ArrayList<Integer>();
		List<Integer> minus = new ArrayList<Integer>();
		
		int a=0;
		int zero = 0;
		int one = 0;
		
		for(int i=0; i<num; ++i) {
			a = Integer.parseInt(br.readLine());
			
			if(a>0) plus.add(a);
			else if(a<0) minus.add(a);
			else if(a==1) one++;
			else if(a==0) zero++;
		}
		
		Collections.sort(plus);
		Collections.reverse(plus);
		//Collections.sort(plus,Collections.reverseOrder()); // plus 내림차순 정렬
		Collections.sort(minus); // minus 오름차순 정렬
		
		if(plus.size()%2 ==1) { //짝이 안맞을때 1을 넣어줌.
			plus.add(1);
		}
		
		if(minus.size()%2 ==1) {
			minus.add(zero>0 ? 0 : 1); // 짝이 안맞을때 0있으면 0을 넣어줌. 아니면 1넣음
		}

		int result=one; //1의 갯수가 일단 더해졌기 때문이다.
		
		for(int i=0; i<plus.size();i+=2) {
			result+= plus.get(i)* plus.get(i+1);
		}
		for(int i=0; i<minus.size();i+=2) {
			result+= minus.get(i)* minus.get(i+1);
		}
		
		System.out.println(result);
	}

}
