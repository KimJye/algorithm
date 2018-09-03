package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//이상한 문자가 나옴... 범위 지정해주기
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
				
				if(c>=65 && c<=90)//대문자
					c+=13;
				else if(c>=97 && c<=122)//소문자
					c+=13;
				else
					c-=13;
				sb.append(c);
			}
			
			System.out.println(sb.toString());
		}
	}

}
