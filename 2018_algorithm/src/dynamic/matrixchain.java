package dynamic;

public class matrixchain {

    static class Matrix {
        int row, col;

        public Matrix(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static int[][] �ּҰ�����;

    static int ����Ƚ���ּҰ�(Matrix[] a, int start, int end) throws Exception {
    	 System.out.printf("(%d, %d) ", start, end);
         System.out.println();
    	if (�ּҰ����� == null) �ּҰ����� = new int[a.length][a.length];
        if (�ּҰ�����[start][end] != 0) return �ּҰ�����[start][end];
        if (start == end) return 0;
       
        int �ּҰ� = Integer.MAX_VALUE;
        for (int middle = start; middle < end; ++middle) {
        	System.out.printf("middle:");
        	System.out.println(middle);
        	
        	System.out.println("---1������---");
        	int Ƚ�� = ����Ƚ���ּҰ�(a, start, middle);
            
        	System.out.println("---2������---");
            Ƚ�� += ����Ƚ���ּҰ�(a, middle + 1, end);
            
            Ƚ�� += a[start].row * a[middle].col * a[end].col;
            System.out.printf("Ƚ�� += a[%d].row * a[%d].col * a[%d].col",start,middle,end);
            System.out.println();
            if (Ƚ�� < �ּҰ�) �ּҰ� = Ƚ��;
            System.out.println(�ּҰ�);
        }
        System.out.printf("������.�ּҰ�����[%d][%d]",start,end);
        System.out.println();
        return �ּҰ�����[start][end] = �ּҰ�;
    }

    public static void main(String[] args) throws Exception {
        Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50),
                                    new Matrix(50, 3), new Matrix(3, 8), new Matrix(8, 30) };
        System.out.println(����Ƚ���ּҰ�(a, 0, a.length-1));
    }
}
