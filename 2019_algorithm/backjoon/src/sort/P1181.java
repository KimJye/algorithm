package sort;

import java.io.*;
import java.util.*;

/*
 * Date: 2019. 06. 12
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1472
 * Title : 단어 정렬
 * description : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

				 길이가 짧은 것부터
				 길이가 같으면 사전 순으로

                입력 : 첫째 줄에 단어의 개수 N이 주어진다.
                 	   (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
                 	    주어지는 문자열의 길이는 50을 넘지 않는다.

                출력 : 조건에 따라 정렬하여 단어들을 출력한다.
                 	   단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

 * solution : 정렬
 			  입력 과 출력은 bufferedReader/Writer
 			  중복 없어야하니까 Map 사용.
 			  조건에 따라 정렬해야함.
 */
public class P1181 {
	static List<String> solution(Map<String,Integer> map){
		// 길이가 짧은 것 부터, 길이가 같으면 사전 순으로
		// 즉, 사전순으로 먼저 정렬하고 그다음 길이 순으로 정렬
		// treeMap 사용으로 사전순은 정렬되었음.
		// key값들을 길이 순으로 정렬만 하면 됨.

		List<String> list = new ArrayList<>(map.keySet());

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});

		return list;
	}
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// input
		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> countMap = new TreeMap<>();

		while(N-- >0){
			countMap.put(br.readLine(),1);
		}

		// solution
		List<String> result = solution(countMap);

		//print
		for(String str : result){
			bw.write(str);
			bw.newLine();
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
