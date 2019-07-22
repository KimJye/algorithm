package math;

import java.util.Scanner;

/*
 * Date: 2019. 07. 23
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/3053
 * Title : 택시 기하학
 * description : 택시 기하학에서 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리는 다음과 같이 구할 수 있다.

				 D(T1,T2) = |x1-x2| + |y1-y2|
				 반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
 *
				 입력 : 첫째 줄에 반지름 R이 주어진다. R은 10,000보다 작거나 같은 자연수이다.

                 출력 : 첫째 줄에는 유클리드 기하학에서 반지름이 R인 원의 넓이를,
                 		둘째 줄에는 택시 기하학에서 반지름이 R인 원의 넓이를 출력한다.
						정답과의 오차는 0.0001까지 허용한다.

 * solution : String.format().
 */
public class P3053 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		//DecimalFormat df = new DecimalFormat("0.000000"); df.format(r*r*Math.PI);
		System.out.println(String.format("%.6f",r*r*Math.PI));
		System.out.println(String.format("%.6f",(double)r*r*2));
	}
}
