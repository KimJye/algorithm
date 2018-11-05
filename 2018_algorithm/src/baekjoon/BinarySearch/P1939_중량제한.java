package BinarySearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * �߷��� �����ϸ� �߷� �����ϰ� �߷��� �Ұ����ϸ� �߷��� ���纻��.
 * �̺�Ž��, dfs �Ǵ� bfs�� ����.
 * �߷� : �̺�Ž������ ����
 * BFS : �߷��� bfs�� ���� ���������� �� �� �ִ��� Ȯ��
 * 

			   	 1
		
			(2)		(3)		

		2		(2)		3

1���� 3�� ���� ������ ����
 */
//https://www.acmicpc.net/problem/1939
public class P1939_�߷����� {

	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//�� ����
		int m = sc.nextInt();//�ٸ� ����
		
		int [][]map = new int[n+1][n+1];
		
		for(int i=0; i<m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if((map[a][b] == 0) || (map[b][a]==0)) {
				map[a][b]= c;
				map[b][a]=c;
			}else {
				if(map[a][b]<=c) {// �� ū �߷��������� �ٲ�.
					map[a][b]=c;
					map[b][a]=c;
				}
			}
		}
		
		int f1 = sc.nextInt(); //����1�� ��ġ�� ��
		int f2 = sc.nextInt(); //����2 ��ġ�� ��
		
		//bfs
		Queue<Integer> queue = new LinkedList<Integer>();
		HashMap<Integer,Boolean> hash = new HashMap<Integer,Boolean>();
		
		queue.offer(1);
		
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			visit[temp] =true;
			
			for(int i=0; i<n; ++i) {
				if(map[temp][i]==1 && visit[i]==false) {
					if(!hash.containsKey(i)) {
						queue.offer(i);
						hash.put(i,true);
					}
				}
			}
		}
	}

}
class Island{
	int a,b;
	public Island(int a, int b) {
		this.a=a;
		this.b=b;
	}
}
