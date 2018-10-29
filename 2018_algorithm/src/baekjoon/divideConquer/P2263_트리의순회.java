package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 문제 : 인오더 포스트오더를 통해 프리오더 구하기
 * 풀이 : 1. 포스트오더의 마지막은 루트이다. 
 * 		2. 찾은 루트를 인오더에서 ㅊ자고 인오더에서 루트 왼쪽은 왼쪽 자식, 오른쪽은 오른쪽 자식
 * 		3. 재귀
 */
public class P2263_트리의순회 {

	static int [] inorder;
	static int [] postorder;
	static int [] position;
	
	static void solve(int is, int ie, int ps, int pe) {
		if(is>ie || ps>pe) return;
		
		int root = postorder[pe]; // 포스트오더 마지막이 루트다.
		System.out.print(root+" ");
		
		int p = position[root]; // 인오더에서 루트위치
		
		solve(is, p-1, ps, ps+ p-is-1);
		solve(p+1, ie, ps+p-is, pe-1);
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		inorder = new int[n];
		postorder = new int[n];
		position = new int[n+1];
		
		// inorder 배열 내용 입력
		StringTokenizer inst = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; ++i) {
			inorder[i]=Integer.parseInt(inst.nextToken());
		}
		
		//postorder 배열 내용 입력
		StringTokenizer post = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; ++i) {
			postorder[i]=Integer.parseInt(post.nextToken());
		}
		
		for(int i=0; i<n; ++i) {
			position[inorder[i]]=i;
		}
		solve(0, n-1, 0, n-1);
		
	}

}
