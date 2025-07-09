package com.lab.source.po;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2025-07-02 23:53
 */
public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("person constructor");
	}


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
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
