package sort;

import java.util.Arrays;

/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 석차 구하기
 * description : 10명의 학생에 대한 중간고사 점수의 석차를 구하라.
                 점수 배열은 입력되었다고 가정. 석차 배열에 저장하라.

 * solution : 정렬 문제, 배열 이용하기
 */
public class RankEx1 {
    static void print(int [] r, int [] s){
       for(int i=0; i<s.length; ++i){
           System.out.println(s[i]+" : " + r[i]);
       }
    }
    static void solution(int []s){
        int [] rank = new int [s.length];
        Arrays.fill(rank, 1);

        for(int i=0; i<s.length; ++i){
            for(int j=0; j<s.length; ++j){
                if(s[i]<s[j]){
                    rank[i]++;
                }
            }
        }
        print(rank, s);
    }
    public static void main(String[] args){
        int [] jumsu = {70,85,60,90,70};
        solution(jumsu);
    }
}
