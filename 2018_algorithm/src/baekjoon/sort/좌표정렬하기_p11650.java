/*
 * 2018.07.10
 * 2���� ��� ���� �� N���� �־�����. 
 * ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * Comparaotr�� Comparable �ۼ�.
 */
package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ��ǥ�����ϱ�_p11650 {
	
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
		
		Arrays.parallelSort(point, new PointComparator());//comparator�� �����Ҷ�
		
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
