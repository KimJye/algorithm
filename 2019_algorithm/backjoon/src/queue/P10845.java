package queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 07. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/10845
 * Title : 큐
 * description : 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
				 명령은 총 여섯 가지이다.

			     push X: 정수 X를 큐에 넣는 연산이다.
				 pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				 size: 큐에 들어있는 정수의 개수를 출력한다.
				 empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				 front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				 back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

                 입력 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
                 		둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
                 		주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
                 		문제에 나와있지 않은 명령이 주어지는 경우는 없다.

                 출력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

 * solution : 큐
 */
public class P10845 {
	static class Queue {
		int[] a;
		int front = 0, end = 0, count = 0;

		public Queue(int size) {
			this.a = new int[size];
		}

		public boolean isFull() {
			return count == a.length;
		}

		public boolean isEmpty() {
			return count == 0;
		}

		public int size() {
			return this.count;
		}

		public void push(int value) throws Exception{
			if (isFull()) {
				throw new Exception("full");
			}
			a[end] = value;
			end = (end + 1) % a.length;
			count++;
		}

		public int pop() throws Exception {
			if (isEmpty()) {
				throw new Exception("empty");
			}
			int value = a[front];
			front = (front + 1) % a.length;
			--count;
			return value;
		}

//		public void expand() {
//			int size = a.length * 2;
//			int[] b = new int[size];
//
//			for (int i = 0; i < count; ++i) {
//				int index = (front + 1) % a.length;
//				b[i] = a[index];
//			}
//
//			a = b;
//			front = 0;
//			end = count;
//		}

		public int front() {
			return a[front];
		}

		public int back() {
			return a[end == 0 ? a.length - 1 : end - 1];
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Queue queue = new Queue(N);

		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();

			switch (cmd) {
				case "push":
					queue.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					System.out.println(queue.size() > 0 ? queue.pop() : -1);
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					System.out.println(queue.isEmpty() ? 1 : 0);
					break;
				case "front":
					System.out.println(queue.size() > 0 ? queue.front() : -1);
					break;
				case "back":
					System.out.println(queue.size() > 0 ? queue.back() : -1);
					break;
			}
		}
	}
}
