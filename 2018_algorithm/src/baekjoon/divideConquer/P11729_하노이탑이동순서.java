package divideConquer;

import java.util.Scanner;

/*
 * 1~N ������ 1������ 3������ �ű�� ���ؼ�
 1~N-1 ������ 1������ 2������ �ű�
 N ������ 1������ 3������ �ű�
 1~N-1 ������ 2������ 3������ �ű�
 ��͹���.
 */
public class P11729_�ϳ���ž�̵����� {

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
