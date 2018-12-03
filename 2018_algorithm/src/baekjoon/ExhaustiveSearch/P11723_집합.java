package ExhaustiveSearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//비트마스크로 풀기
/*
 * 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
•add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
•remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
•check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
•toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
•all: S를 {1, 2, ..., 20} 으로 바꾼다.
•empty: S를 공집합으로 바꾼다. 

 */
public class P11723_집합 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int m = Integer.parseInt(bf.readLine());
		int bitmask=0;

		StringTokenizer st;
		String str;
		int num=0;
		while(m-- >0) {
			st = new StringTokenizer(bf.readLine());

			str = st.nextToken();

			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			switch(str) {

			case"add":
				bitmask = bitmask | (1<<num);
				break;

			case"remove":
				bitmask = bitmask & ~(1<<num);
				break;

			case"check":
				int result = (bitmask & (1<<num));
				if(result>0) {
					bw.write("1\n");
				}else if(result==0) {
					bw.write("0\n");
				}
				break;

			case"toggle":
				bitmask = bitmask ^ (1<<num);
				break;

			case"all":
				bitmask = bitmask | (1<<21)-1;//왜 21일까
				break;

			case"empty":
				bitmask =0;
				break;

			}

		}
		bw.close();
		bf.close();
	}

}
