package sort;

import java.util.Arrays;
import java.util.Collections;

/*
 * Date: 2019. 03. 04
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : SelectionSort
 * description : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 를 오름차순과 내림차순으로 정렬하시오.
 * solution : 선택 정렬은 가장 작은 것을 선택해서 맨 앞으로 보내는 알고리즘.
              1, 10, 5, 8, 7, 6, 4, 3, 2, 9
              1, 2, 5, 8, 7, 6, 4, 3, 10, 9
              1, 2, 3, 8, 7, 6, 4, 5, 10, 9
              1, 2, 3, 4, 7, 6, 8, 5, 10, 9
              1, 2, 3, 4, 5, 6, 8, 7, 10, 9
              1, 2, 3, 4, 5, 6, 7, 8, 10. 9
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 */
public class SelectionSort {

    public static void selectionSort(Integer[] arr){
        for(int i=0; i< arr.length-1; ++i){
            int minIndex = findMin(arr,i);// 배열 arr의 i위치부터 끝까지중에서 가장 작은 값의 인덱스를 찾아서
            swap(arr,i,minIndex); // 그 인덱스와 i의 위치를 바꾼다.
        }
    }
    public static int findMin(Integer [] arr, int start){
        int min = arr[start]; // 처음 min값을 배열 arr의 첫인덱스 값으로 한다.
        int minIndex=start; // min의 index값을 배열 arr의 첫인덱스로 한다.

        for(int i=start+1; i<arr.length; ++i){ //arr[0]을 min으로 해서 arr[1]부터 비교.
            if(min>arr[i]){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static void swap(Integer [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        Integer array[]={1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        selectionSort(array);
        System.out.println("오름차순 : "+ Arrays.toString(array));

        //Arrays는 내림차순을 지원하지 않는다. 따라서 List Collection으로 변경한 객체를 사용해야 한다.
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("내림차순 : " + Arrays.toString(array));
    }
}
