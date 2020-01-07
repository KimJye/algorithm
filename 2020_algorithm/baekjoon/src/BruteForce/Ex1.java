package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 아홉 개의 수 중 합이 100이 되는 일곱 개의 수를 찾으시오
 * 총 아홉개 줄에 1보다 크거나 같고 99보다 작거나 같은 자연수가 주어진다. 모든 숫자는 서로 다르다.
 * 일곱 난쟁이가 쓴 모자에 쓰여 있는 수를 한 줄에 하나씩 출력한다.
 * */
public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 각 난장이들 모자에 쓰여진 수
        int [] array = new int[9];

        // 일단 모든 아홉 난장이 모자에 쓰여진 수를 더함.
        int sum=0;

        for(int i=0; i<9; ++i){
            sum+= array[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        // 일곱난장이의 총 합이 100이라고 했으니까, 아홉난장이의 총 합에서 100을 빼면 2명이 거짓말을 하고있다는것을 알수있음.
        sum-=100;

        // 각 난장이들을 탐색하면서 sum값이 일치한 애들을 뺀 나머지를 출력해야 한다..

        for(int i=0; i<array.length; ++i){
            for(int j=i+1; j<array.length; ++j){
                if(array[i]+array[j]==sum){
                    array[i]=array[j]=-1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int result : array){
            if(result != -1){
                sb.append(result).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
