package greedy;

import java.util.Scanner;
// N �� K�� 1�϶��� ��������.

/*
 * �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.

������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�. �� �� �ʿ��� ���� ������ �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
ù° �ٿ� N�� K�� �־�����. (1 �� N �� 10, 1 �� K �� 100,000,000)

��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����. (1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)

 */
/*
 *  �˰��� ���͵� �ǵ�� : stack�� ���� ����� ����.=>���� : ū �� ���� �����ϴϱ�. �� �ں��� ���Ŵϱ�. �ε��� �� �Ⱦ���
 */
public class ����0_p11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt(); //���� ���� �Է�
		int K = input.nextInt(); // ���ϰ����ϴ� ������ ��ġ �� �Է�
		
		int arr [] = new int[N];
		int count=0;
		
		for(int i=0; i<N; ++i) {
			arr[i] = input.nextInt();
		}
		
		for(int i=N-1; i>=0; --i) {
			if(arr[i]<=K) {
				while(K>=arr[i]) {
					K-=arr[i];
					count++;
				}
			}
		}
		input.close();
		System.out.println(count);
	}

}
