package com.naveen.model;

public class Passanger {
	
	private String name;
	private byte age;
	private String gender;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	public Passanger(String name, byte age, String gender, int id) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
