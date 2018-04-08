package sort;

import java.lang.String;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((obj instanceof Person)==false) return false;
		
		Person p = (Person)obj;
		
		return (this.name==null?p.name==null:this.name.equals(p.name))&& this.age==age;
	}
	
	@Override
	public String toString() {
		return String.format("Person{name=\"%s\",age=%d}",name,age);
	}

}
