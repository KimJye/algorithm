package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : (-1)*2*(-3)*4*(-5)*....*100 합계
 */
public class Ex5 {
    public static void main(String[] args) {

        int j = 1;
        for (int i = 1; i <= 100; ++i) {
            if (i % 2 == 0) {
                j *= i;
            } else {
                j *= (-1) * i;
            }
            System.out.println(j);
        }
        System.out.println(j);
    }
}
