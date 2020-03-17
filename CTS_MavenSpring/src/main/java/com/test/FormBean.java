package com.test;

import java.util.List;
//spring MVC Bean Tag
public class FormBean {
	
	String country;//select
	List<String> f_hobbies;//checkbox
	String name;
	String gender;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getF_hobbies() {
		return f_hobbies;
	}
	public void setF_hobbies(List<String> f_hobbies) {
		this.f_hobbies = f_hobbies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
