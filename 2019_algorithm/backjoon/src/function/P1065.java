package function;

import java.util.Scanner;

/*
 * Date: 2019. 01. 17
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1065
 * Title : 한수
 * description : 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다.
                 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
                 N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

                 출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

 * solution : 함수 문제
              규칙을 보아하니, 한수는 한자리수 와 두자리수 그리고 세자리에서 등차 수열인 수다.


 */
public class P1065 {
    static  int checkSequence(int i){
        int n1 = i/100%10; //100의 자리
        int n2 = i/10%10; //10의 자리
        int n3 = i%10; //1의 자리

        //검사
        if(n2 * 2 == ( n1 + n3)){
            return 1;
        }
        return 0;
    }
    static int getHanSu(int n){
        int result = 0;
        if(n<100){//한자리수 또는 두자리수
            return n;
        }else{// 세자리수
            result = 99;//세자리수면 기본 99개

            for(int i=100;i<=n; ++i){
                result += checkSequence(i);//등차수열 검사
            }

            if(n==1000)
                result--;
        }
        return  result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(getHanSu(n));
    }

}
