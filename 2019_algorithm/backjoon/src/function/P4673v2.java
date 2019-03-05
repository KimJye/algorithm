package function;
/*
 * Date: 2019. 03. 05 Version 2
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/4673
 * Title : 셀프 넘버
 * description : 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자.
                 예를 들어, d(75) = 75+7+5 = 87이다.
                 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
                 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다.
                 이런식으로 다음과 같은 수열을 만들 수 있다.
                 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
                 n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다.
                 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
                 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
                 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

                 입력 : 입력은 없다.

                 출력 : 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.


 * solution : 함수 문제, 에라토스테네스의 체
              d(1) = 1 + 1 = 2. 1은 2의 생성자. 2는 셀프넘버가 아니다. 즉, 생성자다.
              d(2) = 2 + 2
              d(39) = 39 + 3 + 9
              d(999) = 999 + 9 + 9 + 9
              1. 셀프 넘버를 찾을 크기가 10001인 check 배열을 생성한다. boolean.
              2. 1부터 10000까지 생성자인 수를 찾는다.
              3. 생성자를 찾으면, check 배열에 찾은 생성자 해당하는 인덱스를 true로 한다.
              4. 1부터 10000까지 check 배열의 값이 false인것을 찾아 출력한다.

 */
public class P4673v2 {
    // 생성자(셀프 넘버가 아닌 수) 찾기
    public static int findDn(int n){
        int dn = n; // 본인을 더해줌. dn = 39

        while(n>0){
            dn = dn+(n%10); //1의 자리 더하기. (1) dn = 39 + 9= 48. => (2) dn = 48 + 3 = 51
            n = n/10; // (1) n=3 => n=0
        }
        return dn;
    }
    public static void main(String[] args){
        boolean check [] = new boolean[10001]; // 1부터 10000까지에서 셀프 넘버 찾기.

        for(int i=1; i<check.length; ++i){
            if(findDn(i)<=10000){//문제조건 10000보다 작거나 같은 셀프 넘버 구하기
                check[findDn(i)]=true; // 생성자 즉, 셀프 넘버가 아닌 수의 해당 인덱스를 true
            }

        }

        // 셀프 넘버 찾기. 즉, check가 false인 값 찾기.
        for(int i=1; i<check.length; ++i){
            if(check[i]==false)
            System.out.println(i);
        }
    }
}
