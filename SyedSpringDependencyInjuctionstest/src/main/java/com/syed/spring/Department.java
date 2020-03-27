package com.syed.spring;

public class Department {

	private int departmentId;
	private String departmentName;
	private String departmentVehicle;
	
	
	public String getDepartmentVehicle() {
		return departmentVehicle;
	}
	public void setDepartmentVehicle(String departmentVehicle) {
		this.departmentVehicle = departmentVehicle;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public Department() {
		super();

	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentVehicle=" + departmentVehicle + "]";
	}
	

	

	}


