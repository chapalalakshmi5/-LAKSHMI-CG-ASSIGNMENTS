package com.springcore;

public class Customer {
	private int customerid;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	public Customer(int customerid, String customerName, int customerContact, Address customerAddress) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

  @Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	

}
