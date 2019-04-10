package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 10개의 1자리 양의 정수를 입력 받아 배열에 저장한 후, 저장된 자료 중 7에 가장 가까운 자료를 찾아라
 *         단, 자료는 1자리 정수이고 근사값이 2개인 경우에는 나중에 찾은 값을 출력한다.
 *solution : 7에 가장 가깝다는 의미는 어떤 수와 7과의 차이가 가장 작다는 말과 같다.
             7과 가장 가까운 수를 구하려면 7과 다른 수들의 차를 계산한 후
             차이를 비교하여 차이가 가장 작은 수를 찾으면 된다.
             주의할 점은 차이를 계산할 때 음수가 나오면 안되므로 7과 어떤 수의 대소를 비교한 후
             큰 수에서 작은수를 뺀다.
             4,2,5,6,9가 있을 때 7과 가장 가까운 수를 찾아보자.
 */
public class Ex22 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        // 입력
        for (int j = 0; j < 10; ++j)
            a[j] = sc.nextInt();
        sc.close();

        int j; // 7과 비교 대상의 차이 값 중 최소값이 저장될 변수
        int k; //a 배열의 위치를 지정해주는 변수
        int l;// 7과 비교 대상의 차이 값이 저장될 변수
        int m=0;//7과 가장 가까운 값이 저장될 변수

        j=9;
        for(k=0;k<10; ++k){
            if(a[k]<7){
                l=7-a[k];
            }else{
                l=a[k]-7;
            }
            if(j>=l){
                j=l;
                m=a[k];
            }
        }
        System.out.println(m);
    }
}
