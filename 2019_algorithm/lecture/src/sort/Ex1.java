package sort;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Date: 2019. 03. 18
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  문자 정렬 1
 * description : 입력: 문자 배열 char[]
                 출력: 오름차순으로 배열 정렬하기

 * solution : Java 표준 라이브러리의 Arrays.sort 메소드를 이용하여 구현.
 */
public class Ex1 {
    public static void sort(char[] a){
        Arrays.sort(a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] a = str.toCharArray();
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
