package function;

import java.util.Scanner;

/*
 * Date: 2019. 03. 12
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2448
 * Title : 별찍기 11
 * description : 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
                 입력 : 첫째 줄에 N이 주어진다. N은 항상 3×2k 수이다. (3, 6, 12, 24, 48, ...) (k ≤ 10)
                 출력 : 첫째 줄부터 N번째 줄까지 별을 출력한다.


 * solution : 단계별 문제 풀이 - 함수

 k=0,N=3 일때,    i=0      *
                  i=1    *   *
                  i=2  * * * * *

 k=1,N=6 일때,    i=3 : k=0일때의 i=0의 문자열 + 공백 + k=1일때의 i=0의 문자열
                  i=4 : k=0일때의 i=1의 문자열 + 공백 + k=1일때의 i=1의 문자열
                  i=5 : k=0일때의 i=2의 문자열 + 공백 + k=1일때의 i=2의 문자열
                  기존(i=0,1,2)은 양 옆에 3칸 공백 추가..?

 k=2,N=12 일때,   i=6 : k=1일때의 i=0의 문자열 + 공백 + k=2일때의 i=0의 문자열
                  i=7 : k=1일때의 i=1의 문자열 + 공백 + k=2일때의 i=1의 문자열
                  i=8 : k=1일때의 i=2의 문자열 + 공백 + k=2일때의 i=2의 문자열
                  i=9 :
                  i=10 :
                  i=11 :
                  기존(i=0,1,2,3,4,5)은 양 옆에 6칸 공백 추가..?
                  //현단계 밑에 현단계를 2개 만들고 현단계를 오른쪽으로 옮긴다. 현단계를 옮길 때는 3*2^(k-1) 값.
 */
public class P2448 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        /*
            N = 3 * 2^k
            N/3 = 2^k
            log2(N/3)=k
         */
        int k = (int)(Math.log(N/3)/Math.log(2));


        String stars [] = new String[N];
        stars[0] = "  *  ";
        stars[1] = " * * ";
        stars[2] = "*****";


        for(int i=0; i<k; ++i){ //N=24, K=3.

        }


    }
}
