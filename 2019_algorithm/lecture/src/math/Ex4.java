package math;

/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 1-2-3+4-5+6....-98+99
 * description : 다른 변수 없이 구하라.
 */
public class Ex4 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        while (true) {
            i++;
            j+=i;
            if(i>=99){
                System.out.println(j);
                break;
            }else{
                i++;
                j-=i;
            }
        }
    }
}
