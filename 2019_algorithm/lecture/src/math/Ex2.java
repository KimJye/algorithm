package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1~99까지 홀수 합계 구하라
 */
public class Ex2 {
    public static void main(String[] args){
        int j=0;
        for(int i=1; i<100; i+=2){
            j+=i;
        }
        System.out.println(j);
    }
}
