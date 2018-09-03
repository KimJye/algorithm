/*
 * 2018.07.11
 * ��ǥ �����ϱ� 2
 * 2���� ��� ���� �� N���� �־�����. 
 * ��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
package baekjoon.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ��ǥ�����ϱ�2_p11651 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		Point [] point = new Point[n];
		
		for(int i=0; i<n; ++i) {
			String temp [] = bf.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			point[i] = new Point(x,y);
		}
		
		//Arrays.sort(point); //comparable�� �����Ҷ�
		
		Arrays.sort(point, new Comparator<Point>() {
			public int compare(Point p1, Point p2) {
				int r = p1.y - p2.y;
				if(r!=0) return r;
				return p1.x-p2.x;
				/*
				if(p1.y <p2.y) {
					return -1;
				}else if(p1.y == p2.y) {
					if(p1.x<p2.x) {
						return -1;
					}else if(p1.x ==p2.x) {
						return 0;
					}else {
						return 1;
					}
				}else {
					return 1;
				}
				*/
			}
		});
		
		StringJoiner sj = new StringJoiner(" ");
		
		//sj.add(" "); StringJoiner���� �����ڰ� ���� �� ���� ���ڼ��̴�!
		
		for(Point p : point) {
			sj.add(String.valueOf(p.x));
			sj.add(String.valueOf(p.y));
			sj.add("\n");
		}
		
		System.out.println(sj.toString());
		
	}
}
