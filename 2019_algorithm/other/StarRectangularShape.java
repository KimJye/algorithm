
/*
 * Date: 2019. 03. 15
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요
 * description : 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
 * solution : n=5, m=3일 때, *****
                             *****
                             *****
 */

import java.util.Scanner;

public class StarRectangularShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
