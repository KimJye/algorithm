/*
 * 2018/03/11
 * 1���� n���� �հ踦 ����ϴ� sum �Լ��� �����϶�.
 * ��� ȣ��� �����϶�.
 * ������ �޼ҵ��� �ð� ���⵵��? ->O(n)
 */


package recursive;

public class Sum {

	static int sum(int n){
		int sum=0;
		
		if(n==1) return 1;
		sum=n+sum(n-1);
		return sum;
		
		/*
		 * �� �����ϰ� �ϱ�.
		 * if(n==1) return 1;
			return n+sum(n-1);
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3; i<=10;++i){
			System.out.printf("%d %d\n", i,sum(i));
		}
	}

}
