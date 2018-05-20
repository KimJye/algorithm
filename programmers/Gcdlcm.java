package programmers;

import java.util.Arrays;

public class Gcdlcm {
	public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int max=(a>b)?a:b;
        int min=(a>b)?b:a;
        int result=0;//최대공약수
        
        while(true){
            result=max%min;
            if(result==0) {
            	answer[0]=min;
            	answer[1]=(a*b)/min;
            	break;
            }else {
            	max=min;
            	min=result;
            }
        }
        return answer;
        
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Gcdlcm c = new Gcdlcm();
        System.out.println(Arrays.toString(c.gcdlcm(6, 14)));
    }
}
