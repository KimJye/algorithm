/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * �� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ܾ ���ԵǾ� �ִ� a�� ����, b�� ����, ��, z�� ������ �������� �����ؼ� ����Ѵ�.
 */
package baekjoon.string;

import java.util.Scanner;

public class ���ĺ�����_p10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		
		int count=0;
		
		for(int i=97; i<=122; ++i) {
			for(int j=0; j<str.length();++j) {
				if(str.charAt(j)==i) {
					count++;
				}else
					continue;
			}
			System.out.print(count+" ");
			count=0;	
		}
	}

}
