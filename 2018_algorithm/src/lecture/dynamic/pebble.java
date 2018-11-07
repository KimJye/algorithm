package dynamic;

public class pebble {

	static int[][] a = {
			{  6,  7, 12}, //-5, 5,  3, 11, 3 },
			{ -8, 10, 14},  //9, 7, 13,  8, 5 },
			{ 11, 12, 7 }};// 4, 8, -2,  9, 4 }};

	static int[][] 경로점수 = new int[4][5];

	static boolean 인접가능패턴(int 패턴1, int 패턴2) {

		System.out.printf("인접가능패턴(%d, %d)",패턴1, 패턴2);
		System.out.println();
		if (패턴1 == 패턴2) return false; // 동일한 패턴은 인접할 수 없다.
		int[][] patterns = { {1, 4}, {3, 4}, {4, 1}, {4, 3} }; // 인접할 수 없는 패턴
		for (int i = 0; i < patterns.length; ++i)
			if (패턴1 == patterns[i][0] && 패턴2 == patterns[i][1])
				return false;
		return true;
	}

	static int 열_점수(int c, int p) throws Exception {

		System.out.printf("열점수(%d,%d)",c, p);
		System.out.println();
		switch (p) {
		case 1: return a[0][c]; // 패턴1
		case 2: return a[1][c]; // 패턴2
		case 3: return a[2][c]; // 패턴3
		case 4: return a[0][c] + a[2][c]; // 패턴4
		}
		throw new Exception("invalid p:" + p);
	}
	static int 호출횟수 = 0;

	static int 전체_점수(int c, int p) throws Exception {
		System.out.printf("전체 점수( %d,%d)",c, p);
		System.out.println();

		if (경로점수[c][p]!= 0) return 경로점수[c][p];
		++호출횟수;
		System.out.println(호출횟수);
		if(c==0) return 경로점수[c][p]=열_점수(c,p);
		int 이전열_최고점수 = Integer.MIN_VALUE;
		for (int q = 1; q <= 4; ++q) { // q는 c-1 열의 패턴
			if (인접가능패턴(p, q)) {
				int 점수 = 전체_점수(c - 1, q);
				if (점수 > 이전열_최고점수) 이전열_최고점수 = 점수;
			}
		}
		System.out.printf("이전열_최고점수 %d + 열점수%d열, %d 패턴",이전열_최고점수,c,p);
		System.out.println();
		return 경로점수[c][p]=(이전열_최고점수 + 열_점수(c, p));
	}

	static int 전체_점수(int c) throws Exception {
		System.out.printf("전체 점수 (%d)",c);
		System.out.println();
		int 최고점수 = Integer.MIN_VALUE;
		for (int p = 1; p <= 4; ++p) {
			int 점수 = 전체_점수(c, p);
			if (점수 > 최고점수) 최고점수 = 점수;
		}
		return 최고점수;
	}

	static boolean 조약돌_출력(int c, int 점수) throws Exception {  
		String[] s = { "", "*", "  *", "    *", "*   *" };        
		for (int p = 1; p <= 4; ++p)       
			if (경로점수[c][p] == 점수 && (c == 0 || 조약돌_출력(c - 1, 점수 - 열_점수(c, p)))) {
				System.out.printf("열:%d  패턴:%d  조약돌:%s\n", c, p, s[p]);
				return true;        
			}
		return false;  
	} 

	public static void main(String[] args) throws Exception {
		System.out.printf("경로점수=%d\n",전체_점수(2));
		System.out.printf("호출점수=%d\n",호출횟수);
		System.out.println();        
		조약돌_출력(2, 전체_점수(2));

	}
}
