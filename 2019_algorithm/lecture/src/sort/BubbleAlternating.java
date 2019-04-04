package sort;
/*
 * Date: 2019. 04. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : 좌우로 번갈아 가면서 정렬
 * description : 버블 정렬 기법을 응용하여 한 번은 왼쪽에서 오른쪽으로 진행하면서 최대값을 우측으로 보내고,
 *               한 번은 오른쪽에서 외쪽으로 진행하면서 최소값을 좌측으로 보내느 방법을 반복하면서 정렬하라.

 * solution : 버블 정렬 문제
 * 풀이 과정 : 왼쪽에서 오른쪽으로 정렬할 때는 최대값이 맨 끝으로 가고,
               오른쪽에서 왼쪽으로 정렬할 때는 최소값이 맨 앞으로 간다.
 * 디버그 :  예 :  	5 4 3 2 1
             i=0 	4 5 3 2 1
             i=1    4 3 5 2 1
             i=2    4 3 2 5 1
             i=3	4 3 2 1 5
             shift = i
             right = shift
             i=3	4 3 1 2 5
             i=2	4 1 3 2 5
             i=1	1 4 3 2 5
             shift = i
             left=shift

 */

public class BubbleAlternating {
    static void print(int[] d){
        for(int k : d)
            System.out.print(k+" ");
    }
    static void swap(int [] d, int i, int j){
        int temp = d[i];
        d[i]=d[j];
        d[j]=temp;
    }
    static void solution(int[]d){
        int left=0;
        int right=d.length-1;
        int shift=0;

        while(left<right){
            // 왼쪽 정렬
            for(int i=left; i<right; ++i){
                if(d[i]>d[i+1]){
                    swap(d,i,i+1);
                    shift = i;
                }
            }
            // 왼쪽 정렬 후, 오른쪽 정렬의 시작 인덱스.
            right = shift;

            for(int i=right; i>left; --i){
                if(d[i-1]>d[i]){
                    swap(d,i-1,i);
                    shift = i;
                }
            }
            // 오른쪽 정렬 후, 왼쪽 정렬의 시작 인덱스.
            left = shift;
        }
        print(d);
    }
    public static void main(String []args){
        int arr[] = {8,5,6,2,4,1,3,7,9,10};
        solution(arr);
    }
}
