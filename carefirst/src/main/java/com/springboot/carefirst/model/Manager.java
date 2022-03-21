package com.springboot.carefirst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class Manager {
	
	@Id
	@Column(name = "manager_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long managerId;

	@Column(name = "manager_name")
	private String managerName;

	@Column(name = "manager_email")
	private String managerEmail;

	@Column(name = "manager_dob")
	private String managerDob;

	@Column(name = "manager_contact_no")
	private String managerContactNo;

	@Column(name = "address_id")
	private int addressId;

	@Column(name = "login_id")
	private int loginId;

	public Manager() {
		super();
	}

	public Manager(Long managerId, String managerName, String managerEmail, String managerDob, String managerContactNo,
			int addressId, int loginId) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.managerDob = managerDob;
		this.managerContactNo = managerContactNo;
		this.addressId = addressId;
		this.loginId = loginId;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerDob() {
		return managerDob;
	}

	public void setManagerDob(String managerDob) {
		this.managerDob = managerDob;
	}

	public String getManagerContactNo() {
		return managerContactNo;
	}

	public void setManagerContactNo(String managerContactNo) {
		this.managerContactNo = managerContactNo;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerEmail=" + managerEmail
				+ ", managerDob=" + managerDob + ", managerContactNo=" + managerContactNo + ", addressId=" + addressId
				+ ", loginId=" + loginId + "]";
	}


}
