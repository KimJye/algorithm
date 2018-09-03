package sort;

import java.util.Arrays;
import java.util.Random;

public class i번째작은값찾기 {
	
	//a 배열의 start~end에서 nth번째 작은 값을 리턴한다.
	//static int select(int[]a, int start, int end, int nth) {
		//if(start>=end) return a[start];//찾을 배열의 크기가 1이면 리턴
		//int middle=partition(a,start,end);//배열 나누기
	//	int middle_nth=middle-start+1;
	//}
	public static void main(String[] args) {
		Random random = new Random();
		int[]a=new int[10];
		
		for(int i=0;i<a.length;++i) {
			a[i]=random.nextInt(20);
		}
		
		System.out.println(Arrays.toString(a));
		//System.out.printf("1번째 작은 값=%d\n",select(a,0,a.length-1,1));
		//System.out.printf("2번째 작은 값=%d\n",select(a,0,a.length-1,2));
		//System.out.printf("3번째 작은 값=%d\n",select(a,0,a.length-1,3));
		//System.out.printf("4번째 작은 값=%d\n",select(a,0,a.length-1,4));
	}
}
