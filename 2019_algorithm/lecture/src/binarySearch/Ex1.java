package binarySearch;

import java.util.Scanner;

/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 이분 검색
 * description : 키보드로 입력 받은 값이 DATA 배열의 몇 번째에 기억되어 있는지 알아보라.
                 단, DATA[10] 배열에는 10개의 숫자가 들어있으며, 찾는 자료가 없을 경우 자료와 함께 "Not Found"를 출력하고 끝낸다.
 */
public class Ex1 {
    static void solution(int[] d, int n) {
        int start = 0;
        int end = d.length - 1;
        int middle = 0;

        while (true) {
            if (start <= end) {
                middle = (int) (start + end) / 2;

                if (n == d[middle]) {
                    System.out.print(n + " " + middle+1);
                    break;
                }

                if (n < d[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                System.out.println("NOT Found " + n);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int data[] = {8, 15, 35, 55, 60, 61, 70, 80, 92, 99};
        solution(data, n);
    }
}
