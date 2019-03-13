package sort;

import java.util.Arrays;

/*
 * Date: 2019. 03. 13
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title : String[] 배열 정렬을 구현하라.
 * description : SelectionSort, BubbleSort, InsertionSort로 구현하라.
 * solution : int 비교          if (a > b)
              String 객체 비교  if (a.compareTo(b) > 0)
 */
public class StringSort {
    //selectionSort
    public static String [] selectionSort(String [] s){ // 타입의 자유를 위해 Comparable[] 인터페이스 타입을 활용해도 좋다.
        // 가장 작은 수를 선택해서 맨 앞으로 옮긴다.
        for(int i=0; i<s.length-1; ++i){
            int minIndex = findMin(s,i); // 가장 작은 수의 인덱스를 찾는다.
            swap(s,i,minIndex); // swap
        }
        return s;
    }
    public static int findMin(String [] s, int i){
        String min = s[i];
        int minIndex=i;

        for(int j=i+1; j<s.length; ++j){
            if(s[j].compareTo(min)<0){
                min=s[j];
                minIndex=j;
            }
        }
        return minIndex;
    }
    //swap
    public static void swap(String[] swap, int i, int minIndex){
        String temp = swap[i];
        swap[i] = swap[minIndex];
        swap[minIndex] = temp;
    }

    // bubbleSort
    public static String [] bubbleSort(String [] b){
        // 옆에 있는 값과 비교하여 정렬.
        for(int i = b.length-1; i>=1; --i){ // 마지막은 안해도 됨.
            boolean 완료= true;

            for(int j=0; j<i; ++j){
                if(b[j].compareTo(b[j+1])>0){
                    swap(b,j,j+1);
                    완료 = false;
                }
            }
            if(완료==true) break;
        }
        return b;
    }

    // insertionSort
    public static String [] insertionSort(String [] i){
        // 적절한 위치에 삽입하는 알고리즘
        for(int j=1; j<i.length; ++j){ // 두번째 원소부터 시작.
            String value = i[j]; // 삽입할 값을 임시 보관.
            int k;
            for( k=j-1; k>=0; --k){
                if(i[k].compareTo(value)>0){
                    i[k+1] = i[k]; // 자리 뒤로 옮겨서 만들어줌.
                }else
                    break;
            }
            i[k+1] = value;// 삽입
        }
        return i;
    }
    public static void main(String[] args){
        String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
        System.out.println("selectionSort : " + Arrays.toString(selectionSort(a)));
        System.out.println("bubbleSort : "+ Arrays.toString(bubbleSort(a)));
        System.out.println("insertionSort : "+ Arrays.toString(insertionSort(a)));

    }

}
