/*
 * 문자열 N개가 주어진다. 
 * 이 때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오. 
 * 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
 */
package baekjoon.string;

import java.io.*;

public class 문자열분석_p10820 {
	public static void main(String[] args) throws IOException {
		int lower, upper, num, split, size;
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String words="";
		
		while((words=buffer.readLine())!=null) {
			lower=0;
			upper=0;
			num=0;
			split=0;
			size=words.length();
			
			for(int i=0; i<size;++i) {
				if(words.toCharArray()[i]==' ')
					split++;
				else if(words.toCharArray()[i]>=48 && words.toCharArray()[i]<=57)//숫자
					num++;
				else if(words.toCharArray()[i]>=65 && words.toCharArray()[i]<=90)//대문자
					upper++;
				else if(words.toCharArray()[i]>=97 && words.toCharArray()[i]<=122)//소문자
					lower++;
			}
			System.out.println(lower+" "+ upper+" "+num+" "+split+ " ");
		}
	}
}
