package sort;

import java.util.Comparator;

/*
 * Date: 2019. 03. 16
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  Person[] 배열 정렬을 구현하라.
 * description : SelectionSort, BubbleSort, InsertionSort로 구현하라.
 * solution : Comparator 인터페이스로 구현하기.
 */
public class PersonNameAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        int r = p1.name.compareTo(p2.name);  // 먼저 이름(name)을 비교한다.
        if (r != 0) return r;                // 이름이 같지 않다면, 이름 비교 결과를 리턴한다.
        return p1.age - p2.age;              // 이름이 같다면, 나이(age) 비교 결과를 리턴한다.
    }
}
