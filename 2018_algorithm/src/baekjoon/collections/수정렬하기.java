/*
 * N���� ���� ������������ �����ϴ� ����.
 */
package baekjoon.collections;

import java.util.*;

public class �������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<n; ++i) {
			int temp = input.nextInt();
			a.add(temp);
		}
		Collections.sort(a);
		for(int x : a) {
			System.out.println(x);
		}
		/*
		 * for(int i=0; i<n; ++i){
		 * 	System.out.println(a.get(i));
		 * }
		 */
	}

}
