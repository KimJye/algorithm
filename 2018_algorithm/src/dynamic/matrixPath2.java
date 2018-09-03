package dynamic;

public class matrixPath2 {

    static int[][] a = { { 6,  7, 12,  5 },
                         { 5,  3, 11, 18 },
                         { 7, 17,  3,  3 },
                         { 8, 10, 14,  9 } };

    static int[][] sum = new int[4][4];

    static int ����(int row, int col) {
        System.out.printf("����(%d, %d) ", row, col);
        if (sum[row][col] != 0) return sum[row][col];

        for (int r = 0; r < 4; ++r)
            for (int c = 0; c < 4; ++c) {
                int �����ܰ����� = 0;
                if (r == 0 && c == 0) �����ܰ����� = 0;
                else if (r == 0) �����ܰ����� = sum[r][c-1];
                else if (c == 0) �����ܰ����� = sum[r - 1][c];
                else �����ܰ����� = Math.min(sum[r][c - 1], sum[r - 1][c]);
                sum[r][c] = �����ܰ����� + a[r][c];
            }
        return sum[row][col];
    }

    public static void main(String[] args) {
        System.out.println(����(3,3));
    }
}
