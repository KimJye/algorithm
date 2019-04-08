package array;
/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 5- 모래시계 만들기
 * solution : 2차원 배열 이용하기
 *            행 i=0, 열 j=0,1,2,3,4 열의 시작 s=0, 열의 끝 e=4
 *            행 i=1, 열 j=1,2,3     열의 시작 s=1, 열의 끝 e=3
 *            행 i=2, 열 j=2         열의 시작 s=2, 열의 끝 e=2
 *            행 i=3, 열 j=1,2,3     열의 시작 s=1, 열의 끝 e=3
 *            행 i=4, 열 j=0,1,2,3,4 열의 시작 s=0, 열의 끝 e=4
 */
public class MatrixEx8 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int num=1;
        int s=0;
        int e=matrix.length-1;

        for(int i=0; i<matrix.length; ++i){
            for(int j=s;j<=e; ++j){
                matrix[i][j]=num;
                num++;
            }
            if(i>=2){
                s--;
                e++;
            }else{
                s++;
                e--;
            }
        }
        // 출력
        for (int i = 0; i < matrix.length; ++i) {
            for (int k = 0; k < matrix[i].length; ++k) {
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }
    }
}
