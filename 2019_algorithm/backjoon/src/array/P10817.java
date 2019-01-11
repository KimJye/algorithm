package array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Date: 2019. 01. 11.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10817
 * Title : 세 수
 * description : 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
                 입력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
                 출력 : 두 번째로 큰 정수를 출력한다.

 * solution : if문 사용 문제이지만 배열로 풀기.

 */
public class P10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = new int [3];

        for(int i=0; i<3; ++i){
            num[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);

        System.out.println(num[1]);

    }
}
