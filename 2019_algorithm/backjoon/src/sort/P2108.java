package sort;

import java.io.*;
import java.util.*;

/*
 * Date: 2019. 06. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2108
 * Title : 통계학
 * description :수를 처리하는 것은 통계학에서 상당히 중요한 일이다.
 				통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다.
 				단, N은 홀수라고 가정하자.
 					산술평균 : N개의 수들의 합을 N으로 나눈 값
					중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
					최빈값 : N개의 수들 중 가장 많이 나타나는 값
					범위 : N개의 수들 중 최댓값과 최솟값의 차이

				N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

                입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
                  	   그 다음 N개의 줄에는 정수들이 주어진다.
                 	   입력되는 정수의 절댓값은 4,000을 넘지 않는다

                출력 : 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
					   둘째 줄에는 중앙값을 출력한다.
					   셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
					   넷째 줄에는 범위를 출력한다.
 * solution : 정렬, HashMap
 */
public class P2108 {

	// 산술평균
	static int average(int[] a) {
		int sum = 0;

		for (int i : a) {
			sum += i;
		}

		double result = (double)sum / a.length;

		// 음수
		if(result<0){
			result *=-1;
			return (int) (Math.round(result))*-1;
		}

		return (int) Math.round(result);
	}

	// 중앙값
	static int mid(int[] a) {
		int mid = a.length / 2;
		return a[mid];
	}

	// 최빈값
	static int frequent(int[] a) {

		// 값이 1개일 때는 그 값이 최빈값
		if (a.length == 1) {
			return a[0];
		}

		// 중복 제거
		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < a.length; ++i) {
			int key = a[i];
			if (hashMap.containsKey(key)) {
				hashMap.put(key, hashMap.get(key) + 1);
			} else {
				hashMap.put(key, 1);
			}
		}
		// 최빈값 중 두번째로 작은 값 찾기
		List<Integer> list = sortByValue(hashMap);
		int maxValue = hashMap.get(list.get(0));
		int min = list.get(0);
		int result=min;

		for(int i=1; i<list.size(); ++i){
			if((hashMap.get(list.get(i)) == maxValue)){
				if(list.get(i)<min){
					result = min;
					min = list.get(i);
				}
				else if((list.get(i)> min && list.get(i)<result) || min == result)
					result = list.get(i);
			}
		}

		return result;
	}

	// Value 기준 내림차순 정렬
	static List<Integer> sortByValue(final Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList(map.keySet());

		Collections.sort(list, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer v1 = map.get(o1);
				Integer v2 = map.get(o2);
				return (v1>v2) ? -1 : ((v1==v2)? 0 : 1 );
			}
		});

		return list;
	}

	// 범위값
	static int range(int[] a) {
		return a[a.length - 1] - a[0];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int i = 0;
		while (n-- > 0) {
			arr[i++] = Integer.parseInt(br.readLine());
		}
		br.close();

		Arrays.sort(arr);

		// 산술평균
		bw.write(String.valueOf(average(arr)));
		bw.newLine();

		// 중앙값
		bw.write(String.valueOf(mid(arr)));
		bw.newLine();

		// 최빈값
		bw.write(String.valueOf(frequent(arr)));
		bw.newLine();

		// 범위
		bw.write(String.valueOf(range(arr)));

		bw.flush();
	}
}
