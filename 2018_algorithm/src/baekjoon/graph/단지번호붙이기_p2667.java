/*
 * 정사각형 모양의 지도가 있다.
 * 0은 집이 없는 곳, 1은 집이 있는 곳
 * 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려고 한다.
 * 연결 : 좌우 아래위로 집이있는 경우 
 * DFS나 BFS알고리즘을 이용해서 어떻게 이어져있는지 확인할 수 있다.
 * d[i][j]=(i,j)를 방문안했으면 0, 했으면 단지 번호
 * int cnt = 0; 
 * for (int i=0; i<n; i++) { 
 * 	for (int j=0; j<n; j++) {
 * 	 if (a[i][j] == 1 && d[i][j] == 0) { 
 * 		bfs(i, j, ++cnt);
 *  } 
 *  }
 *   }
 *  void bfs(int x, int y, int cnt) { 
 *  queue<pair<int,int>> q;
 *   q.push(make_pair(x,y)); 
 *   d[x][y] = cnt;
 *    while (!q.empty()) {
 *     x = q.front().first; 
 *     y = q.front().second; q.pop();
 *      for (int k=0; k<4; k++) { 
 *      int nx = x+dx[k], ny = y+dy[k]; 
 *      if (0 <= nx && nx < n && 0 <= ny && ny < n) {
 *       if (a[nx][ny] == 1 && d[nx][ny] == 0) { 
 *       q.push(make_pair(nx,ny)); 
 *       d[nx][ny] = cnt; } } } } }
 * https://gist.github.com/Baekjoon/f5f2cd7f14b45ef634fe98b7c78ed23e
 * DFS : https://gist.github.com/Baekjoon/69358ae41392c18b7c22b70c976824ef
 */
package baekjoon.graph;

public class 단지번호붙이기_p2667 {

}
