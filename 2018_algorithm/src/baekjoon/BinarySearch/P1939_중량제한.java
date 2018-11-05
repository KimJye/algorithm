package BinarySearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 중량이 가능하면 중량 증가하고 중량이 불가능하면 중량을 낮춰본다.
 * 이분탐색, dfs 또는 bfs로 구현.
 * 중량 : 이분탐색으로 구현
 * BFS : 중량을 bfs로 돌려 도착점까지 갈 수 있는지 확인
 * 

			   	 1
		
			(2)		(3)		

		2		(2)		3

1번과 3번 섬은 공장이 있음
 */
//https://www.acmicpc.net/problem/1939
public class P1939_중량제한 {

	static boolean[] visit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//섬 갯수
		int m = sc.nextInt();//다리 개수
		
		int [][]map = new int[n+1][n+1];
		
		for(int i=0; i<m; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if((map[a][b] == 0) || (map[b][a]==0)) {
				map[a][b]= c;
				map[b][a]=c;
			}else {
				if(map[a][b]<=c) {// 더 큰 중량제한으로 바꿈.
					map[a][b]=c;
					map[b][a]=c;
				}
			}
		}
		
		int f1 = sc.nextInt(); //공장1이 위치한 섬
		int f2 = sc.nextInt(); //공장2 위치한 섬
		
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
