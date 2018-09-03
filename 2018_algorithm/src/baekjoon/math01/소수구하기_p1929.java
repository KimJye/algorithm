/*
 * M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 */
package baekjoon.math01;

import java.util.ArrayList;
import java.util.Scanner;

public class �Ҽ����ϱ�_p1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Boolean> primeList;
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if((a|b)<=1) return;
		
		primeList = new ArrayList<Boolean>(b+1);
		
		primeList.add(false);
		primeList.add(false);
		
		for(int i=2; i<=b;++i) {
			primeList.add(i,true);
		}
		
		for(int i=2; (i*i)<=b; ++i) {
			if(primeList.get(i)) {
				for(int j=i*i; j<=b; j+=i) primeList.set(j, false);
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for(int i=a; i<=b; ++i) {
			if(primeList.get(i)==true) {
				builder.append(i);
				builder.append("\n");
			}
		}
		System.out.println(builder.toString());

	}

}
