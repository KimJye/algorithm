package recursive;

public class 코드분석 {
	
	static void print(int[]a,int index){
		if(index>=a.length)return;
		System.out.printf("%d",a[index]);
		print(a,index+1);
	}
	
	static int sum(int[]a,int index){
		if(index==a.length-1)return a[index];
		return a[index]+sum(a,index+1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[10];
		for(int i=0;i<a.length;++i){
			a[i]=i;
		}
		print(a,0);
		System.out.println();
		System.out.println(sum(a,0));
	}

}
