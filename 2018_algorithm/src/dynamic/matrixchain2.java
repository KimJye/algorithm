package dynamic;

public class matrixchain2 {

	static class Matrix {
		int row, col;

		public Matrix(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static int[][] 최소값저장;
	static int[][] middle저장; 

	static int 곱셈횟수최소값(Matrix[] a) {
		최소값저장 = new int[a.length][a.length];
		middle저장 = new int[a.length][a.length]; 

		for (int distance = 1; distance < a.length; ++distance)
			for (int start = 0; start < a.length - distance; ++start) {
				int end = start + distance;
				최소값저장[start][end] = Integer.MAX_VALUE;
				for (int middle = start; middle < end; ++middle) {
					int 횟수 = 최소값저장[start][middle];
					횟수 += 최소값저장[middle + 1][end];
					횟수 += a[start].row * a[middle].col * a[end].col;
					if (횟수 < 최소값저장[start][end]) {
						최소값저장[start][end] = 횟수;
						middle저장[start][end] = middle;

					}
				}
			}
		return 최소값저장[0][a.length-1];
	}

	static String 곱셈순서(Matrix[] a, int start, int end) {   
		int middle = middle저장[start][end];   
		if (start == end) return String.format("행렬(%d,%d)", a[start].row, a[start].col);   
		return String.format("( %s * %s )",             
				곱셈순서(a, start, middle), 곱셈순서(a, middle + 1, end));    
	}

	public static void main(String[] args) {
		Matrix[] a = new Matrix[] { new Matrix(10, 100), new Matrix(100, 5), new Matrix(5, 50),
				new Matrix(50, 3), new Matrix(3, 8), new Matrix(8, 30) };
		System.out.println(곱셈횟수최소값(a));
		 System.out.println(곱셈순서(a, 0, a.length-1)); 

	}
}
