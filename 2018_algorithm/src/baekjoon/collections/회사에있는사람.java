package baekjoon.collections;

import java.io.*;
import java.util.*;

public class ȸ�翡�ִ»�� {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());//�α׿� ��ϵ� ���� ����� ��
		String [] line = new String[2];
		
		HashSet<String> d = new HashSet<String>();

		for(int i=0;i<n;++i) {
			line = bf.readLine().split(" ");

			if(line[1].equals("enter")) {
				d.add(line[0]);
			}
			else {
				d.remove(line[0]);
			}
		}
		String[] array = d.toArray(new String[d.size()]);
		Arrays.sort(array);
		
		for(int i=array.length-1; i>=0; --i)
			System.out.println(array[i]);
		
		bf.close();

	}
}
