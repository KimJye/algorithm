/*
 * ���簢�� ����� ������ �ִ�.
 * 0�� ���� ���� ��, 1�� ���� �ִ� ��
 * ������ ������ ����� ���� ������ ������ �����ϰ�, ������ ��ȣ�� ���̷��� �Ѵ�.
 * ���� : �¿� �Ʒ����� �����ִ� ��� 
 * DFS�� BFS�˰����� �̿��ؼ� ��� �̾����ִ��� Ȯ���� �� �ִ�.
 * d[i][j]=(i,j)�� �湮�������� 0, ������ ���� ��ȣ
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

public class ������ȣ���̱�_p2667 {

}
