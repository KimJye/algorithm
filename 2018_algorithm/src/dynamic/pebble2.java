package dynamic;

public class  pebble2 {

    static int[][] a = {
            {  6,  7, 12, -5, 5,  3, 11, 3 },
            { -8, 10, 14,  9, 7, 13,  8, 5 },
            { 11, 12,  7,  4, 8, -2,  9, 4 }};

    static int[][] ������� = new int[8][5];

    static boolean ������������(int ����1, int ����2) {
        if (����1 == ����2) return false; // ������ ������ ������ �� ����.
        int[][] patterns = { {1, 4}, {3, 4}, {4, 1}, {4, 3} }; // ������ �� ���� ����
        for (int i = 0; i < patterns.length; ++i)
            if (����1 == patterns[i][0] && ����2 == patterns[i][1])
                return false;
        return true;
    }

    static int ��_����(int c, int p) throws Exception {
        switch (p) {
        case 1: return a[0][c]; // ����1
        case 2: return a[1][c]; // ����2
        case 3: return a[2][c]; // ����3
        case 4: return a[0][c] + a[2][c]; // ����4
        }
        throw new Exception("invalid p:" + p);
    }

    // ������� 2���� �迭�� 0..col �÷����� ��� ��� ä���
    static void ��ü_����_���(int col) throws Exception {
        for (int c = 0; c <= col; ++c) {
            for (int p = 1; p <= 4; ++p) {
                if (c == 0) �������[c][p] = ��_����(c, p);
                else {
                    int ������_�ְ����� = Integer.MIN_VALUE;
                    for (int q = 1; q <= 4; ++q) // q�� c-1 ���� ����
                        if (������������(p, q)) {
                            int ���� = �������[c - 1][q];
                            if (���� > ������_�ְ�����) ������_�ְ����� = ����;
                        }
                    �������[c][p] = (������_�ְ����� + ��_����(c, p));
                }
            }
        }
    }

    // col �÷��� ��� ���� �ְ��� �����ϱ�
    static int ��ü_����(int col) throws Exception {
        ��ü_����_���(col);
        int �ְ����� = Integer.MIN_VALUE;
        for (int p = 1; p <= 4; ++p) {
            int ���� = �������[col][p];
            if (���� > �ְ�����) �ְ����� = ����;
        }
        return �ְ�����;
    }

    public static void main(String[] args) throws Exception {
        System.out.printf("�������=%d\n", ��ü_����(7));
    }
}
