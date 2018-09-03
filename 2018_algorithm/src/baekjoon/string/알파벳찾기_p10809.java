package baekjoon.string;

import java.util.Scanner;

public class ¾ËÆÄºªÃ£±â_p10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		
		int[] arr = new int[26];
		for(int i=0;i<26;++i) {
			arr[i]=-1;
		}
		
		for(int i=0; i<str.length();++i) {
			int index = str.charAt(i)-'a';
			
			if(arr[index]==-1) {
				arr[index]=i;
			}
		}
		
		for(int i=0;i<26;++i)
		{
			System.out.print(arr[i]+" ");
		}
		}

}
