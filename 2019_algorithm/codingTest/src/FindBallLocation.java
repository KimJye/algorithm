/*
 * Date: 2019. 01. 05.
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL: https://www.acmicpc.net/problem/1547 
 * Title : 공 위치 찾기 (문제 응용)
 * description : 컵 위치는 1,2,3
                 시작은 1번째 컵에 공이 들어있다.
                 컵 위치 바뀌는 순서는 "1,3","2,1"
 */
public class FindBallLocation{
    static int solution(String[] find){
        char value='1';

        for(int i=0; i<find.length; ++i){
            if(find[i].charAt(0)!=value && find[i].charAt(2)!=value){
                continue;
            }else if(find[i].charAt(0)==value || find[i].charAt(2)==value){
                if(find[i].charAt(0)==value){
                    value=find[i].charAt(2);
                }else{
                    value=find[i].charAt(0);
                }
            }
        }
        int answer = value - '0';
        return answer;
    }
    public static void main(String[] args){
        String [] find = new String [2];
        solution(find);
    }

}

