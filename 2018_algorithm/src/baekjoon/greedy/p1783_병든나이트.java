package greedy;

/*
 * (1,2),(1,-2),(2,1),(2,-1)�� �� �� ����.
 *�̵� Ƚ���� 4�� �̻��� ��쿡�� ���� �̵� ����� ���� �� ���� �̿��ؾ� �Ѵ�.
 *���� ����Ʈ�� �湮�� �� �ִ� ĭ�� ������ �ִ��� ����Ѵ�.
 ************************************
 * At first, not understand using the width-value, but after understanding the problem, coding was very simple.
 */

import java.util.Scanner;

public class p1783_���糪��Ʈ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();// height
		int w = input.nextInt();// width
		
		if(h==1) {
			System.out.println(1);
		}
		else if(h==2) {
			System.out.println(Math.min(4,(w+1)/2));
		}
		else if(h>=3) {
			if(w<7) {
				System.out.println(Math.min(4, w)); //repeat (1,2),(1,-2)
			}
			else {
				System.out.println(w-2); // Using all 4 cases, repeat (1,2),(1,-2)
			}
		}
		
	}

}
