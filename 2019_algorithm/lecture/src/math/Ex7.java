package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1+2+4+7+11+16+22+....의 순서로 나열되는 수열의 20번째 항까지의 합계를 구하라.
 */
public class Ex7 {
    public static void main(String[] args) {

        int k = 1;//계산값
        int j = 1;

        for (int i = 0; i <20; ++i) {
            j += i;
            k += j;
        }
        System.out.println(k);
    }
}
