import java.util.Arrays;
/*
지폐 단위 개수 세기
풀이 과정 : 처음에는, 화폐 단위의 규칙을 몰라서 하드코딩했으나...
            2번째 풀때는,, 5와 2를 번걸아가면서 나눈다는 규칙을 발견함..(흙..)
            3번째 풀때는,, 규칙 발견보다는 그냥 직관적으로 배열에 담는 것은 어떠한가라는 생각으로 다시품..코드 훨씬 짧음..
 */
public class E1 {
    static int[] solution3(int money){
        int [] answer = new int[9];
        int [] unit = {50000,10000,5000,1000,500,100,50,10,1};

        for(int i=0; i<9; ++i){
            answer[i]=money/unit[i];
            money = money-(answer[i]*unit[i]);
        }
        return answer;
    }
    public static  int[] solution2(int money) {
        int[] answer = new int[9];

        int rule = 0;// 화폐 단위 규칙
        int unit=50000; // 화폐 단위. 처음 50000으로 시자악.

        for(int i=0; i<9; ++i){

            if(unit==5){ // 문제에서 5단위가 없음. 10원 다음으로 바로 1원.
                answer[i]=money/1;
                break;
            }
            answer[i]=money/unit;

            if(answer[i]!=0){
                money = money-(unit*answer[i]);
            }

            if(rule==0){
                unit/=5; //50000다음에 10000임
                rule=1;
            }else if(rule==1){
                unit/=2; //10000다음에 5000원
                rule=0;
            }
        }

        return answer;

/*
        solution1

        answer[0] = mon/50000;
        if((answer[0])!=0){
            mon=mon-(50000*answer[0]);
        }

        answer[1] = mon/10000;
        if((answer[1])!=0){
            mon=mon-(10000*answer[1]);
        }

        answer[2] = mon/5000;
        if((answer[2])!=0){
            mon=mon-(5000*answer[2]);
        }

        answer[3] = mon/1000;
        if((answer[3])!=0){
            mon=mon-(1000*answer[3]);
        }

        answer[4] = mon/500;
        if((answer[4])!=0){
            mon=mon-(500*answer[4]);
        }

        answer[5] = mon/100;
        if((answer[5])!=0){
            mon=mon-(100*answer[5]);
        }

        answer[6] = mon/50;
        if((answer[6])!=0){
            mon=mon-(50*answer[6]);
        }

        answer[7] = mon/10;
        if((answer[7])!=0){
            mon=mon-(10*answer[7]);
        }

        answer[8] = mon/1;
        if((answer[8])!=0){
            mon=mon-(1*answer[8]);
        }
        */

    }
    public static void main(String[] args){

        //System.out.println(Arrays.toString(solution2(50237)));
        System.out.println(Arrays.toString(solution3(50237)));
    }
}
