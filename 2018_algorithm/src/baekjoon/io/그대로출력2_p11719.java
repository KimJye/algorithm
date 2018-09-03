/*
 * �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�.
 *  �� ���� 100���ڸ� ���� �ʴ´�.
 *  �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
 */
package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// �� ���� �������� �������� �ʰ� �������� ������ �ʴ´� ��Ǯ����... �׸��� �� �� ������ �� ���α׷� ����....�ФФ�
public class �״�����2_p11719 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		String reg = "[^a-zA-Z0-9]";
		
		while((str=bf.readLine())!=null) {
			
			if(str.length()>100) break; //�Է� �ִ� 100��
			if(str==reg) break; //���ĺ� �ҹ���, �빮��, ���ڷθ� �̷�����ִ�.
			if(str.isEmpty()) break; //�� ���� �־����� �ʴ´�.
			
			System.out.println(str.toString());
		}
		bf.close();
		
	}
}
