package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1보다 큰 임의의 정수를 입력하여 소수를 판별하라
 * solution : 어떤 수 X가 소수인지를 판별하려면, X를 2부터 X의 제곱근까지의 숫자로 나누어 떨어지는지 검사하면 되다.
 *            제곱근까지의 수 중 한 개의 수에 대해서ㅓ라도 나누어 떨어지ㅕㄴ 소수가 아니다.
 */
public class Ex13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        sc.close();

        int i=2;
        while(true) {
            if(i<=Math.sqrt(X)){
             if(X%i==0){
                 System.out.println("소수 아님");
                 break;
             }
             i++;
            }else {
                System.out.println("소수");
                break;
            }
        }
    }
}
