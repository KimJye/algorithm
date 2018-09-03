/*
 * ��ǥ�����ϱ� �������� Ŭ����
 * Comparable ����.
 */
package baekjoon.sort;

public class Point implements Comparable<Point> {
	int x, y ; // x, y ��ǥ
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(Point point) {
		if(this.x<point.x) {
			return -1;
		}else if(this.x== point.x) {
			if(this.y<point.y) {
				return -1;
			}else if(this.y == point.y) {
				return 0;
			}else {
				return 1;
			}
		}else {
			return 1;
		}
	}
}

