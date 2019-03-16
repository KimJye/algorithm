package sort;

import java.util.Arrays;
/*
 * Date: 2019. 03. 16
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  Person[] 배열 정렬을 구현하라.
 * description : SelectionSort, BubbleSort, InsertionSort로 구현하라.
 * solution : Comparable 인터페이스로 구현하기
 */
public class InstanceArraySort {
    //selectionSort
    public static Comparable [] selectionSort(Comparable [] s){ // 타입의 자유를 위해 Comparable[] 인터페이스 타입을 활용해도 좋다.
        // 가장 작은 수를 선택해서 맨 앞으로 옮긴다.
        for(int i=0; i<s.length-1; ++i){
            int minIndex = findMin(s,i); // 가장 작은 수의 인덱스를 찾는다.
            swap(s,i,minIndex); // swap
        }
        return s;
    }
    public static int findMin(Comparable [] s, int i){
        Comparable min = s[i];
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
    public static void swap(Comparable [] swap, int i, int minIndex){
        Comparable temp = swap[i];
        swap[i] = swap[minIndex];
        swap[minIndex] = temp;
    }

    // bubbleSort
    public static Comparable [] bubbleSort(Comparable [] b){
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
    public static Comparable []insertionSort(Comparable [] i){
        // 적절한 위치에 삽입하는 알고리즘
        for(int j=1; j<i.length; ++j){ // 두번째 원소부터 시작.
            Comparable value = i[j]; // 삽입할 값을 임시 보관.
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
        Person[] a = new Person[] {
                new Person("홍길동", 18),
                new Person("이꺽정", 22),
                new Person("이꺽정", 17),
                new Person("전우치", 23),
                new Person("심청", 16),
                new Person("연흥부", 38)
        };

        System.out.println("selectionSort : " + Arrays.toString(selectionSort(a)));
        System.out.println("bubbleSort : "+ Arrays.toString(bubbleSort(a)));
        System.out.println("insertionSort : "+ Arrays.toString(insertionSort(a)));

    }
}
