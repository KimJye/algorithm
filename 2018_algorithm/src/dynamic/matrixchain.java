package dynamic;

public class matrixchain {

    static class Matrix {
        int row, col;

        public Matrix(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    static int[][] 최소값저장;

    static int 곱셈횟수최소값(Matrix[] a, int start, int end) throws Exception {
    	 System.out.printf("(%d, %d) ", start, end);
         System.out.println();
    	if (최소값저장 == null) 최소값저장 = new int[a.length][a.length];
        if (최소값저장[start][end] != 0) return 최소값저장[start][end];
        if (start == end) return 0;
       
        int 최소값 = Integer.MAX_VALUE;
        for (int middle = start; middle < end; ++middle) {
        	System.out.printf("middle:");
        	System.out.println(middle);
        	
        	System.out.println("---1번실행---");
        	int 횟수 = 곱셈횟수최소값(a, start, middle);
            
        	System.out.println("---2번실행---");
            횟수 += 곱셈횟수최소값(a, middle + 1, end);
            
            횟수 += a[start].row * a[middle].col * a[end].col;
            System.out.printf("횟수 += a[%d].row * a[%d].col * a[%d].col",start,middle,end);
            System.out.println();
            if (횟수 < 최소값) 최소값 = 횟수;
            System.out.println(최소값);
        }
        System.out.printf("리턴함.최소값저장[%d][%d]",start,end);
        System.out.println();
        return 최소값저장[start][end] = 최소값;
    }

    public static void main(String[] args) throws Exception {
        Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50),
                                    new Matrix(50, 3), new Matrix(3, 8), new Matrix(8, 30) };
        System.out.println(곱셈횟수최소값(a, 0, a.length-1));
    }
}
