package sort;

public class Example4 {

	static int findMin(int[]a, int start) { // �迭 a�� start ��ġ���� ���������� ���� ���� ���� ��ġ(index)�� �����Ѵ�.

		int index=0;
		int min=a[start];
		
		for(int i=start;i<a.length;++i) {
			if(min>=a[i]) {
				min=a[i];
				index=i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int []a= {14,11,13,15};
		
		for(int i=0;i<a.length;++i) {
			int minIndex=findMin(a,i);
			System.out.println(a[minIndex]);
		}
	}
}
