package dp;

import java.util.Scanner;

/*
 * Date: 2019. 05. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1003
 * Title : 피보나치 함수
 * description :fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
                fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
                fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
                두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
                fibonacci(0)은 0을 출력하고, 0을 리턴한다.
                fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
                첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
                fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

                1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때,
                0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
                        각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

                 출력 : 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

 * solution : 다이나믹 프로그래밍
 *
 * 처음에 재귀적으로 풀엇는데 시간초과가 발생했다.
 * 이유는 한 재귀문에서 0,1 개수를 모두 다 구하려 한 로직 때문이었다.
 * 재귀적으로 풀고 싶었으면 0의 개수 재귀함수, 1의 개수 재귀함수 이렇게 총 두개로 나누어서 했어야 했다..
 * 그러나 문제를 봤을 때 한개의 함수면 좋겠다는 생각에 반복문으로 구현하였다.
 */
public class P1003 {

    static int d[][] = new int[41][2];

    static void f(int n) {

        // n이 0일때 0이고 0의 개수는 1
        // n이 1일때 1이고,1의 개수는 1
        d[0][0] = 1;
        d[0][1] = 0;
        d[1][0] = 0;
        d[1][1] = 1;

        for (int i = 2; i < d.length; ++i) {
            for (int j = 0; j <= 1; ++j) {
                d[i][j] = d[i - 1][j] + d[i - 2][j];
            }
        }

        System.out.println(d[n][0] + " " + d[n][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num-- > 0) {
            f(sc.nextInt());
        }
        sc.close();
    }
}
