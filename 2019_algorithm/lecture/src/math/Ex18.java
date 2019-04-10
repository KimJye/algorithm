package math;

import java.util.Scanner;

/*
 * Date: 2019. 04. 10
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 정수를 입력 받아 소인수를 구해 출력하라.
 * solution : 어떤 수 X를 소인수 분해하려면 X를 2부터 차례대로 X의 제곱근까지의 숫자로 나누어 떨어지는지 검사하면 된다.
 *            제곱근까지의 수 중 X를 처음으로 나누어 떨어지게 하는 수가 있으면 그 수는 소수이고, X는 소인수가 된다.
 *            소인수를 구했으면, 그때의 몫을 X로 하여 2부터 다시 X의 제곱근까지의 숫자로 나누는 작업을 반복한다.
 *            만약 몫이 X의 제곱근보다 커지면 그때는 몫인 X 자체가 그 수의 소인수가 된다.
 *
 *            20을 소인수 분해해 보자.
 *            1. 20의 제곱근은 4이다.
 *            # 2에서 4까지 나눠 본 후 나눠떨어지지 않으면 20 자체가 소인수이다.
 *            2. 20을 2로 나눈다. 나머지가 0이므로 2는 소인수이다. 2를 저장한다.
 *            3. 몫인 10에 대해서 다시 소인수를 구해야 한다. 10의 제곱근을 구하여 정수를 취한다. 10의 제곱근은 3이다.
 *            # 2에서 3까지 나눠 본 후 나눠떨어지지 않으면 10자체가 소인수이다.
 *            4. 10을 2로 나눈다. 나머지가 0이므로 2는 소인수이다. 2를 저장한다.
 *            5. 몫인 5에 대해 다시 소인수를 구해야 한다. 5의 제곱근을 구하여 정수를 취한다. 5의 제곱근은 2이다.
 *            # 2에서 2까지 나눠 본 후 나눠 떨어지지 않으면 5 자체가 소인수이다.
 *            6. 5자체가 소인수이므로 5를 저장한다.
 *            7. 피제수와 마지막으로 구한 소인수가 같을 때는 소인수 분해가 완료된 것이다.
 */
public class Ex18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        sc.close();
        int a[] = new int[100]; // 소인수가 저장될 1차원 배열
        int c=-1; // 소인수를 저장할 배열 a의 위치를 지정해 주는 변수
        int d; // 제수가 저장될 변수. 2부터 입력 받은 수 b의 제곱근까지 1씩 증가하는 숫자가 저장된다.
        int e;// 입력 받은 수 b의 제곱근이 저장될 변수
        int mok=0; // b를 d로 나눈 몫이 저장될 변수
        int nmg; // b를 d로 나눈 나머지가 저장될 변수

        while(true){
            d=2;
            e=(int)Math.sqrt(b);

            while(true){
                if(d>e){
                    d=b;
                    break;
                }else{
                    mok = b/d;
                    nmg = b-mok*d;
                    if(nmg==0){
                       break;
                    }else
                        d++;
                }
            }
            c++;
            a[c]=d;
            if(b==d)
                break;
            b=mok;
        }
        for (int i = 0; i <= c; ++i) {
            System.out.print(a[i]+" ");
        }
    }
}
