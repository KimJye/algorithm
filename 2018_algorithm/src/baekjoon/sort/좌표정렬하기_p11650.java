/*
 * 2018.07.10
 * 2차원 평면 위의 점 N개가 주어진다. 
 * 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * Comparaotr나 Comparable 작성.
 */
package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class 좌표정렬하기_p11650 {
	
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
		
		//Arrays.sort(point); //comparable로 정렬할때
		
		Arrays.parallelSort(point, new PointComparator());//comparator로 정렬할때
		
		StringJoiner sj = new StringJoiner(" ");
		
		//sj.add(" "); StringJoiner에서 구분자가 먼저 그 다음 문자순이다!
		
		for(Point p : point) {
			sj.add(String.valueOf(p.x));
			sj.add(String.valueOf(p.y));
			sj.add("\n");
		}
		
		System.out.println(sj.toString());
		
	}
}
