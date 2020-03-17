package com.cts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeBeanValid {
	
	@Min(value = 4,message = "eno must greater than 3")
	String eno;
	
	@Size(min=5,max=20,message="enter min 5 characters and max 20 characters")
	String name;
	
	@Min(value=20000 ,message = "Salary must be >20000")
	@Max(value = 50000,message = "Salary must be<50000")
	float salary;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "Must be of 6 char/digit")
	String postal_code;

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
	

}
