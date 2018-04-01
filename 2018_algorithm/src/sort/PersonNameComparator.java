package sort;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);//먼저 이름(name)을 비교한다.
		if(r!=0) return r;//이름이 같지 않다면, 이름 비교 결과 리턴
		return p1.age-p2.age;//이름이 같다면, 나이 비교 결과 리턴
	}
}
