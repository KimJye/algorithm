package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p10953 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num= input.nextInt();//����
				
		input.nextLine();
		
		for(int i=0;i<num;++i) {
			String s=input.nextLine(); // String s = input.nextLine()�ϸ� �ȵƾ���. ������?
			String [] array = s.split(",");
			
			int a=Integer.parseInt(array[0]);
			int b=Integer.parseInt(array[1]);
			
			System.out.println(a+b);
			
		}
		input.close();
		
	}
}
