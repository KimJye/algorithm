package array;

/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 10 - 대각선으로 채우기
 * solution : 2차원 배열 이용하기
 */
public class MatrixEx13 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        int num = 1;

        int c = 0;

        for (int i = 0; i < 9; ++i) { // 회전 수
            for (int j = 0; j < matrix.length; ++j) { // 행 위치 변수
                c = i - j;

                if (c < 0 || c > 4) {
                    continue;
                }
                matrix[j][c] = num;
                num++;
            }
        }
        // 출력
        for (int l = 0; l < matrix.length; ++l) {
            for (int k = 0; k < matrix[l].length; ++k) {
                System.out.print(matrix[l][k] + " ");
            }
            System.out.println();
        }
    }
}
