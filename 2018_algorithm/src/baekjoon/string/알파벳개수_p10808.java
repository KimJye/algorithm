/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 */
package baekjoon.string;

import java.util.Scanner;

public class 알파벳개수_p10808 {

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
