package com.hrms.service.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeJson {
	@Id
	private int id;
	private String name;
	private String role;
	private String designation;
	private String mailId;
	private String phoneNumber;
	private String address;
	
	
	
	public EmployeeJson(int id, String name, String role, String designation, String mailId, String phoneNumber,String address) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.designation = designation;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", role=" + role + ", designation=" + designation + ", mailId="
				+ mailId + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
}
