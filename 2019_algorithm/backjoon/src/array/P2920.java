package array;

import java.util.Scanner;

/*
 * Date: 2019. 01. 17
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2920
 * Title : 음계
 * description : 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
                 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.

                 출력 : 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

 * solution : 1차원 배열 문제

 */
public class P2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[8];

        for(int i=0; i<8; ++i){
            int n = sc.nextInt();
            array[i]=n;
        }
        sc.close();
        String answer="";

        for(int i=0; i<7; ++i){
         if((array[i]-array[i+1])==-1){
             answer="ascending";
         }else if((array[i]-array[i+1])==1){
             answer="descending";
         }else{
             answer="mixed";
             break;
         }
        }
        System.out.println(answer);
    }
}
