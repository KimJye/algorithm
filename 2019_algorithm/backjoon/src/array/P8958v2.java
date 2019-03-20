package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 03. 20
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/8959
 * Title : OX퀴즈
 * description : "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
                  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
                 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
                 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

                 입력 : 첫째 줄에 테스트 케이스의 개수가 주어진다.
                        각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
                 출력 : 각 테스트 케이스마다 점수를 출력한다.

 * 예제 입력 : 5                            예제 출력 :
               OOXXOXXOOO                               10
               OOXXOOXXOO                               9
               OXOXOXOXOXOXOX                           7
               OOOOOOOOOO                               55
               OOOOXOOOOXOOOOX                          30

 * solution : 단계별 문제 풀이 - 1차원 배열

 * 풀이과정 : 1. 변수하나를 둔다.
              2. O일때 변수를 증가하고 X일때는 변수를 0으로 초기화한다.
              ------
              v1과 비교했을 때 차이 : 메모리,시간 둘다 줄였다.

 */
public class P8958v2 {
    //조건 : 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
    static boolean preRequisites(String str){
        if(str.length()<=0 || str.length()>=80){
            return false;
        }
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)!='O'&& str.charAt(i)!='X'){
                return false;
            }
        }
        return true;
    }
    static int solution(String str){
        int count=0;
        int answer=0;
        int [] arr = new int[str.length()];

        // 배열에 알맞은 값 넣기 및 총점계산
        for(int i=0; i<str.length(); ++i){
            if(str.charAt(i)=='O'){
                ++count;
                arr[i]=count;
                answer+=count;
            }else{
                count=0;
                arr[i]=count;
                answer+=count;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        String str;

        while(number-- >0){
            str=bf.readLine();
            if(preRequisites(str)){
                System.out.println(solution(str));
            }else
                return;
        }
    }
}
