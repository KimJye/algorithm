//시간 초과 나옴..... 답은 맞음
package baekjoon.math01;

import java.util.ArrayList;
import java.util.Scanner;

public class 골드바흐의추측_p6588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Boolean> primeList;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int num = input.nextInt();
			
			if(num==(0|1)) return;
		
			primeList = new ArrayList<Boolean>(num+1);
			primeList.add(false);
			primeList.add(false);
			
			for(int i=2; i<=num; ++i) {
				primeList.add(i,true);
			}
			for(int i=2; i*i<=num;++i){  
				if(num%i==0) {
					primeList.set(i,false);
					for(int j=i*i; j<=num; j+=i) primeList.set(j,false);
				}
			}
			
			StringBuilder builder = new StringBuilder();
			
			for(int i=1; i<=num; ++i) {
				if(primeList.get(i)==true) {
					builder.append(num);
					builder.append("=");
					builder.append(i);
					builder.append("+");
					builder.append(num-i);
					break;
				}
			}
		System.out.println(builder.toString());

		}

	}

}
