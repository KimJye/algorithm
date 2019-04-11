package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 11
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 그레이 코드 변환하기
 * description : 0또는1로 입력되는 다섯 개의 숫자를 배열에 입력 받아 그레이 코드 또는 이진수로 변환하라.
 * 조건 : 배열의 첫 번째 비트가 0이면 나머지 네 개의 비트는 이진수이므로 그레이 코드로 변환하여 출력한다.
 *        배열의 첫 번째 비트가 1이면 나머지 네 개의 비트는 그레이코드이므로 이진수로 변환하여 출력한다.
 * solution : xor을 이용한다.
 */
public class Ex23 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int input[] = new int[5];

        // 입력
        for (int i = 0; i < 5; ++i)
            input[i] = sc.nextInt();
        sc.close();

        int cont[] = new int[4];

        cont[0]=input[1];

        //이진수로 변환
        if(input[0]==1){
            for(int i=0; i<3; ++i){
                if(input[i+2]==cont[i])
                    cont[i+1]=0;
                else
                    cont[i+1]=1;
            }
        }else{ // 그레이 코드로 변환
            for(int i=0; i<3; ++i){
                if(input[i+1]==input[i+2])
                    cont[i+1]=0;
                else
                    cont[i+1]=1;
            }
        }
        if (input[0] == 1) {
            System.out.println("이진수");
        } else {
            System.out.println("그레이 코드");
        }
        for(int i=0; i<4; ++i){
            System.out.print(cont[i]+" ");
        }
    }
}
