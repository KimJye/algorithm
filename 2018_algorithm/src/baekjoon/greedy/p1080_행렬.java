package greedy;


/*
 * ���� : 
 * 0�� 1�θ� �̷���� ��� A�� ��� B�� �ִ�. 
 * �̶�, ��� A�� ��� B�� �ٲٴµ� �ʿ��� ������ Ƚ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����� ��ȯ�ϴ� ������ � 3*3ũ���� �κ� ��Ŀ� �ִ� ��� ���Ҹ� ������ ���̴�. (0 -> 1, 1 -> 0)
 * �Է�:
 * ù° �ٿ� ����� ũ�� N M�� �־�����. N�� M�� 50���� �۰ų� ���� �ڿ����̴�.
 * ��° �ٺ��� N���� �ٿ��� ��� A�� �־�����, �� �����ٺ��� N���� �ٿ��� ��� B�� �־�����.
 * 
 */
//swap�� �����....
import java.util.Scanner;

public class p1080_��� {
	
	static int a[][];
	static int b[][];
	
	static void swap(int x, int y) {
		for(int i=x-1; i<=x+1; ++i) {
			for(int j=y-1; j<=y+1; ++j) {
				 a[i][j]= 1- a[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		input.nextLine();
		
		a = new int[n][m];
		b = new int[n][m];
		
		String str;
		for(int i=0; i<n; ++i) {
			str = input.nextLine();
			for(int j=0; j<m; ++j) {
				a[i][j] = str.charAt(j)-'0';
			}
		}
		for(int i=0; i<n; ++i) {
			str = input.nextLine();
			for(int j=0; j<m; ++j) {
				b[i][j] = str.charAt(j)-'0';
			}
		}
		int count =0;
		
		for(int i=0; i<n-2; ++i) {
			for(int j=0; j<m-2; ++j) {
				if(a[i][j] !=b[i][j]) {
					count++;
					swap(i+1,j+1);
				}
			}
		}
		for(int i=0; i<n; ++i) {
			for(int j=0; j<m; ++j) {
				if(a[i][j] !=b[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(count);
		input.close();
	}
}
