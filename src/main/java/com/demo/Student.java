package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="student")
public class Student {
	@Id
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String city;
	private String address;
	private String password;

	public Student(int id, int age, String firstName, String lastName, String city, String address, String password) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.address = address;
		this.password = password;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + ", address=" + address + ", password=" + password + "]";
	}

}