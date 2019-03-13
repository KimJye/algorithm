package sort;

import java.util.Arrays;
import java.util.Collections;

/*
 * Date: 2019. 03. 13
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : InsertionSort
 * description : 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 를 오름차순과 내림차순으로 정렬하시오.
 * solution : 삽입 정렬은 적절한 위치에 숫자를 삽입하는 알고리즘.
                 배열의 0 에서 배열길이-1 사이에서 value(인덱스1값) 보다 큰 값들을 뒤로 한 칸씩 이동하고, 그 값들 앞에 value를 넣는다

              11, 10, 5, 8, 7, 6, 4, 3, 2, 9
              1, 10, 5, 8, 7, 6, 4, 3, 2, 9
              1, 5, 10, 8, 7, 6, 4, 3, 2, 9
              1, 5, 8, 10, 7, 6, 4, 3, 2, 9
              1, 5, 7, 8, 10, 6, 4, 3, 2, 9
              1, 5, 6, 7, 8, 10, 4, 3, 2, 9
              1, 4, 5, 6, 7, 8, 10, 3, 2, 9
              1, 3, 4, 5, 6, 7, 8, 10, 2, 9
              1, 2, 3, 4, 5, 6, 7, 8, 10, 9
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10

 */
public class InsertionSort {
    public static void insertionSort(Integer [] array){
        for(int i=1; i<array.length; ++i){ // 두번째 원소부터 시작한다.
            int value = array[i];
            int j;
            for( j=i-1; j>=0; --j){ // 자신보다 앞쪽의 원소들을 다 훑어본다.
                if(array[j]>value){ //value값보다 큰 값들을 뒤로 한 칸씩 이동한다.
                    array[j+1]=array[j];
                }else{
                    break; // 정렬이 되어있으면 이동할 필요가 없다.
                }
            }
            array[j+1]=value;
        }
    }
    public static void main(String[] args){
        Integer array[]={1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        insertionSort(array);
        System.out.println("오름차순 : "+ Arrays.toString(array));

        //Arrays는 내림차순을 지원하지 않는다. 따라서 List Collection으로 변경한 객체를 사용해야 한다.
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("내림차순 : " + Arrays.toString(array));
    }
}
