package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 두 수를 입력 받아 두 수의 최대 공약수와 최소공배수를 계산해서 출력하라.
 * solution : 최대공약수와 최소공배수를 구할 두 수 중 큰 수와 작은 수를 정한 뒤 큰 수를 작은수로 나누어 나머지를 구한다.
 *            이 때, 나머지가 0이면 그때의 작은 수가 최대공약수이고,
 *            원래의 두 수를 곱한 값을 최대공약수로 나눈 값이 최소공배수이다.
 *            만약 큰 수를 작은 수로 나누었을 때 나머지가 0이 아니면, 그때의 작은 수를 큰 수로 하고
 *            나머지를 작은 수로 하여 나머지가 0이 될 때까지 반복한다.
 *            이와 같이 큰 수를 작은 수로 나눠 나머지가 0이 될 때까지 반복하여
 *            최대공약수를 구하는 방법을 유클리드 호제법이라고 한다.
 *
 *            15와 12의 최대공약수와 최소공배수를 구해보자.
 *            15/12-> 목:1, 나머지:3
 *            12/3-> 목:4, 나머지:0   => 3이 최대공약수
 *           (15*12)/3 =>60 => 최소공배수
 *
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int big = 0; // 입력 받은 수 중 큰 수가 저장될 변수
        int small = 0; // 입력 받은 수 중 작은 수가 저장될 변수
        int mok; // 큰 수를 작은 수로 나눈 몫이 저장될 변수
        int nmg = 0; // 큰 수를 작은 수로 나누었을 때 나머지가 저장될 변수
        int gcm; // 최대공약수가 저장될 변수
        int lcm; // 최소공배수가 저장될 변수

        if (a > b) {
            big = a;
            small = b;
        } else if (a < b) {
            big = b;
            small = a;
        }
        /*
          15와 12의 최대공약수와 최소공배수를 구해보자.
 *            15/12-> 목:1, 나머지:3
 *            12/3-> 목:4, 나머지:0   => 3이 최대공약수
 *           (15*12)/3 =>60 => 최소공배수
         */
        while (true) {
            mok = big / small;
            nmg = big - mok * small;// big % small;
            if (nmg == 0) {
                gcm = small;
                lcm = a * b / gcm;
                System.out.print(gcm + "  " + lcm);
                break;
            }
            big = small;
            small = nmg;
        }
    }
}
