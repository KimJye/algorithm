package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�̻��� ���ڰ� ����... ���� �������ֱ�
public class p11655 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int size;
		
		StringBuffer sb = new StringBuffer();
		
		while((str=buffer.readLine())!=null) {
			size=str.length();
			
			for(int i=0; i<size; ++i) {
				char c = str.charAt(i);
				
				if(c>=65 && c<=90)//�빮��
					c+=13;
				else if(c>=97 && c<=122)//�ҹ���
					c+=13;
				else
					c-=13;
				sb.append(c);
			}
			
			System.out.println(sb.toString());
		}
	}

}
