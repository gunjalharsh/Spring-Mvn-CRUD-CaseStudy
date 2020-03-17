package com.cts;

public class EmployeeBean {
	int eno;
	String name;
	float salary;
	String Phone;
	String DeleteEmployee;
	String UpdateEmployee;
	String PhoneUpdate;
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getDeleteEmployee() {
		return DeleteEmployee;
	}
	public void setDeleteEmployee(String deleteEmployee) {
		DeleteEmployee = deleteEmployee;
	}
	public String getUpdateEmployee() {
		return UpdateEmployee;
	}
	public void setUpdateEmployee(String updateEmployee) {
		UpdateEmployee = updateEmployee;
	}
	public String getPhoneUpdate() {
		return PhoneUpdate;
	}
	public void setPhoneUpdate(String phoneUpdate) {
		PhoneUpdate = phoneUpdate;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
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
	

}
