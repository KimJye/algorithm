package io;

import java.io.*;

/*
 * Date: 2019. 01. 07.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/15552
 * Title : 빠른 A+B
 * description : 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
                 Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
                 BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
                 입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
                        다음 T줄에는 각각 두 정수 A와 B가 주어진다.
                        A와 B는 1 이상, 1,000 이하이다.
                 출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
public class P15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        while(n-- >0){
            String input = br.readLine();
            String word [] =input.split(" ");
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write((a+b)+"\n");
        }
        br.close();
        bw.flush();
    }
}
