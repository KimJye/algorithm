package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��������������ϱ�_p11721 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		String reg = "[^a-zA-Z]";
		
		str=bf.readLine();
		
		for(int i=0; i<str.length(); ++i) {
			
			if(str.length()>100) break; //�Է� �ִ� 100��
			if(str==reg) break; //���ĺ� �ҹ���, �빮�ڷθ� �̷�����ִ�.
			
			if(i%10==0 && i!=0) System.out.println();
			
			System.out.print(str.charAt(i));
		}
		bf.close();
	}
}
