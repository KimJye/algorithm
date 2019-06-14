package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * Date: 2019. 06. 12
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1472
 * Title : 소트인사이드
 * description :배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

                입력 : 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

                출력 : 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

 * solution : 정렬, Array, radix sort
 */
public class P1472 {

	static int getMax(Integer[] a, int n) {
		int max = a[0];
		for (int i = 1; i < n; ++i) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	static void countingSort(Integer[] a, int n, int nth) {

		// 10개의 count가 필요함. 10진수는 0~9로 표현됨. digit = 10개
		int[] count = new int[10];

		// 해당 자릿수를 구하고, 그 자릿수의 digit 값의 count 증가
		for (int i = 0; i < n; ++i) {
			count[(a[i] / nth) % 10]++;
		}

		// nth 자리(자릿수)의 값을 기준으로 정렬 했을 때, 각 값의 시작 위치 계산
		int[] index = new int[10]; // 시작 위치 배열
		index[0] = count[0];
		for (int i = 1; i < index.length; ++i) {
			index[i] = index[i - 1] + count[i];
		}

		// 위에서 계산한 시작 위치를 사용하여 값들을 temp 배열에 복사함. 즉 정렬함.
		int[] temp = new int[a.length];
		for (int i = n - 1; i >= 0; --i) {
			int digit = (a[i] / nth) % 10;
			temp[index[digit] - 1] = a[i];
			index[digit]--;
		}

		// 정렬된 temp 배열의 값을 입력 배열에 복사
		for (int i = 0; i < a.length; ++i) {
			a[i] = temp[i];
		}
	}

	static void radixSort(Integer[] a, int n) {
		// 가장 큰 수의 자릿수만큼 반복하여 정렬해야하기 때문에, 가장 큰 수를 구해줌.
		int m = getMax(a, n);

		// 가장 큰 수의 자릿수만큼 countingSort.
		// nth : 자릿수.
		for (int nth = 1; m / nth > 0; nth *= 10) {
			countingSort(a, n, nth);
		}
	}

	static void solution2(Integer[] a) {
		radixSort(a, a.length);
		Collections.reverse(Arrays.asList(a));
		for(int i : a){
			System.out.print(i);
		}
	}

	static void solution1(Integer[] a) {
		Arrays.sort(a, Collections.reverseOrder());
		for(int i : a){
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int n = N.length();
		Integer[] a = new Integer[n];

		for (int i = 0; i < n; ++i) {
			a[i] = N.charAt(i) - '0';
		}

		solution1(a); // array sort
		System.out.println();
		solution2(a); // radix sort
	}
}
