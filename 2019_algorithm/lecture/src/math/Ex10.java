package math;
/*
 * Date: 2019. 04. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 피보나치 수열 1+1+2+3+5+13......의 합계
 * solution : 처음에 첫 번째 항과 두 번째 항의 값으로 1을 갖고, 두항의 합계 2를 합계에 저장하고 시작하는 것이 핵심이다.
 */
public class Ex10 {
    public static void main(String[] args){
        int A = 1; // 첫 번째 항의 값이 저장될 변수
        int B = 1; // 두 번째 항의 값이 저장될 변수
        int C = 2; //첫 번째 항과 두번째 항의 합. 즉, 세번째 항이 저장될 변수
        int HAP = 2;

        for(int i=2; i<20; ++i){ // 첫 번째는 이미 초기값으로 설정해서 2부터 시작.
            C=A+B;
            HAP += C;
            A=B;
            B=C;
        }
        System.out.println(HAP);
    }
}
