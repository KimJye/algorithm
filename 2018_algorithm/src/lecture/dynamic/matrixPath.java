package dynamic;

public class matrixPath {

    static int[][] a = { { 6,  7, 12,  5 },
                         { 5,  3, 11, 18 },
                         { 7, 17,  3,  3 },
                         { 8, 10, 14,  9 } };

    static int[][] sum = new int[4][4];

    static int 점수(int r, int c) {
        System.out.printf("점수(%d, %d) ", r, c);
        System.out.println();
        if (sum[r][c] != 0) return sum[r][c];
        int 이전단계점수 = 0;
        if (r == 0 && c == 0) 이전단계점수 = 0;
        else if (r == 0) 이전단계점수 = 점수(r, c-1);
        else if (c == 0) 이전단계점수 = 점수(r - 1, c);
        else 이전단계점수 = Math.min(점수(r, c - 1), 점수(r - 1, c));
        sum[r][c] = 이전단계점수 + a[r][c];
        return sum[r][c];
    }
    
    static boolean 최단경로출력(int r, int c) {
    	if(r==0&& c==0) {
    		System.out.println("(0,0)");
    		return true;
    	}
    	int 이전단계점수 = sum[r][c] - a[r][c];
    	if((r>0 && sum[r-1][c]==이전단계점수 && 최단경로출력(r-1,c))||
    			(c>0 && sum[r][c-1]==이전단계점수 && 최단경로출력(r,c-1))) {
    		System.out.printf("(%d,%d)\n",r,c);
    		return true;
    	}
    	return false;
    }

    public static void main(String[] args) {
        System.out.println("최단경로 점수: "+점수(3,3));
        System.out.println("\n최단경로:");
         	최단경로출력(3,3);
    }
}
