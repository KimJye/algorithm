package array;
/*
 * Date: 2019. 04. 08
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 배열 9 - 달팽이 만들기
 * solution : 2차원 배열 이용하기
 *          f=5
 *  1회전 : [0][0],[0][1],[0][2],[0][3],[0][4] 행 고정, 열 증가
 *          f=4
 *  2회전 : [1][4].[2][4].[3][4],[4][4]        행 증가, 열 고정
 *  3회전 : [4][3],[4][2],[4][1],[4][0]        행 고정, 열 감소
            f=3
 *  4회전 : [3][0],[2][0],[1][0]               행 감소, 열 고정
 *  5회전 : [1][1],[1][2],[1][3]               행 고정, 열 증가
            f=2
 *  6회전 : [2][3],[3][3]                      행 증가, 열 고정
 *  7회전 : [3][2],[3][1]                      행 고정, 열 감소
            f=1
 *  8회전 : [2][1]                             행 감소, 열 고정
 *  9회전 : [2][2]                             행 고정, 열 증가
 *  회전 2번을 돌면 수행 횟수가 1씩 줄어든다. // f--
 *  회전 2번을 돌면 증가->감소->증가->감소->증가 // c*=-1
 *  (행 고정, 열 증가 or 열 감소) and  (행 증가 or 행 감소, 열 고정) 반복문 필요
 */
public class MatrixEx12 {
    public static void main(String[] args){
        int matrix[][] = new int[5][5];
        int num = 1;

        int c=1; //-1일때는 감소, 1일때는 증가
        int i=0; // 행 위치
        int j=-1;// 열 위치.
        int f=matrix.length; // 각 회전의 수행횟수

        while(true){
            for(int k=0; k<f; ++k){
                j+=c;
                matrix[i][j]=num;
                num++;
            }
            f--;
            if(f<=0) break;
            for(int k=0; k<f; ++k){
                i+=c;
                matrix[i][j]=num;
                num++;
            }
            c*=-1;
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
