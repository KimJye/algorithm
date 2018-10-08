package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.io.*;
//끝나는 시간 기준으로 오름차순 진행. 만약에 같다면 시작시간 빠른거 기준으로.
/*
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의들에 대하여 회의실 사용표를 만들려고 한다. 
 * 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라. 
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
 *  회의의 시작시간과 끝나는 시간이 같을 수도 있다.
 *   이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 */
public class 회의실배정_p1931 {


	static class Point{ //Point
		public int x,y;

		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
	
	}
	
	static class PointComparator implements Comparator<Point>{ //Comparator
		public int compare(Point p1, Point p2) {
			if(p1.y > p2.y) {
				return 1;
			}else if(p1.y == p2.y) {
				if(p1.x < p2.x) return -1;
				else return 0;
			}
			return -1;
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		Point [] p = new Point[num];
		
		for(int i=0; i<num; ++i) {
			String temp [] = bf.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			p[i] =new Point(x,y);
		}
		
		Arrays.parallelSort(p, new PointComparator());//comparator로 정렬할때 . parallerSort가 merge라 thread방식이라 효율적임.
		
		System.out.println(result(p));
		
		bf.close();
	}
	static int result(Point[] arr) {
		int count = 0;
		int now = 0;
		
		for(int i=0; i<arr.length; ++i) {
			if(arr[i].x>=now) {
				now = arr[i].y;
				count++;
			}
		}
		return count;
	}
	
}