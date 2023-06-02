package com.yedam.object;

class Person {
	private String name;
	private int age;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setAge(int age) {
		if (age < 0) {
			this.age = 10;
		} else {
			this.age = age;
		}
	}

	int getAge() {
		return this.age;
	}
}

public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.name = "홍길동";
		p1.setName("홍길동");
//		p1.age = 20;
//		p1.age = -20;
		p1.setAge(-20);
		System.out.println(p1.getName() + ", " + p1.getAge());
	}
}
