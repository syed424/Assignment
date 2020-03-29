package com.syed.spring.Autowired;

public class Address {

	private int addressId;
	private String addressName ;
	private int Zipcode;
	
	
	
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
	
	public Address() {
		super();
	}
	
		public Address(int addressId, String addressName, int zipcode) {
		super();
		this.addressId = addressId;
		this.addressName = addressName;
		this.Zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressName=" + addressName + ", Zipcode=" + Zipcode + "]";
	}

}
