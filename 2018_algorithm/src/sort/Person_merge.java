package sort;

import java.util.Arrays;
import java.util.Comparator;

import sort.Person;
import sort.PersonNameComparator;

public class Person_merge {

		//a배열에서 start에서 end사이의 값을 정렬한다.
		static void mergeSort(Object []a,int start,int end,Comparator comparator) {
			if(start<end) {
				int middle=(start+end)/2;
				mergeSort(a,start,middle,comparator);
				mergeSort(a,middle+1,end,comparator);
				merge(a,start,middle,end,comparator);
			}else return;
		}
		
		static void merge(Object []a,int start, int middle, int end,Comparator comparator) {
			int length=end-start+1;
			Object[]temp=new Object[length];
			int i=0;
			int index1= start;
			int index2= middle+1;
			
			while(index1<=middle&&index2<=end) {
				if(comparator.compare(a[index1],a[index2])<0)
					temp[i++]=a[index1++];
				else
					temp[i++]=a[index2++];
			}
			
			while(index1<=middle)
				temp[i++]=a[index1++];
			
			while(index2<=end)
				temp[i++]=a[index2++];
			
			for(i=0;i<temp.length;++i) {
				a[start+i]=temp[i];
			}
		}
		
		public static void main(String[] agrs) {
			Person[]a= new Person[] {
					new Person("김지혜",23),new Person("루비",35), new Person("엄마",47), 
					new Person("김하얀",20)
			};
			
			mergeSort(a,0,a.length-1,new PersonNameComparator());
			System.out.println(Arrays.toString(a));
		}
}
