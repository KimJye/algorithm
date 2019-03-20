package array;

import java.util.Scanner;

/*
 * Date: 2019. 03. 20
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2577
 * Title : 숫자의 개수
 * description : 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
                 예를 들어 A = 150, B = 266, C = 427 이라면
                 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
                 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

                 입력 : 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
                 출력 : 첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다.
                        마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

 * 예제 입력 : 150                  예제 출력 : 3
               266                              1
               427                              0
                                                2
                                                0
                                                0
                                                0
                                                2
                                                0
                                                0

 * solution : 단계별 문제 풀이 - 1차원 배열

 * 풀이과정 : 0. 크기가 10인 int형 배열을 만든다.
              1. 세 개의 자연수를 곱한 결과를 int형으로 저장한다.
              2. 반복문을 통해 일의 자리수부터 해당 자리수까지 이동하면서, 각각의 자리수를 인덱스라고 생각하고, 배열의 인덱스에 값을 증가한다.
              ------
              v1과 비교했을 때 차이 : v1은 아스키코드를 이용했고, v2는 숫자의 자리수를 이용해서 풀었다.
                                      아스키코드로 0은 48, 1은 49다.
                                      그래서 v1에서 곱셈 결과값을 string으로 받고, charAt()으로 '0'을 빼니까 결과적으로는 문자열이지만 입력한 숫자그대로의 값이 나오게된다.
 */
public class P2577v2 {
    // 조건 : A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수
    static boolean preRequisites(int a, int b, int c){
        if((a>=100 && a<1000) && (b>=100 && b<1000) && (c>=100 && c<1000)){
            return true;
        }
        return false;
    }
    //0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하기
    static void solution(int mul){
        int [] answer = new int[10];
        int value = mul;

        while(value>0){
            answer[value%10]++;
            value/=10;
        }
        // 출력
        for(int i=0; i<answer.length; ++i ){
            System.out.println(answer[i]);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(preRequisites(A,B,C)){
            int mul = A*B*C;
            solution(mul);
        }else
            return;
    }
}
