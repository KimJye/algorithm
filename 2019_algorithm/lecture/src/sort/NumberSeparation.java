package sort;

import java.util.Arrays;
import java.util.Random;

/*
 * Date: 2019. 03. 16
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  홀수 짝수 분리
 * description : 입력: 정수 배열 int[]
                 출력: 짝수들이 배열의 앞부분에, 홀수들은 배열의 뒷부분에 위치해야 함.

                 짝수들 순서, 홀수는 순서는 무관하다.

 * solution : 선택정렬은 짝수 중에서 가장 작은 수를 선택해서 맨 앞으로 옮긴다.
              버블정렬은 옆에있는 원소와 비교하여 정렬하는데, 다 정렬하고 새로운 배열로 짝수홀수 정렬한다.
              삽입정렬은 적절한 위치에 삽입하는 정렬인데, 다 정렬하고 새로운 배열로 짝수홀수 정렬한다.

 */
public class NumberSeparation {
    public static void moveEvenNumbersToFront(int[] a){

    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(20);

        moveEvenNumbersToFront(a);
        System.out.println(Arrays.toString(a));
    }
    }
