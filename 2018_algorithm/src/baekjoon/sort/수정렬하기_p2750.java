/*
 * 2018.07.10
 * ���� part
 * N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */
package baekjoon.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class �������ϱ�_p2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int �迭 �̿��ϴ� ��� with Arrays.sort()
		Scanner input = new Scanner(System.in);
		
		int num;// ���� ����
		num = input.nextInt();
		
		int [] list = new int[num];
		
		for(int i=0; i<num; ++i) {
			list[i]=input.nextInt();
		}
		
		Arrays.sort(list);
		
		for(int x : list) {
			System.out.println(x);
		}
		
		/*
		//ArrayList ����ϱ� with Collections.sort()
		Scanner input = new Scanner(System.in);
		
		int num;// ���� ����
		num = input.nextInt();
		
		List<Integer> list  = new ArrayList();
		
		for(int i=0; i<num; ++i) {
			int temp = input.nextInt();
			list.add(temp);
		}
		
		Collections.sort(list);
		
		for(int x : list) {
			System.out.println(x);
		}
		�Ǵ�
		for(int i=0; i<num; ++i){
			System.out.println(list.get(i));
			}
		*/
	}

}
