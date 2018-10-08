package greedy;


/*
 * 내용 : 
 * 0과 1로만 이루어진 행렬 A와 행렬 B가 있다. 
 * 이때, 행렬 A를 행렬 B로 바꾸는데 필요한 연산의 횟수의 최솟값을 구하는 프로그램을 작성하시오.
 * 행렬을 변환하는 연산은 어떤 3*3크기의 부분 행렬에 있는 모든 원소를 뒤집는 것이다. (0 -> 1, 1 -> 0)
 * 입력:
 * 첫째 줄에 행렬의 크기 N M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에는 행렬 A가 주어지고, 그 다음줄부터 N개의 줄에는 행렬 B가 주어진다.
 * 
 */
//swap이 어려움....
import java.util.Scanner;

public class p1080_행렬 {
	
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
