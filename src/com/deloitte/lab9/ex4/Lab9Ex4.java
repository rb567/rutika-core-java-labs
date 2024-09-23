package com.deloitte.lab9.ex4;

// Simple class with attributes and getters/setters
class Person {
	private String name;
	private int age;

	public Person() {
		this.name = "Default Name";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

interface PersonFactory {
	Person createPerson(String name, int age);
}

public class Lab9Ex4 {
	public static void main(String[] args) {
		// Using method reference to create a new Person instance
		PersonFactory personFactory = Person::new;

		// Create a Person object
		Person person = personFactory.createPerson("John Doe", 30);
		System.out.println(person); // Output: Person [name=John Doe, age=30]
	}
}
