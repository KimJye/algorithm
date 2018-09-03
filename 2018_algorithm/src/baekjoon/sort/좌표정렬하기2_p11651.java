/*
 * 2018.07.11
 * 좌표 정렬하기 2
 * 2차원 평면 위의 점 N개가 주어진다. 
 * 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */
package baekjoon.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class 좌표정렬하기2_p11651 {
	
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
		
		//sj.add(" "); StringJoiner에서 구분자가 먼저 그 다음 문자순이다!
		
		for(Point p : point) {
			sj.add(String.valueOf(p.x));
			sj.add(String.valueOf(p.y));
			sj.add("\n");
		}
		
		System.out.println(sj.toString());
		
	}
}
