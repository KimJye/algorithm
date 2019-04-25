package function;

import java.util.Scanner;

/*
 * Date: 2019. 04. 25
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2292
 * Title : 벌집
 * description : 위의 그림과 같이 육각형으로 이루어진 벌집이 있다.
 *               그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서
 *               1씩 증가하는 번호를 주소로 매길 수 있다.
 *               숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때
 *               몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
 *               예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

                 입력 : 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
                 출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

 * solution : 규칙 찾기 문제
 *           최소 1개의 방을 지날 때 방들 : 1
 *           최소 2개의 방을 지날 때 방들 : 2~7
 *           최소 3개의 방을 지날 때 방들 : 8~19
 *           최소 4개의 방을 지날 때 방들 : 20~37
 *           최소 5개의 방을 지날 때 방들 : 38~61
 *           최소 6개의 방을 지날 때 방들 : 62~91
 *           ....
 *           1->7->19->37->61->91 : 6의 배수 규칙적 증가.
 */
public class P2292 {

    static boolean preRequisites(int n){
        if(n<0 || n>1000000000) return false;
        return true;
    }

    static int solution(int n){
        int i=1; // 최소 방의 개수
        int rule=0; // 6의 배수 규칙적 증가
        int start=i;
        int end=i;
        int result=0;

        while(true){
            if(n>=start && n<=end){
                result=i;
                break;
            }
            ++i;
            rule+=6;
            start=end+1;
            end +=rule;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(!preRequisites(n)) return;

        System.out.println(solution(n));

    }
}
