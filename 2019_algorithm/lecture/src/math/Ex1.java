package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1~100까지의 합계
 */
public class Ex1 {
    public static void main(String[] args){
        int j=0;
        for(int i=1; i<=100; ++i){
            j+=i;
        }
        System.out.println(j);
    }
}
