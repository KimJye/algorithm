package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1보다 큰 임의의 정수를 입력하여 소수를 판별하라
 * solution : 어떤 수 X가 소수인지를 판별하려면 X를 2부터 X보다 1작은 수(X-1)까지 차례대로 나누어 떨어지는지 검사하면 된다.
 *            나누어 떨어지면 소수가 아니다.
 */
public class Ex11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        sc.close();

        int i= X-1;
        int j=2;

        while(true){
            if(j<=i){
                if(X%j==0){
                    System.out.println("소수 아님");
                    break;
                }else
                    j++;
            }else{
                System.out.println("소수");
                break;
            }
        }
    }
}
