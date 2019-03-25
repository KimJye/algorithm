package array;

/*
 * Date: 2019. 03. 25
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10039
 * Title : 평균 점수
 * description : 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.
                 어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다.
                 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다.
                 하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
                 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.

                 입력 : 입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
                        점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.

                 출력 : 첫째 줄에 학생 5명의 평균 점수를 출력한다.

 * solution : 1차원 배열 문제
 * 풀이과정 : v1과 효율성 별차이 없다.

 */

import java.util.Scanner;

public class P10039v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int score;
        int sum=0;

        while (num-- > 0) {
            score = sc.nextInt();
            if (score < 40) {
                sum += 40;
            } else {
                sum += score;
             }
        }
        sc.close();
        System.out.println(sum / 5);
    }
}
