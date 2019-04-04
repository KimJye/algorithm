package sort;

import java.util.Scanner;

/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 바로 출력하기
 * description : 10명 학생의 국어,수학 점수를 각각 입력 받아 총점을 계산한 후
                 총점 기준 내림차순으로 순위를 출력하라.
                 단, 동점은 동석차로 하고 총점이 0인 경우는 출력하지 않는다.

                 출력 : 각 학생의 국어점수, 수학점수, 합계, 순위를 출력하시오.

 * 플로차트 : KUK[10] // 국어 점수
              MAT[10] // 수학 점수
              HAP[10] // 총점
 */
public class RankEx2 {

    static void solution(int[] k, int[] m, int[] h) {
        int cnt;

        for (int i = 0; i < h.length; ++i) {
            if (h[i] != 0) {
                cnt = 1;
                for (int j = 0; j < h.length; ++j) {
                    if (h[i] < h[j]) {
                        cnt++;
                    }
                }
                System.out.println((i + 1) + " " +  k[i] + " " + m[i] + " " + h[i] +" " + cnt);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] KUK = new int[3];
        int[] MAT = new int[3];
        int[] HAP = new int[3];

        for (int i = 0; i < 3; ++i) {
            KUK[i] = sc.nextInt();
            MAT[i] = sc.nextInt();
            HAP[i] = KUK[i] + MAT[i];
        }

        sc.close();
        solution(KUK, MAT, HAP);
    }
}
