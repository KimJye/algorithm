package sort;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);//���� �̸�(name)�� ���Ѵ�.
		if(r!=0) return r;//�̸��� ���� �ʴٸ�, �̸� �� ��� ����
		return p1.age-p2.age;//�̸��� ���ٸ�, ���� �� ��� ����
	}
}
