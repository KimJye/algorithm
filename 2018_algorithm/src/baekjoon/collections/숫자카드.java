/*
 * ���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�. 
 * ���� M���� �־����� ��, �� ���ڰ� �����ִ� ���� ī�带 ����̰� ������ �ִ��� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * � ī�尡 �ִ��� Ȯ���ϱ� ������ HashSet����.
 */


package baekjoon.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ����ī�� {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine()); //����̰� �������ִ� ����
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		HashSet<Integer> d = new HashSet<Integer>();
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			d.add(num);
		}
		
		int b = Integer.parseInt(bf.readLine()); // ����̰� ������ �ִ� �������� �ƴ��� Ȯ���ϴ� ����
		st = new StringTokenizer(bf.readLine()); // ���� ����
		
		StringBuilder builder = new StringBuilder(); //������ ���
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if(d.contains(num)) {
				builder.append("1");
			}else {
				builder.append("0");
			}
		}
		System.out.println(builder);
	}

}
