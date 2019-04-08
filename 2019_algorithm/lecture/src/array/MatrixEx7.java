package array;

/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 4 - 다이아몬드 만들기
 * solution : 2차원 배열 이용하기
 *            행 i=0, 열 j=2,        열의 시작 s=2, 열의 끝 e=2
 *            행 i=1, 열 j=1,2,3     열의 시작 s=1, 열의 끝 e=3
 *            행 i=2, 열 j=0,1,2,3,4 열의 시작 s=0, 열의 끝 e=4
 *            행 i=3, 열 j=1,2,3     열의 시작 s=1, 열의 끝 e=3
 *            행 i=4, 열 j=2         열의 시작 s=2, 열의 끝 e=2
 *
 */
public class MatrixEx7 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int num=1;
        int j=0;
        int s=2;
        int e=2;

        for(int i=0; i<matrix.length; ++i){
            for(j=s;j<=e; ++j){
                matrix[i][j]=num;
                num++;
            }
            if(i>=2){
                e--;
                s++;
            }else{
                e++;
                s--;
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
