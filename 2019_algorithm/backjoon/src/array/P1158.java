package array;

/*
 * Date: 2019. 07. 02
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1158
 * Title : 조세퍼스 문제
 * description : 조세퍼스 문제는 다음과 같다.
 				 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
 				 이제 순서대로 K번째 사람을 제거한다.
 				 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
 				 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
 				 원에서 사람들이 제거되는 순서를 (N, K)-조세퍼스 순열이라고 한다.
 				 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

 				 N과 K가 주어지면 (N, K)-조세퍼스 순열을 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)

                 출력 : 예제와 같이 조세퍼스 순열을 출력한다.


 * solution : ArrayList
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
규칙
		1 2 3 4 5 6 7
		=> (3,2)
		1 2 4 5 6 7
		=> (6,2+2=4)
		1 2 4 5 7
		=> (2,4+2=6=>6-(5-1)4-1==1)
		1,4,5,7
		=> (7,1+2==3)
		1,4,5
		=> (5,5=>5-2(3-1)-1==2)
		1,4
		=> (1, 2+2=>4-1(2-1)-1=2(>last.index)=> 2-1(2-1)-1 = 0. (1,0)
		4

		이것은 index = (index+K-1)%list.size()
		 */
public class P1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList();
		for(int i=1; i<=N; ++i){
			list.add(i);
		}

		List<Integer> resultList = new ArrayList<>();
		int index=0;

		while(N-- >0){
			index = (index + K -1) % list.size();
			resultList.add(list.remove(index));
		}
		System.out.println(resultList.toString().replace('[','<').replace(']','>'));

		br.close();
	}
}
