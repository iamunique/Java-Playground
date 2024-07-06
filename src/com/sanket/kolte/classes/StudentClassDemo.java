package com.sanket.kolte.classes;

public class StudentClassDemo { // Student Class
	String name;
	int age;
	String address;

	public StudentClassDemo(String name, int age, String address) { //Constructor
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return ("Student name is " + this.getName() + " and age is " + this.getAge() + " and address is "
				+ this.getAddress());
	}

	public static void main(String[] args) {
		StudentClassDemo sanket = new StudentClassDemo("Sanket", 25, "Malkapur");
		System.out.println(sanket.toString());
	}

}
