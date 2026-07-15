package iuc.zhaocc.po;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-15
 */
public class Person {
	private String name;
	private Integer age;

	public Person() {
		System.out.println("我被创建了");
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
