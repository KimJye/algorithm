/*
 * 2018.04.30
 * 김지혜
 * 가장 긴 바이너리 갭 길이 반환하기
 */

package exam;

import java.util.ArrayList;

public class binaryGap {
	
	public int solution(int n) {
		
		int a=0;
		int num=0;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(n>0) {//이진으로 바꾸는 메소드가 있다고합니다.
			arrayList.add(n%2);
			n=n/2;
		}
		for(int i=arrayList.size()-1;i>=0;i--) {
			if(arrayList.get(i)==0) {
				num++;
			}else if(arrayList.get(i)==1) {
				if(num>a) {
					a=num;
				}
				num=0;
			}
			
			System.out.print(arrayList.get(i));
		}
		System.out.println();
		return a;
	}
	
	public static void main(String[] args) {
			
		String str = "1,...2,147,483,647";
		
		binaryGap binarygap = new binaryGap();
		  
		System.out.println("바이너리 갭 : " + binarygap.solution(11240));
	}
}
