/*
 * ���ڿ� N���� �־�����. 
 * �� ��, ���ڿ��� ���ԵǾ� �ִ� �ҹ���, �빮��, ����, ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * �� ���ڿ��� ���ĺ� �ҹ���, �빮��, ����, �������θ� �̷���� �ִ�.
 */
package baekjoon.string;

import java.io.*;

public class ���ڿ��м�_p10820 {
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
				else if(words.toCharArray()[i]>=48 && words.toCharArray()[i]<=57)//����
					num++;
				else if(words.toCharArray()[i]>=65 && words.toCharArray()[i]<=90)//�빮��
					upper++;
				else if(words.toCharArray()[i]>=97 && words.toCharArray()[i]<=122)//�ҹ���
					lower++;
			}
			System.out.println(lower+" "+ upper+" "+num+" "+split+ " ");
		}
	}
}
