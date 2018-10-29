package divideConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * ������Ʈ�� �ϸ鼭 ������ Ǯ �� �ִ�.
 */
public class P1517_�����Ʈ {
	public static long solve(int[] a, int s, int e) {
		
		if(s == e) return 0;
		int mid = (s+e)/2;
		int [] b =new int[e-s+1];
		
		long value =solve(a,s,mid)+solve(a,mid+1,e);
		
		int i = s;
		int j = mid+1;
		int k=0;
		
		while(i<=mid || j<=e) {
			if(i<=mid && (j>e || a[i]<=a[j])) {
				b[k++] = a[i++];
			}else {
				value+=(long)(mid-i+1);
				b[k++] = a[j++];
			}
		}
		for(int l=s; l<=e; ++l) {
			a[l] = b[l-s];
		}
		return value;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		
		int [] a = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; ++i) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		
		long result = solve(a,0,n-1);
		
		System.out.println(result);
	}

}
