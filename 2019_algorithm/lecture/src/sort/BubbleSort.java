package sort;

import java.util.Arrays;
import java.util.Collections;

/*
 * Date: 2019. 03. 09
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : BubbleSort
 * description : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 를 오름차순과 내림차순으로 정렬하시오.
 * solution : 버블 정렬은 옆에 있는 값과 비교하여 더 작은 값을 앞으로 보내는 알고리즘. 시간복잡도 O(n^2). 정렬하다보면 최대값이 오른쪽에 있음.
              1, 10, 5, 8, 7, 6, 4, 3, 2, 9
              1, 10, 5, 8, 7, 6, 4, 3, 2, 9
              1, 5, 10, 8, 7, 6, 4, 3, 2, 9
              1, 5, 8, 10, 7, 6, 4, 3, 2, 9
              1, 5, 8, 7, 10, 6, 4, 3, 2, 9
              1, 5, 8, 7, 6, 10, 4, 3, 2, 9
              1, 5, 8, 7, 6, 4, 10, 3, 2, 9
              1, 5, 8, 7, 6, 4, 3, 10, 2, 9
              1, 5, 8, 7, 6, 4, 3, 2, 10, 9
              1, 5, 8, 7, 6, 4, 3, 2, 9, 10

 */
public class BubbleSort {
    static void swap(Integer[]a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void bubbleSort(Integer [] a){
        for(int i=a.length-1; i>=1; --i){
            boolean finish = true;

            for(int j=0; j<i; ++j){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    finish=false;
                }
            }
            if(finish==true) break;
        }
    }
    public static void main(String [] args){
        Integer array[]={1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        bubbleSort(array);
        System.out.println("오름차순 : "+ Arrays.toString(array));

        //Arrays는 내림차순을 지원하지 않는다. 따라서 List Collection으로 변경한 객체를 사용해야 한다.
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("내림차순 : " + Arrays.toString(array));
    }
}
