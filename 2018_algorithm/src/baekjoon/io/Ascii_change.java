/*
 * 2018.03.18
 * ������
	����: ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, 
		 �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */


package backjun_2018;

import java.util.Scanner;

public class Ascii_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String regexa="[a-z]";//�ҹ���
		String regexb="[A-Z]";//�빮��
		String regexc="[0-9]";//����
		
		String value;
		
		System.out.print("�Է�: ");
		value=input.next();
		
		char result=value.charAt(0);
		
		if(value.matches(regexa)){
			System.out.println(Integer.valueOf(result));
		}else if(value.matches(regexb)){
			System.out.println(Integer.valueOf(result));
		}else if(value.matches(regexc)){
			System.out.println(Integer.valueOf(result));
		}
		
		
	}

}
