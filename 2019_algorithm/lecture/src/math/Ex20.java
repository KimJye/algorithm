package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 10진수를 입력 받아 2진수, 8진수, 16진수로 변환해서 출력하라.
 *         단, 진수 표시에 사용될 0~9, A,B,C,D,E,F는 A[16] 배열에 저장되어있다고 가정한다.
 * solution : 이 방법은 10진수를 변환하려는 진수의 가장 가까운 누승부터 1까지 차례대로 나누는 방법으로,
 *            진수에 관계없이 모든 진법변환에 사용할 수 있다.
 *            예를 들면, 31을 2진수로 변환할 경우 누승이 16+8+4+2+1로 구성되어 있으므로
 *            31을 첫 번째 누승인 16으로 나누어 몫과 나머지를 구하면, 이때의 몫 1은 16을 의미하고,
 *            나머지는 15이다. 다시 나머지 15를 두 번째 누승인 8로 나누어 몫과 나머지를 구하면,
 *            이때 몫 1은 8을 의미하고 나머지는 7이 된다.
 *            이런 방법으로 1로 나눌 때까지 차례대로 반복하면 된다.
 *
 *            26을 2진수로 변환해보자.
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(); // 10진수가 저장될 변수
        int b = sc.nextInt(); // 변환할 진수
        sc.close();
        char a [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int d=1; // c에 가장 가까운 b의 누승이 저장될 변수
        int e; // c를 d로 나눈 몫이 저장될 변수
        int f; // c를 d로 나눈 나머지가 저장될 변수

        while(d<=c){
            d*=b;
        }
        while(true){
            if(d>1)
                d/=b;
            e = c/d;
            f = c-e*d;
            System.out.print(a[e]+" ");
            if(d!=1){
                c=f;
            }else break;
        }
    }
}
