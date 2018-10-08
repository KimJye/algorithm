package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p10610_30¸¸µé±â {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		List<Integer> list = new ArrayList<Integer>();// for easy searching. LinkList is easy for update or delete

		boolean zero = false; //Check zero does exist
		int result=0; // Check 30 times
		
		for(int i=0; i<str.length(); ++i) {

			int num = str.charAt(i)-'0'; //Change char to int
			list.add(num);
			result+=num;
			if(list.get(i)==0) zero=true;
		}
		
		Collections.sort(list);
		Collections.reverse(list); // for largest number
		
		StringBuilder sb = new StringBuilder(); //Integer Output occurs stackoverflow. StringBuffer is effective in using multi-threads but this algorithm is not using multi-threads.
		
		if(result%3==0 && zero==true) {
			for(int i=0; i<list.size(); ++i) {
				sb.append(list.get(i));
			}
			System.out.println(sb.toString());
		}else {
			System.out.println("-1");
		}
		br.close();
	}

}
