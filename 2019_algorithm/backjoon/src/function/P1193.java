package function;

import java.util.Scanner;

/*
 * Date: 2019. 04. 25
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2292
 * Title : 분수찾기
 * description : 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
                 X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 X(1 ≤ X ≤ 1,000,000,000)이 주어진다.
                 출력 : 첫째 줄에 분수를 출력한다.

 * solution : 규칙 찾기 문제
 *            1/1
 *            1/2->2/1
 *            3/1->2/2->1/3
 *            1/4->2/3->3/2->4/1
 *            ....
 *            홀수 짝수에 따라서 분자와 분모의 증가 감소 규칙이 다름
 */
public class P1193 {

    static boolean preRequisites(int x){
        if(x<0 || x>1000000000) return false;
        return true;
    }

    static String solution(int x){

        int i=1;
        int n=1;// 1부터 1000000000까지
        int numerator=1; // 분자
        int denominator=1; // 분모
        int count=0;
        String answer="";

        outerLoop :
        while(true){
            denominator=n;

            if(n%2==0){
                numerator = i;
                denominator = n;
                for(int j=0; j<n; ++j){
                    ++count;
                    if(count==x){
                        answer= String.valueOf(numerator)+"/"+String.valueOf(denominator);
                        break outerLoop;
                    }
                    ++numerator;
                    --denominator;
                }
            }else{
                numerator = n;
                denominator = i;
                for(int j=0; j<n; ++j){
                    ++count;
                    if(count==x){
                        answer= String.valueOf(numerator)+"/"+String.valueOf(denominator);
                        break outerLoop;
                    }
                    --numerator;
                    ++denominator;
                }
            }
            n++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(!preRequisites(x)) return;

        System.out.println(solution(x));

    }

}
