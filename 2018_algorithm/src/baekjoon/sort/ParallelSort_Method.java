package baekjoon.sort;

import java.util.Arrays;

public class ParallelSort_Method {
	public static void main(String[] args) { 

		       double[] numbers = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 }; 

		       Arrays.sort(numbers); 

		       System.out.println(Arrays.toString(numbers)); 
		       char[] chars = { 'a', 'A', '4', 'F', 'D', 'P' }; 

		       Arrays.sort(chars); 

		       System.out.println(Arrays.toString(chars)); 

		       char[] chars2 = { 'a', 'A', '4', 'F', 'D', 'P' }; 

		       Arrays.parallelSort(chars2); 
		       System.out.println(Arrays.toString(chars2)); 

		    } 


}
