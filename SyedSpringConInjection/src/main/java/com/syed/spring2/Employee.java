package com.syed.spring2;

public class Employee {
	@Override
	public String toString() {
		return "Employee [emplyeeId=" + emplyeeId + ", employeeName=" + employeeName + "]";
	}

	private int emplyeeId;
	private String employeeName;
	
	public Employee() {
		super();
		
	}

		public Employee(int emplyeeId, String employeeName) {
		super();
		this.emplyeeId = emplyeeId;
		this.employeeName = employeeName;
	}
	
	

	
		
	
	

}
