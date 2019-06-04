package array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Date: 2019. 05. 22
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2750
 * Title : 수 정렬하기
 * description : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오

                 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다.
                        이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

                 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * solution : 정렬
 */
public class P2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        while(t-- >0){
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();

       list.stream().sorted().forEach(System.out::println);
    }
}
