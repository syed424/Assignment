package com.syed.spring.Autowired;

public class Employee {
	private int emplyeeId;
	private String employeeName;
	private String address;
	private Department department;
	
	
	
	
@Override
public String toString() {
	return "Employee [emplyeeId=" + emplyeeId + ", employeeName=" + employeeName + ", address=" + address
			+ ", department=" + department + "]";
}
	public Employee() {
		super();
	
	}
	public Employee(int emplyeeId, String employeeName, String address, Department department) {
		super();
		this.emplyeeId = emplyeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
		
	
	

}
