package greedy;
/*
 * ���� ī��� ���� �ϳ��� ������ �ִ� ī���̴�. ����̴� ���� ī�� N���� ������ �ִ�. 
 * ���� M���� �־����� ��, �� ���ڰ� �����ִ� ���� ī�带 ����̰� ������ �ִ��� �ƴ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �̺�Ž�� ���
 */
//�Ȱ��� �ؔf�µ� �ð��ʰ��䤻������������������������������
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p10815_����ī�� {

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

		int n = Integer.parseInt(bf.readLine()); //����̰� �������ִ� ����
		String [] array = bf.readLine().split(" ");
		int [] a = new int [n];

		for (int i=0; i<n; i++) { 
			a[i] = Integer.valueOf(array[i]); 
		} 
		
		Arrays.sort(a);// for binary_search
		
		int m = Integer.valueOf(bf.readLine()); // ����̰� ������ �ִ� �������� �ƴ��� Ȯ���ϴ� ����
		array = bf.readLine().split(" ");
		
		StringBuilder builder = new StringBuilder(); //������ ���

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




