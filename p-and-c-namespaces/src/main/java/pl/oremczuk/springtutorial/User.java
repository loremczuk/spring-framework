package pl.oremczuk.springtutorial;

import java.util.Locale;

public class User {

	private String name;
	private int age;
	private Locale locale;

	public User(String name, int age, Locale locale) {
		super();
		this.name = name;
		this.age = age;
		this.locale = locale;
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

}
