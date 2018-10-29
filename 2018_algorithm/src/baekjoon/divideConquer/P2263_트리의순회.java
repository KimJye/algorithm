package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * ���� : �ο��� ����Ʈ������ ���� �������� ���ϱ�
 * Ǯ�� : 1. ����Ʈ������ �������� ��Ʈ�̴�. 
 * 		2. ã�� ��Ʈ�� �ο������� ���ڰ� �ο������� ��Ʈ ������ ���� �ڽ�, �������� ������ �ڽ�
 * 		3. ���
 */
public class P2263_Ʈ���Ǽ�ȸ {

	static int [] inorder;
	static int [] postorder;
	static int [] position;
	
	static void solve(int is, int ie, int ps, int pe) {
		if(is>ie || ps>pe) return;
		
		int root = postorder[pe]; // ����Ʈ���� �������� ��Ʈ��.
		System.out.print(root+" ");
		
		int p = position[root]; // �ο������� ��Ʈ��ġ
		
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
		
		// inorder �迭 ���� �Է�
		StringTokenizer inst = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; ++i) {
			inorder[i]=Integer.parseInt(inst.nextToken());
		}
		
		//postorder �迭 ���� �Է�
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
