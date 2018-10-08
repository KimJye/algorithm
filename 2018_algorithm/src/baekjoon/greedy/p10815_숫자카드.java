package greedy;
/*
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 
 * 숫자 M개가 주어졌을 때, 이 숫자가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 * 이분탐색 사용
 */
//똑같이 해봣는데 시간초과뜸ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p10815_숫자카드 {

	public static boolean binary_search(int [] a, int num) {
		int len = a.length;
		int x=0;
		int y=len-1;
		
		while(x<=y) {
			int mid = (x+y)/2;
			if(a[mid]==num) {
				return true;
			}else if(a[mid]>num) {
				x = mid-1;
			}else {
				y=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); //상근이가 가지고있는 수들
		String [] array = bf.readLine().split(" ");
		int [] a = new int [n];

		for (int i=0; i<n; i++) { 
			a[i] = Integer.valueOf(array[i]); 
		} 
		
		Arrays.sort(a);// for binary_search
		
		int m = Integer.valueOf(bf.readLine()); // 상근이가 가지고 있는 숫자인지 아닌지 확인하는 수들
		array = bf.readLine().split(" ");
		
		StringBuilder builder = new StringBuilder(); //여러개 출력

		for(int i=0; i<m; ++i) {
			int num = Integer.valueOf(array[i]);

			boolean check = binary_search(a,num);

			if(check) {
				builder.append("1");
			}else {
				builder.append("0");
			}
		}
		System.out.println(builder);

	}

}




