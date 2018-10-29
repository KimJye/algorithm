package divideConquer;
/*
 * 정렬되어 있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 배열 크기, 둘째 줄에는 배열 A내용, 셋째 줄에는 배열B내용
 * 배열에 들어있는 수는 절대값이 10^9보다 작거나 같은 정수이다.
 */
/*
 * 문풀 과정 
 * 1. 배열 A, B 내용 받는다.
 * 2. 새로운 배열 C에 비교해서 합친다.
 */

import java.io.*;
import java.util.StringTokenizer;

public class P11728_배열합치기 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 길이 입력
		StringTokenizer num = new StringTokenizer(br.readLine());
		
		//배열 생성
		int a [] = new int[Integer.parseInt(num.nextToken())]; 
		int b [] = new int[Integer.parseInt(num.nextToken())];
		
		//a 배열 내용 입력
		StringTokenizer ast = new StringTokenizer(br.readLine());
		
		for(int i=0; i<a.length; ++i) {
			a[i]=Integer.parseInt(ast.nextToken());
		}
		
		//b 배열 내용 입력
		StringTokenizer bst = new StringTokenizer(br.readLine());
		for(int i=0; i<b.length; ++i) {
			b[i]=Integer.parseInt(bst.nextToken());
		}
		
		br.close();
		
		int j=0; //a배열 가리키는 index
		int k=0; //b배열 가리키는 index
		int l=0; //c배열 index
		
		int clen = a.length+b.length; 
		int c [] = new int[clen];
		
		while(j<a.length && k<b.length) {
			if(a[j]<=b[k]) {
				c[l++] = a[j++];
			}else {
				c[l++] = b[k++];
			}
		}
		while(j<a.length) {
			c[l++] = a[j++];
		}
		while(k<b.length) {
			c[l++] = b[k++];
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<c.length; ++i) {
			sb.append(c[i]+" ");
		}
		
		System.out.println(sb.toString());
		
	}

}
