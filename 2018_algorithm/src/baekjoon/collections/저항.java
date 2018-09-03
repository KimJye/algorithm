package baekjoon.collections;

import java.util.HashMap;
import java.util.Scanner;

public class ÀúÇ× {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("black",0);
		h.put("brown",1);
		h.put("red",2);
		h.put("orange",3);
		h.put("yellow",4);
		h.put("green", 5);
		h.put("blue",6);
		h.put("violet",7);
		h.put("gray",8);
		h.put("white", 9);
		
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		String c = input.nextLine();
		
		long value = h.get(a)*10 + h.get(b);
		
		for(int i=0; i<h.get(c); ++i) {
			value *=10;
		}
		
		System.out.println(value);

	}

}
