package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : -1+2-3+-4+5-6....+99-100
 */
public class Ex3 {
    public static void main(String[] args){
        int j=0;
        int c=0;

        for(int i=1; i<=100; ++i){
            if(c==0){
                j+=i;
                c=1;
            }else{
                j-=i;
                c=0;
            }
        }
        System.out.println(j);
    }
}
