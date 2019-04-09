package math;
/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : (-1/2)+(2/3)-(3/4)+(4/5)-(5/6).....-(99/100 합계
 */
public class Ex6 {
    public static void main(String [] args){
        double j=0;
        for(int i=1; i<100; ++i){
            if(i%2==0){
                j +=(i/i+1);
            }else{
                j -=(i/i+1);
            }
        }
        System.out.println(j);
    }
}
