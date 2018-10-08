package greedy;

/*
 * (1,2),(1,-2),(2,1),(2,-1)로 갈 수 있음.
 *이동 횟수가 4번 이상인 경우에는 위의 이동 방법을 각각 한 번씩 이용해야 한다.
 *병든 나이트가 방문할 수 있는 칸의 개수중 최댓값을 출력한다.
 ************************************
 * At first, not understand using the width-value, but after understanding the problem, coding was very simple.
 */

import java.util.Scanner;

public class p1783_병든나이트 {

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
