/*
 * 그래프로 트리를 입력받고
 * 루트를 1이라고 정했을 때
 * 각 노드의 부모를 찾는 문제
 * BFS탐색으로 해결할 수 있다.
 * queue<int> q; 
 * depth[1] = 0; 
 * check[1] = true; 
 * parent[1] = 0; 
 * q.push(1); 
 * while (!q.empty()) { 
 * int x = q.front(); 
 * q.pop(); 
 * for (int y : a[x]) { 
 * 	if (!check[y]) { 
 * 		depth[y] = depth[x] + 1; 
 * 		check[y] = true;
 * 		parent[y] = x; 
 * 		q.push(y); 
 * } } }
 * https://gist.github.com/Baekjoon/39384d6e37fd6af760bcb34019a8c082
 */

package baekjoon.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 트리의부모찾기_p11725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		ArrayList<Integer> [] list = new ArrayList[num+1];
		boolean [] check = new boolean[num+1];
		int [] result = new int[num+1];
		
		for(int i=0; i<=num; ++i) {
			list[i] = new ArrayList<>();
		}
		for(int i=0; i<num-1; ++i) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		check[1] = true;
		while(!q.isEmpty()) {
			int x = q.remove();
			for(int y : list[x]) {
				if(check[y]==false) {
					check[y]= true;
					result[y]=x;
					q.add(y);
				}
			}
		}
		
		for(int i=2; i<=num; ++i) {
			System.out.println(result[i]);
		}
		
	}
	
}
