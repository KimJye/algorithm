package dynamic;

public class matrixPath {

    static int[][] a = { { 6,  7, 12,  5 },
                         { 5,  3, 11, 18 },
                         { 7, 17,  3,  3 },
                         { 8, 10, 14,  9 } };

    static int[][] sum = new int[4][4];

    static int ����(int r, int c) {
        System.out.printf("����(%d, %d) ", r, c);
        System.out.println();
        if (sum[r][c] != 0) return sum[r][c];
        int �����ܰ����� = 0;
        if (r == 0 && c == 0) �����ܰ����� = 0;
        else if (r == 0) �����ܰ����� = ����(r, c-1);
        else if (c == 0) �����ܰ����� = ����(r - 1, c);
        else �����ܰ����� = Math.min(����(r, c - 1), ����(r - 1, c));
        sum[r][c] = �����ܰ����� + a[r][c];
        return sum[r][c];
    }
    
    static boolean �ִܰ�����(int r, int c) {
    	if(r==0&& c==0) {
    		System.out.println("(0,0)");
    		return true;
    	}
    	int �����ܰ����� = sum[r][c] - a[r][c];
    	if((r>0 && sum[r-1][c]==�����ܰ����� && �ִܰ�����(r-1,c))||
    			(c>0 && sum[r][c-1]==�����ܰ����� && �ִܰ�����(r,c-1))) {
    		System.out.printf("(%d,%d)\n",r,c);
    		return true;
    	}
    	return false;
    }

    public static void main(String[] args) {
        System.out.println("�ִܰ�� ����: "+����(3,3));
        System.out.println("\n�ִܰ��:");
         	�ִܰ�����(3,3);
    }
}
