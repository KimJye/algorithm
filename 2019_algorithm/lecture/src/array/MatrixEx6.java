package array;

/*
 * Date: 2019. 04. 05
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 3 -'ㄹ'자로 채우기
 * description :

 * solution : 2차원 배열 이용하기
 */
public class MatrixEx6 {
    public static void main(String[] args){
        int matrix [][] = new int[5][5];

        int num=1;
        int left=0;
        int right=matrix.length-1;
        int n=1;
        int t=0;

        for(int i=0; i<matrix.length; ++i){
            for(int j=left; j!=right+n; j+=n){
                matrix[i][j]=num;
                num++;
            }
            t=left;
            left=right;
            right=t;
            n*=-1;
        }
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
