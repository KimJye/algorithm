/*
 * A�� P�� �־����� ��, ������ ���� ������ ���� �� �ִ�.
 * D[1]=A
 * D[n] = D[n-1]�� �� �ڸ� ���ڸ� P�� ���� ���� ��
 * A=57, P=2�� ���
 * D[1] = 57
 * D[2]= 5*5 +7*7 = 74
 * D[3]= 7*7 +4*4 = 65
 * D[4]= 6*6 +5*5 = 61
 * ����ؼ� ���� ����ٰ� ������ ������� ���� ����� �� ���� �� ��°�� ������� ������ �����ϸ� �ȴ�.
 * int length(int a, int p, int cnt) {
 *  if (check[a] != 0) {
 *   return check[a]-1; 
 *   }
 *   check[a] = cnt; 
 *   int b = next(a, p);
 *    return length(b, p, cnt+1); 
 *    }
 * https://gist.github.com/Baekjoon/a8f0c8b8e92994f9b68cbf526136593f
 */
package baekjoon.graph;

public class �ݺ�����_p2331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
