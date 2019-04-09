package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1보다 큰 임의의 정수를 입력하여 소수를 판별하라
 * solution : 소수를 판별할 숫자 X를 2부터 차례로 나누어서 처음으로 나누어 떨어졌을 때 X와 몫이가 같으면 소수이다.
              즉, 중간에 한번도 나누어 떨어진 수가 없다는 것을 의미하므로, 1과 자기 자신만을 약수로 갖는 소수이다.
 */
public class Ex12 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        sc.close();

        int i=2;
        while((X%i)!=0) {
            ++i;
        }
        if (X == i) {
            System.out.println("소수");
        } else {
            System.out.println("소수 아님");
        }
    }
}
