package exam;

public class Exam1 {
	static int method1(int a[]) {
		int n=a.length;
		int sum=0;
		for(int i=0;i<n;++i) {
			for(int j=0;j<i+3;++j)
				sum=sum+a[i];
		}
		return sum;
	}
	
	static int method2(int a[]) {
		int sum=0;
		for(int i=0;i<3;++i)
			sum=sum+a[i];
		return sum;
	}
	
	static int method3(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;++i)
			sum=sum+method2(a);
		return sum;
	}
	
	static int method4(int a[],int start) {
		int sum=0;
		for(int i=start;i<a.length;++i)
			sum=sum+a[i];
		return sum;
	}
	
	static int method5(int a[]) {
		int sum=0;
		for(int i=0;i<3;++i) {
			sum=sum+method4(a,i);
		}
		return sum;
	}
	
	static int method6(int a[]) {
		int sum=0, n=a.length;
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j)
				sum=sum+a[i]*a[j];
		for(int k=0;k<n;++k)
			sum=sum+a[k];
		}
		return sum;
	}
	
	static int search2(int[]a,int value) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int middle=(start+end)/2;
			if(a[middle]<value)start=middle+1;
			else if(a[middle]>value) end=middle-1;
			else return middle;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("----------");
		method1(a);//O(
		System.out.println("----------");
		method2(a);
		System.out.println("----------");
		method3(a);
		System.out.println("----------");
		method4(a,0);
		System.out.println("----------");
		method5(a);
		System.out.println("----------");
		method6(a);
		System.out.println("----------");
		search2(a,5);
		System.out.println("----------");
	}
}
