package sort;

import java.io.*;

/*
 * Date: 2019. 05. 30
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10989
 * Title : 수 정렬하기3
 * description : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오

                 입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
                        둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

                 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

 * solution : 정렬
 *           Counting Sort : O(n)
 *           radix sort 공부하기
 */
public class P10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] a = new int[10001];

        // insert
        while (t-- > 0) {
            a[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int i=0; i<a.length; ++i){
            if(a[i]!=0){
                for(int j=0; j<a[i]; ++j){
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
