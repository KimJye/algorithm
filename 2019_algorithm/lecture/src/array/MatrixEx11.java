package array;
/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 8 - 90도 회전하기
 * solution : 2차원 배열 이용하기
 *            입력된 배열A를 90도 회전한 결과를 다른 배열B에 이동하라.
 *
 *            배열 A
 *            행 i=4        열 j=4            열의 시작 s=i, 열의 끝 e= 길이-1
 *            행 i=3        열 j=3,4          열의 시작 s=i, 열의 끝 e= 길이-1
 *            행 i=2        열 j=2,3,4        열의 시작 s=i, 열의 끝 e= 길이-1
 *            행 i=1        열 j=1,2,3,4      열의 시작 s=i, 열의 끝 e= 길이-1
 *            행 i=0        열 j=0,1,2,3,4    열의 시작 s=i, 열의 끝 e= 길이-1
 */
public class MatrixEx11 {
    public static void main(String[]args){
        int A[][] = new int[5][5];

        int num = 1;

        // A입력
        for(int i=A.length-1; i>=0; --i){
            for(int j=i; j<=A.length-1; ++j){
                A[i][j]=num;
                num++;
            }
        }
        /*
        // A 출력
        for (int i = 0; i < A.length; ++i) {
            for (int k = 0; k < A[i].length; ++k) {
                System.out.print(A[i][k] + " ");
            }
            System.out.println();
        }
        */

        // 90도 회전하기
        int B [][] = new int[5][5];

        for(int i=0; i<B.length; ++i){
            for(int j=0;j<B.length;++j){
                B[j][4-i]=A[i][j];
            }
        }
        // B 출력
        for (int i = 0; i < B.length; ++i) {
            for (int k = 0; k < B[i].length; ++k) {
                System.out.print(B[i][k] + " ");
            }
            System.out.println();
        }
    }
}
