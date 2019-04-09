package math;
/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1!~10! 합계
 */
public class Ex9 {
    public static void main(String[] args){
        int j=1;// 수열의 각 항
        int k=1;// 합계

        for(int i=1; i<=10; ++i){
           j*=i;
           k +=j;
        }
        System.out.println(k);
    }
}
