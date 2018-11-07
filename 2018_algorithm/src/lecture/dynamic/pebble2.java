package dynamic;

public class  pebble2 {

    static int[][] a = {
            {  6,  7, 12, -5, 5,  3, 11, 3 },
            { -8, 10, 14,  9, 7, 13,  8, 5 },
            { 11, 12,  7,  4, 8, -2,  9, 4 }};

    static int[][] 경로점수 = new int[8][5];

    static boolean 인접가능패턴(int 패턴1, int 패턴2) {
        if (패턴1 == 패턴2) return false; // 동일한 패턴은 인접할 수 없다.
        int[][] patterns = { {1, 4}, {3, 4}, {4, 1}, {4, 3} }; // 인접할 수 없는 패턴
        for (int i = 0; i < patterns.length; ++i)
            if (패턴1 == patterns[i][0] && 패턴2 == patterns[i][1])
                return false;
        return true;
    }

    static int 열_점수(int c, int p) throws Exception {
        switch (p) {
        case 1: return a[0][c]; // 패턴1
        case 2: return a[1][c]; // 패턴2
        case 3: return a[2][c]; // 패턴3
        case 4: return a[0][c] + a[2][c]; // 패턴4
        }
        throw new Exception("invalid p:" + p);
    }

    // 경로점수 2차원 배열의 0..col 컬럼까지 계산 결과 채우기
    static void 전체_점수_계산(int col) throws Exception {
        for (int c = 0; c <= col; ++c) {
            for (int p = 1; p <= 4; ++p) {
                if (c == 0) 경로점수[c][p] = 열_점수(c, p);
                else {
                    int 이전열_최고점수 = Integer.MIN_VALUE;
                    for (int q = 1; q <= 4; ++q) // q는 c-1 열의 패턴
                        if (인접가능패턴(p, q)) {
                            int 점수 = 경로점수[c - 1][q];
                            if (점수 > 이전열_최고점수) 이전열_최고점수 = 점수;
                        }
                    경로점수[c][p] = (이전열_최고점수 + 열_점수(c, p));
                }
            }
        }
    }

    // col 컬럼의 경로 점수 최고점 리턴하기
    static int 전체_점수(int col) throws Exception {
        전체_점수_계산(col);
        int 최고점수 = Integer.MIN_VALUE;
        for (int p = 1; p <= 4; ++p) {
            int 점수 = 경로점수[col][p];
            if (점수 > 최고점수) 최고점수 = 점수;
        }
        return 최고점수;
    }

    public static void main(String[] args) throws Exception {
        System.out.printf("경로점수=%d\n", 전체_점수(7));
    }
}
