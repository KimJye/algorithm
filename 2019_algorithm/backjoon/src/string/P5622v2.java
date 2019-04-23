package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Date: 2019. 04. 22
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/5622
 * Title : 다이얼
 * description : 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
                 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
                 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
                 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오

                 입력 : 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다. UNUCIC
                 출력 : 첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다. 36

 * solution : 문자열 문제
 */
public class P5622v2 {
    public static boolean preRequisites(String s){
        if(!s.toUpperCase().equals(s)) return false;
        if(s.length()<2 || s.length()>15) return false;
        return true;
    }
    public static int solution(String s){
        int [] number = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        int sum=s.length();

        for(int i=0; i<s.length(); ++i){
            sum+=number[s.charAt(i)-65];//A=65
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        if(!preRequisites(input)) return;

        System.out.println(solution(input));
    }
}
