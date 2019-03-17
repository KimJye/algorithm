package sort;

import java.util.Arrays;
import java.util.Random;

/*
 * Date: 2019. 03. 18
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  홀수 짝수 분리
 * description : 입력: 정수 배열 int[]
                 출력: 홀수들이 배열의 앞부분에, 짝수들은 배열의 뒷부분에 위치해야 함.

                 짝수들 순서, 홀수는 순서는 무관하다.

 * solution : 선택정렬은 가장 작은 수를 선택해서 맨 앞으로 옮긴다.
              버블정렬은 옆에있는 원소와 비교하여 정렬한다.
              삽입정렬은 적절한 위치에 삽입하는 정렬한다.
              퀵정렬은 기준값 기준으로 배열을 반으로 나눠서 정렬한다.
              이 문제는 결국 배열에서 반은 짝수, 반은 홀수여야 한다.
              (1) moveEvenNumbersToFront : 배열 앞에서 탐색한 것이 짝수인 것과  배열 뒤에서 탐색한 것이 홀수일때를 바꿔주면 된다.
              (2) partition : 배열을 앞에서부터 탐색할 때 홀수를 만나면 무조건 전단계로 가면 된다. 이렇게되면 자연스레 짝수는 배열의 뒷부분에 위치하게 된다.
 */
public class NumberSeparation {
    public static void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void partition(int[]b){
        int j=-1;
        for(int i=0; i<b.length; ++i){
            if(b[i]%2!=0){
                swap(b,++j,i);
            }
        }
    }
    public static void moveEvenNumbersToFront(int[] a) {

        int start = 0;
        int end = a.length - 1;

        while (true) {
            while (a[start] % 2 != 0) {//배열 앞에서 탐색한 것이 짝수를 만날 때까지 앞에서 뒤로 전진
                ++start;
            }
            while (a[end] % 2 == 0) {//배열 뒤에서 탐색한 것이 홀수를 만날 때까지 뒤에서 앞으로 전진
                --end;
            }
            if (start >= end) break; // 엇갈릴때는 멈춘다.

            swap(a, start, end);// 배열 앞에서 탐색한 것이 짝수인 것과  배열 뒤에서 탐색한 것이 홀수일때를 바꿔주면 된다.

        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        moveEvenNumbersToFront(a);

        int[] b = new int[20];

        for (int i = 0; i < b.length; ++i)
            b[i] = random.nextInt(20);

        partition(b);

        System.out.println("moveEvenNumbersToFront" + Arrays.toString(a));
        System.out.println("partition" + Arrays.toString(b));
    }
}
