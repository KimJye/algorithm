package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringJoiner;
import java.io.*;
//������ �ð� �������� �������� ����. ���࿡ ���ٸ� ���۽ð� ������ ��������.
/*
 * �� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǵ鿡 ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�. 
 * �� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� �ִ���� ȸ�Ǹ� ã�ƶ�. 
 * ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�.
 *  ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�.
 *   �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.
 */
public class ȸ�ǽǹ���_p1931 {


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
		
		Arrays.parallelSort(p, new PointComparator());//comparator�� �����Ҷ� . parallerSort�� merge�� thread����̶� ȿ������.
		
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