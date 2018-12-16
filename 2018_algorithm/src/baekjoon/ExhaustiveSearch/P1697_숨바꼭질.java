package ExhaustiveSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * ť ����ϱ� - BFS ����ϴ� ���
 * 1. ���� ��Ȳ�� �׷����� ������ �Ѵ�. ���� ������ ������ ���� �ʾƾ��Ѵ�.
 * 2. �׷��� �ִ� ��� ���ϴ� ����
 * 3. ���� ����ġ�� ��� 1�̾�� �Ѵ�.
 * ----------------------------
 * ������ ã�� ���� ���� �ð��� ���϶�, �����̴� 1�ʵ��� ������ 
 * ���� ���´� �������� ��Ÿ�����ְ� �������� �������� ��Ÿ�� �� ����
 * => BFS �������
 * ���ü��ִ� ������ ������ 10����
 * ť�� ������ ��ġ �����鼭 �̵�
 * �ѹ� �湮�Ѱ��� �ٽ� �湮���� �ʴ´�.
 * check[i] = i �湮����
 * dist[i] = i ������� �湮
 */
public class P1697_���ٲ��� {

	public static int BFS(int n, int k, boolean[]check, int[]value) {
		int [] state = new int[3]; //�� 3���� ���
		Queue<Integer> q = new LinkedList<Integer>();

		int x=0; //�������� ���� ��ġ �˱� ���� ����

		check[n] = true; // ó���� �����ϱ�
		value[n] = 0; // ó���̴ϱ� �Ÿ��� 0�̰���..

		q.add(n);

		while(!q.isEmpty()) {
			x=q.remove();
			state[0] = x-1;
			state[1] = x+1;
			state[2] = x*2;//�����̵�

			for(int i=0; i<3; ++i) {
				if(state[i]>=0 && state[i]<=100000 && check[state[i]]==false) {
					q.add(state[i]);
					check[state[i]]=true;
					value[state[i]] = value[x]+1;
				}
			}
			if(x==k) {
				break;
			}


		}
		return value[k];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //����
		int k = sc.nextInt(); //����
		boolean[] check = new boolean[1000000];
		int [] value = new int [1000000];
		sc.close();
		System.out.println(BFS(n,k,check,value));
	}

}
