package binarySearch;

import java.util.Scanner;

/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 이분 검색 - 2차원 배열
 * description : 키보드로 입력 받은 번호에 대한 점수를 DATA 배열에서 찾아 출력하라.
                 단. DATA[2][10] 배열에는 번호와 점수가 들어 있다고 가정하고,
                 찾는 자료가 없을 경우 자료와 함께 "Not found"를 출력하고 끝낸다.
 */
public class Ex2 {
    static void solution(int n, int [] [] d){
        int start = 0;
        int end = 9;
        int middle = 0;

        while (true) {
            if (start <= end) {
                middle = (int) (start + end) / 2;

                if (n == d[0][middle]) {
                    System.out.print(n + " " + d[1][middle]);
                    break;
                }

                if (n < d[0][middle]) {
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int data[][] = {{1,2,3,4,5,6,7,8,9,10},
                        {100,66,25,88,90,65,87,86,58,99}};

        int number = sc.nextInt();
        sc.close();

        solution(number,data);

    }
}
