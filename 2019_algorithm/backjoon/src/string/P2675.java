package string;

import java.util.Scanner;

/*
 * Date: 2019. 01. 19
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/2675
 * Title : 문자열 반복
 * description : 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
                 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
                 QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

                 입력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다.
                        S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

                 출력 : 각 테스트 케이스에 대해 P를 출력한다.

 * solution : 문자열 문제
              next()는 개행문자, 공백 무시하고 문자를 입력받는다.
              nextLint()는 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식한다.
 */
public class P2675 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수

        while(T-- >0){
            int R = sc.nextInt();

            //String S = sc.next();

            String S = sc.nextLine();
            S = S.trim();

            for(int i=0; i< S.length(); ++i){
                for(int j=0; j<R; ++j){
                    System.out.print(S.charAt(i));
                }
            }
            System.out.println();
        }
        sc.close();



    }
}
