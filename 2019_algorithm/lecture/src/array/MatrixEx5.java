package array;

/*
 * Date: 2019. 04. 05
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 2 - 직각 삼각형 만들기
 * description : 왼쪽 직각 삼각형 오른쪽부터 채우기
 *               5행 5열의 배열에 기억시키시오.

 * solution : 2차원 배열 이용하기
 */
public class MatrixEx5 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int num=1;
        for(int i=0; i<matrix.length; ++i){
            for(int j=i; j>=0; --j){
                matrix[i][j]=num;
                num++;
            }
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
