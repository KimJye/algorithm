package sort;

import java.util.Arrays;
import java.util.Comparator;

import sort.Person;
import sort.PersonNameComparator;

public class Person_quick {
	
	static void swap(Object[]a,int i, int j) {
		Object temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	static<T> int partition(T[]a,int start, int end,Comparator<T> comparator) {
		T value=a[end];//±âÁØ°ª
		int i=start-1;
		for(int j=start;j<=end-1;++j) {
			if(comparator.compare(a[j],value)>0) {
				swap(a,++i,j);
			}
		}
		swap(a,i+1,end);
		return i+1;
	}
	
	static <T> void quickSort(T[]a,int start, int end,Comparator<T> comparator) {
		if(start>=end)return;
		int middle=partition(a,start,end,comparator);
		quickSort(a,start,middle-1,comparator);
		quickSort(a,middle+1,end,comparator);
	}
	
	public static void main(String[]args) {
		Person[]a= new Person[] {
				new Person("±èÁöÇý",23),new Person("·çºñ",35), new Person("¾ö¸¶",47), 
				new Person("±èÇÏ¾á",20)
		};
		quickSort(a,0,a.length-1,new PersonNameComparator());
		System.out.println(Arrays.toString(a));
	}
}
