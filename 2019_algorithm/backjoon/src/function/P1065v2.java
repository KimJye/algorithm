package function;

import java.util.Scanner;

/*
 * Date: 2019. 03. 05 version 2
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
              1,2,3,4,5,6,7,8,9,10 => 한자리수는 등차수열이다. 즉 한수이다.
              11,12,13,14,15,16,17,18,19,....99 => 두자리수는 등차수열이다. 즉 한수이다.
              111,123,357,468,753 => 세자리수는 구해야한다.



 */
public class P1065v2 {
    public static int checkIsometric(int i){
        int checkIsometric [] = new int[3];
        int k=checkIsometric.length-1;//2

        //등차수열 확인을 위해 각 자리수의 값을 각각 저장
        while(i>0)
        {
            checkIsometric[k] = i%10; // 1의 자리. (1) 123%10=3. c[2]=3 => (2) c[1] = 2 => (3) c[0] = 1
            i = i/10;// 자릿수 옮김. (1) i=12 => (2) i=1 => (3) i=0
            --k;//배열 인덱스값. (1) k=1 => (2) k=0 => (3) k=-1
            if(k<0)
                break;
        }

        // 등차수열 확인. 공식 : 2 * an_2 = an_1 + an_3
        if((checkIsometric [1] *2) == (checkIsometric [0] + checkIsometric [2])){
            return 1;
        }

        return 0;
    }
    public static int getHansu(int n){

        int result; //한수 개수

        if(n<100){
            return n; // 한자리수와 두자리수는 한수이다.
        }else{
            result = 99; // 세자리수일 때는 기본으로 한수가 99개이다. 1~99까지.

            for(int i=100; i<=n; ++i){
                result= result + checkIsometric(i);
            }
            if(n==1000){ // 1000은 한수가 아니라서 하나 빼줌.
                result--;
            }
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //1000보다 작거나 같은 자연수 N
        if(N<1 || N>1000)
            return;
        System.out.println(getHansu(N));

    }
}
