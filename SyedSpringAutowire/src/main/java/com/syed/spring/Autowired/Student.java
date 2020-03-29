package com.syed.spring.Autowired;

public class Student {
	
	private int studentId;
	private String studentName ;
	private Address address;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	public Student() {
		super();
	}
	
	
	public  void populateAddress(int addressId, String addressName, int zipcode){
		
		Address address = new Address(addressId, addressName, zipcode);
		setAddress(address);
	}

}
