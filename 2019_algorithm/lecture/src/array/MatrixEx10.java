package array;

/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 7 - 이등변 삼각형 만들기
 * solution : 2차원 배열 이용하기
 *            여기서는 배열의 열 크기로 4를 입력 받았다고 가정한다.
 *
 *            행 i=3,             열 j=0              행의 시작 s=3-j=3, 행의 끝 e= j+3
 *            행 i=2,3,4,         열 j=1              행의 시작 s=3-j=2, 행의 끝 e= j+3
 *            행 i=1,2,3,4,5      열 j=2              행의 시작 s=3-j=1, 행의 끝 e= j+3
 *            행 i=0,1,2,3,4,5,6, 열 j=3              행의 시작 s=3-j=0, 행의 끝 e= j+3
 */
public class MatrixEx10 {
    public static void main(String[]args){
        int matrix[][] = new int[7][4];

        int num = 1;

        for(int j=0; j<4; ++j){
            int s = 3-j;
            for(int i=s;i<=j+3;++i){
                matrix[i][j] =num;
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
