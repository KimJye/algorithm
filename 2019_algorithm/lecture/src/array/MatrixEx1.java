package array;

/*
 * Date: 2019. 04. 05
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 1 - 기본 5행 5열
 * description : 5행 5열의 배열에 1부터 25까지 순서대로 대입하라.

 * solution : 2차원 배열 이용하기
 */
public class MatrixEx1 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int  num=1;

        for(int i=0; i<matrix.length; ++i){
            for(int j=0; j<matrix[i].length; ++j){
                matrix[i][j]=num;
                num++;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
