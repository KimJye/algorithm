package array;

/*
 * Date: 2019. 04. 05
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 2 - 직각 삼각형 만들기
 * description : 왼쪽 직각 삼각형 만들기
 *               5행 5열의 배열에 기억시키시오.

 * solution : 2차원 배열 이용하기
 */
public class MatrixEx3 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int num=1;
        int count = 1;
        for(int i=0; i<matrix.length; ++i){
            for(int j=0; j<count; ++j){
                matrix[i][j]=num;
                num++;
                System.out.print(matrix[i][j]+" ");
            }
            count++;
            System.out.println();
        }

    }
}
