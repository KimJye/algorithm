package sort;

import java.util.Objects;
/*
 * Date: 2019. 03. 16
 * Author: KimJye | https://github.com/KimJye
 * Solution URL: https://github.com/KimJye/algorithm
 * Title :  Person[] 배열 정렬을 구현하라.
 * description : SelectionSort, BubbleSort, InsertionSort로 구현하라.
 * solution : Comparable 인터페이스로 구현하기
 */
public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {         this.name = name;         this.age = age;     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (this.name == null ? person.name == null : this.name.equals(person.name)) && this.age == person.age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p){
        int r = this.name.compareTo(p.name);  // 먼저 이름(name)을 비교한다.
        if (r != 0) return r;                 // 이름이 같지 않다면, 이름 비교 결과를 리턴한다.
        return this.age - p.age;              // 이름이 같다면, 나이(age) 비교 결과를 리턴한다

    }
}
