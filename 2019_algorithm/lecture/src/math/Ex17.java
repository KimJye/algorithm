package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 정수를 입력 받아 약수를 구해 출력하라
 * solution : 어떤 수 X를 1부터 X까지 차례대로 나누어 나머지가 0이 되게 하는 몫들이 X의 약수이다.
              예를 들어 10의 약수는 10을 나누었을 때 나머지가 없게 하는 수이므로 1,2,5,10이다.
              10의 약수를 구해보자
 */
public class Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        sc.close();
        int a[] = new int[100]; // 구한 약수가 저장될 1차원 배열
        int c=0; // 1씩 증가되는 몫이 저장될 변수, 즉 C는 1부터 8까지 차례로 변경된다.
        int d=-1; // 약수가 저장될 a 배열의 위치를 지정해 주는 변수. 즉 d는 1부터 약수의 개수까지 차례로 변경된다.
        int mok; //나머지를 구하기 위해 입력 받은 수 b를 c로 나눈 몫이 저장될 변수
        int nmg; //입력 바든 숫자 b를 c로 나눈 나머지가 저장될 변수
        int i;// 약수를 출력할 때 배열의 위치를 지정해 주는 변수

        while(true){
            c++;
            if(c<=b) {
                mok = b / c;
                nmg = b - mok * c;
                if (nmg == 0) {
                    d++;
                    a[d] = c;
                }
            }else{
                System.out.println("b : "+b);
                for(i=0; i<=d; ++i){
                    System.out.print(a[i]+" ");
                }
                break;
            }
        }
    }
}
