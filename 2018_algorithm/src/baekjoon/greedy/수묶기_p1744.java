package greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//�ƴ� �� Ʋ�Ƚ��ϴ� �����ıԤФ�
/*
 * �켱���� ť�� ��. �ڵ������� ������ ����. heapó��. ���� heapó�� �������ؼ� ť�� ��.
 * Collections.reverse: �޼ҵ�� ���⶧���� ������ ������ �����Ѵ�.  reverseOrder: ���� �������� ������ �ȴ�. ���� �˱�.
 */
public class ������_p1744 {

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
		//Collections.sort(plus,Collections.reverseOrder()); // plus �������� ����
		Collections.sort(minus); // minus �������� ����
		
		if(plus.size()%2 ==1) { //¦�� �ȸ����� 1�� �־���.
			plus.add(1);
		}
		
		if(minus.size()%2 ==1) {
			minus.add(zero>0 ? 0 : 1); // ¦�� �ȸ����� 0������ 0�� �־���. �ƴϸ� 1����
		}

		int result=one; //1�� ������ �ϴ� �������� �����̴�.
		
		for(int i=0; i<plus.size();i+=2) {
			result+= plus.get(i)* plus.get(i+1);
		}
		for(int i=0; i<minus.size();i+=2) {
			result+= minus.get(i)* minus.get(i+1);
		}
		
		System.out.println(result);
	}

}
