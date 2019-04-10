package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료 중 가장 큰 값을 찾아라.
 */
public class Ex21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a []= new int[10];
        int max=0;

        // 입력
        for(int j=0;j<10; ++j)
            a[j]=sc.nextInt();
        sc.close();

        // findMax
        for(int i=0;i<10; ++i){
            if(max<a[i])
                max=a[i];
        }
        System.out.println(max);
    }
}
