package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 10진수를 입력 받아 2진수로 변환하라. 단, 1000 이하의 숫자를 입력 받는다.
 * solution : 10진수를 2진수로 변환하려면 10진수를 2로 나누어 나머지를 구한 후 저장하고,
 *            다시 몫을 2로 나누어 나머지를 구해 저장하는 과정을 반복한다.
 *            몫이 0이 될 때까지 이 작업을 반복한 후 마지막에 구한 나머지부터 거꾸로 출력한다.
 *
 *            10진수 25를 2진수로 변환해 보자.
 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        sc.close();
        int a[] = new int[10]; //입력 받은 10진수를 2로 나눈 나머지(2진수)가 저장될 배열
        int bb = b; // 입력 받은 10진수를 그대로 출력하기 위해 b가 저장될 변수
        int c = -1; // 배열의 위치를 지정해주는 변수.
        int mok=0; // b를 2로 나눈 몫이 저장될 변수
        int nmg; // b를 2로 나눈 나머지가 저장될 변수
        int i; // 배열을 출력할 때 배열의 위치를 지정해 주는 변수

        do{
            c++;
            mok = b/2;
            nmg = b-mok*2;
            a[c]=nmg;
            b=mok;
        }while(mok!=0);
        System.out.println("b : "+bb);
        for (i = c; i >= 0; --i) {
            System.out.print(a[i]+" ");
        }
    }
}
