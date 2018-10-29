package divideConquer;

import java.util.Scanner;

/*
 * 1~N 원판을 1번에서 3번으로 옮기기 위해서
 1~N-1 원판을 1번에서 2번으로 옮김
 N 원판을 1번에서 3번으로 옮김
 1~N-1 원판을 2번에서 3번으로 옮김
 재귀문제.
 */
public class P11729_하노이탑이동순서 {

	 public static void solve(int n, int x, int y, StringBuilder sb) {

	        if (n == 0) return;

	        solve(n-1, x, 6-x-y, sb);

	        sb.append(x + " " + y + "\n");

	        solve(n-1, 6-x-y,y, sb);

	    }

	    public static void main(String args[]) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        System.out.println((1<<n)-1);

	        StringBuilder sb = new StringBuilder();

	        solve(n, 1, 3, sb);

	        System.out.println(sb);

	    }

}
