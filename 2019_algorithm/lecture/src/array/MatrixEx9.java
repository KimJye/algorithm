package array;

/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 6 - 오른쪽에 빈 삼각형 만들기
 * solution : 2차원 배열 이용하기
 *            배열의 크기는 홀수로만 입력가능하고 여기서는 배열의 크기로 7을 입력 받았다고 가정한다.
 *
 *            행 i=0, 열 j=0,1,2,3,4,5,6 열의 시작 s=0, 열의 끝 e= 길이-1 = 6
 *            행 i=1, 열 j=0,1,2,3,4,5   열의 시작 s=0, 열의 끝 e= 길이-1-i=5
 *            행 i=2, 열 j=0,1,2,3,4     열의 시작 s=0, 열의 끝 e= 길이-1-i=4
 *            행 i=3, 열 j=0,1,2,3       열의 시작 s=0, 열의 끝 e=i=3
 *            행 i=4, 열 j=0,1,2,3,4     열의 시작 s=0, 열의 끝 e=i=4
 *            행 i=5, 열 j=0,1,2,3,4,5   열의 시작 s=0, 열의 끝 e=i=5
 *            행 i=6, 열 j=0,1,2,3,4,5,6 열의 시작 s=0, 열의 끝 e=i=6
 */
public class MatrixEx9 {
    public static void main(String[] args) {
        int matrix[][] = new int[7][7];

        int num = 1;
        int s = 0;

        for (int i = 0; i < matrix.length; ++i) {
            int e = matrix.length - 1;
            if (i >= 3) {
                e = i;
            } else {
                e -= i;
            }
            for (int j = s; j <= e; ++j) {
                matrix[i][j] = num;
                num++;
            }
        }
        // 출력
        for (int i = 0; i < matrix.length; ++i) {
            for (int k = 0; k < matrix[i].length; ++k) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }
}
