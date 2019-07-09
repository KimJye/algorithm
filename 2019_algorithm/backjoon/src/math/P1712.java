package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1712
 * Title : 손익분기점
 * description : 월드전자는 노트북을 제조하고 판매하는 회사이다.
 				 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며,
 				 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
				 예를 들어 A=1,000, B=70이라고 하자.
				 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

				 노트북 가격이 C만원으로 책정되었다고 한다.
				 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다.
				 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

				 A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.

                 출력 : 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다.
                 		손익분기점이 존재하지 않으면 -1을 출력한다.

 * solution : math
 *
 *  A = 1000, B = 70
 *  순수 수입 : 노트북 수입 , C = 170
 *  총 비용 = A + B = 1070
 *  노트북 값 : C = 170
 *  노트북 생성시 가변 비용 : B = 70
 *  노트북 수입 : C - B = 100
 *  고정 비용 : A = 1000 고정 비용
 *  손익 분기점 = (노트북 수입 * 판매량) - 고정비용
 *  (C-B)*X > A
 *  X > A / (C-B)
 *  --------------
 *  가변 비용이 노트북 순수 수입 보다 크거나 같으면 손익 분기점이 없다.
 *
 */
public class P1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		if (B>=C) {
			System.out.println(-1);
		}else
			System.out.println(A/(C-B)+1);
		br.close();
	}
}
