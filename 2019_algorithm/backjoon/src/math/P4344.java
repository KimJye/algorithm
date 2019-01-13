package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Date: 2019. 01. 13
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Problem URL : https://www.acmicpc.net/problem/4344
 * Title : 평균은 넘겠지
 * description : 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
                 당신은 그들에게 슬픈 진실을 알려줘야 한다.
                 입력 : 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
                        둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
                        이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

                 출력 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.


 * solution : if문 사용 문제.

 */
public class P4344 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken()); //테스트 케이스의 개수

        while(C-- >0){

            StringTokenizer str = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(str.nextToken());// 각 테스트 케이스마다 학생의 수
            int [] arr = new int [N];

            for(int i=0; i<N; ++i){
                arr[i] = Integer.parseInt(str.nextToken());
            }
            int sum=0;
            double average = 0;

            for(int i=0; i<N; ++i){//평균 구하기
                sum+=arr[i];
            }
            average = (double)sum/N;
            int count=0;

            for(int i=0; i<N; ++i){
                if(arr[i]>average)
                    count++;
            }
            System.out.printf("%.3f",100.0*count/N);
            System.out.println("%");
        }

        br.close();


    }
}
