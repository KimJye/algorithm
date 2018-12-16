package ExhaustiveSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 큐 사용하기 - BFS 사용하는 방법
 * 1. 문제 상황을 그래프로 만들어야 한다. 문제 상태의 개수가 많지 않아야한다.
 * 2. 그래프 최단 경로 구하는 문제
 * 3. 간선 가중치가 모두 1이어야 한다.
 * ----------------------------
 * 동생을 찾는 가장 빠른 시간을 구하라, 수빈이는 1초동안 움직임 
 * 수빈 상태는 정점으로 나타낼수있고 움직임은 간선으로 나타낼 수 있음
 * => BFS 사용하자
 * 나올수있는 정점의 개수는 10만개
 * 큐에 수빈이 위치 넣으면서 이동
 * 한번 방문한곳은 다시 방문하지 않는다.
 * check[i] = i 방문여부
 * dist[i] = i 몇번만에 방문
 */
public class P1697_숨바꼭질 {

	public static int BFS(int n, int k, boolean[]check, int[]value) {
		int [] state = new int[3]; //총 3가지 경우
		Queue<Integer> q = new LinkedList<Integer>();

		int x=0; //수빈이의 현재 위치 알기 위한 변수

		check[n] = true; // 처음에 갔으니까
		value[n] = 0; // 처음이니까 거리는 0이겟지..

		q.add(n);

		while(!q.isEmpty()) {
			x=q.remove();
			state[0] = x-1;
			state[1] = x+1;
			state[2] = x*2;//순간이동

			for(int i=0; i<3; ++i) {
				if(state[i]>=0 && state[i]<=100000 && check[state[i]]==false) {
					q.add(state[i]);
					check[state[i]]=true;
					value[state[i]] = value[x]+1;
				}
			}
			if(x==k) {
				break;
			}


		}
		return value[k];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //수빈
		int k = sc.nextInt(); //동생
		boolean[] check = new boolean[1000000];
		int [] value = new int [1000000];
		sc.close();
		System.out.println(BFS(n,k,check,value));
	}

}
