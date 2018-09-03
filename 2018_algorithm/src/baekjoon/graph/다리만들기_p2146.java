/*
 * 여러 섬으로 이루어진 나라에서 두 섬을 연결하는 가장 짧은 다리를 찾는 문제
 * 단지번호붙이기 + 토마토 문제
 * 먼저 섬을 그룹으로 나눈다.
 * g[i][j]=(i,j)의 그룹 번호
 * 그 다음 각각의 그룹에 대해서 다른 섬까지 거리를 계산한다.
 * 이 방법은 각각이 그룹에 대해서 BFS 알고리즘을 수행해야 하기 때문에 느리다.
 * https://gist.github.com/Baekjoon/b2abbb7d2a385eed36ccd755677f3d81
 * 더 빠른 알고리즘으로 땅을 확장하는 방식을 생각해 볼 수 있다.
 * 각 칸과 인접한 칸의 그룹 번호가 다르면 다리를 만들 수 있다.
 * https://gist.github.com/Baekjoon/fdaea828f9374c3f5fc35ae446da704d
 * 
 */
package baekjoon.graph;

public class 다리만들기_p2146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
