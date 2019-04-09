package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 임의의 정수를 입력 받아 그 안에 포함된 소수의 합을 구하라.
 * solution : 예를 들어 10을 입력 받았다면 2~10 사이에 속한 소수의 합을 계산한다.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        sc.close();

        int HAP = 0; // 합계
        int K =2; // 소수인지 판별할 숫자가 저장될 변수

        while(true){
            int J=2; // 소수인지 판별할 때 사용할 몫이 저장될 변수

            while((K%J)!=0) {
                ++J;
            }
            if (K == J) {
                HAP+=K;
            }
            if(K<X){
                K++;
            }
            else {
                System.out.println(HAP);
                break;
            }
        }
    }
}
