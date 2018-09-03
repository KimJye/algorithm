/*
 * �� N���� �־����� ��, N���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� N(1 �� N �� 100)���� ���� �������� ���еǾ �־�����. 
 * �Է����� �־����� ���� 10,000���� �۰ų� ���� �ڿ����̴�. 
 * ��, 0���� �����ϴ� ���� �־����� �ʴ´�.
 */

package baekjoon.io;

import java.io.*;
import java.util.*;

public class ���ϱ�3 {
	
	public static void main(String[] args) throws IOException {
		//StringTokenizer�� ����
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		int sum = 0;
		while(st.hasMoreTokens()) {
			sum += Integer.valueOf(st.nextToken());
		}
		System.out.println(sum);
		
		/*BufferedReader�� ����
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split(" ");
		
		//if(Integer.parseInt(bf.readLine())<1) return; //���� ���� �����ϸ� ������...
		
		int sum=0;
		
		for(int i=0; i<line.length; ++i) {
			sum+=Integer.parseInt(line[i]);
		}
		System.out.println(sum);
		*/
		
		
		/* Scanner�� Ǯ��
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(input.hasNextInt()) {
			sum+=input.nextInt();
		}
		System.out.println(sum);
		*/
	}
	
}
