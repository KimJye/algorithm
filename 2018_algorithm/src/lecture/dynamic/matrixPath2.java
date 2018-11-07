package dynamic;

public class matrixPath2 {

    static int[][] a = { { 6,  7, 12,  5 },
                         { 5,  3, 11, 18 },
                         { 7, 17,  3,  3 },
                         { 8, 10, 14,  9 } };

    static int[][] sum = new int[4][4];

    static int 점수(int row, int col) {
        System.out.printf("점수(%d, %d) ", row, col);
        if (sum[row][col] != 0) return sum[row][col];

        for (int r = 0; r < 4; ++r)
            for (int c = 0; c < 4; ++c) {
                int 이전단계점수 = 0;
                if (r == 0 && c == 0) 이전단계점수 = 0;
                else if (r == 0) 이전단계점수 = sum[r][c-1];
                else if (c == 0) 이전단계점수 = sum[r - 1][c];
                else 이전단계점수 = Math.min(sum[r][c - 1], sum[r - 1][c]);
                sum[r][c] = 이전단계점수 + a[r][c];
            }
        return sum[row][col];
    }

    public static void main(String[] args) {
        System.out.println(점수(3,3));
    }
}
