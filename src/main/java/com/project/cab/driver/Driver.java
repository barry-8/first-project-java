package com.project.cab.driver;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver")

public class Driver {
	@Id
	private String id;
	private String driverName;
	private String gender;
	private int age;

	public Driver() {
		super();
	}

	public Driver(String id, String driverName, String gender, int age) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", driverName=" + driverName + ", gender=" + gender + ", age=" + age + "]";
	}

}