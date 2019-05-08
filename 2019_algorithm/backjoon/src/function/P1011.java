package function;

import java.util.Scanner;

/*
 * Date: 2019. 05. 01
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/1011
 * Title : Fly me to the Alpha Centauri
 * description :  이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다.
 *                예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나
 *                사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며,
 *                그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다.
 *                ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
 *
 *                김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에
 *                x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다.
 *               하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여
 *               y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.

                김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한
                공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.

                 입력 : 입력의 첫 줄에는 테스트케이스의 개수 T가 주어진다.
                        각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며,
                        x는 항상 y보다 작은 값을 갖는다. ( 0 ≤ x < y < 231)

                 출력 : 각 테스트 케이스에 대해 x지점으로부터 y지점까지
                        정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 회수를 출력한다.

 * solution : 규칙 찾기 문제
 *            1->1->2->2->3->3->4->4->5->5->......
 *            거리                       최소 갯수
 *             1                            1                       (0+1)*1=1
 *             2                            2
 *             3                            3                       (1+1)*1=2
 *             4                            3
 *             5                            4
 *             6                            4                       2*2=4
 *             7                            5                      (2+1)*1=3
 *             8                            5
 *             9                            5
 *             10                           6
 *             11                           6
 *             12                           6                      (2+1)*2=6
 *             13                           7                      (3+1)*1=4
 *             14                           7
 *             15                           7
 *             16                           7
 *             17                           8
 *             18                           8
 *             19                           8
 *             20                           8                      (3+1)*2=8
 *             21                           9
 *
 * 시간초과...
 */
public class P1011 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        while(num-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dis = y-x;

            int len=0;
            int value=0;

            outerLoop :
            for(int i=1; i<=Math.pow(2,31); ++i){
                ++value;
                for(int j=1; j<=i*2; ++j){
                    ++len;
                    if(((i*2)/2)+1==j){
                        ++value;
                    }
                    if(dis==len){
                        System.out.println(value);
                        break outerLoop;
                    }
                }
            }

        }
        sc.close();


    }
}
