package com.springboot.carefirst.model;

public class Registration {

	private String FName;

	private String SName;

	private String Email;

	private String Dob; // string or int in format YYYYMMDD?

	private String Abt;

	private String Number; // (max 31)

	private int username; // (max 31)

	private String password;

	private String addrFirLine;

	private String addrSecLine;

	private String city;

	private String county;

	private String eircode;

	public Registration() {
		super();
	}

	public Registration(String fName, String sName, String email, String dob, String abt, String number, int username,
			String password, String addrFirLine, String addrSecLine, String city, String county, String eircode) {
		super();
		FName = fName;
		SName = sName;
		Email = email;
		Dob = dob;
		Abt = abt;
		Number = number;
		this.username = username;
		this.password = password;
		this.addrFirLine = addrFirLine;
		this.addrSecLine = addrSecLine;
		this.city = city;
		this.county = county;
		this.eircode = eircode;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getAbt() {
		return Abt;
	}

	public void setAbt(String abt) {
		Abt = abt;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddrFirLine() {
		return addrFirLine;
	}

	public void setAddrFirLine(String addrFirLine) {
		this.addrFirLine = addrFirLine;
	}

	public String getAddrSecLine() {
		return addrSecLine;
	}

	public void setAddrSecLine(String addrSecLine) {
		this.addrSecLine = addrSecLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getEircode() {
		return eircode;
	}

	public void setEircode(String eircode) {
		this.eircode = eircode;
	}

	@Override
	public String toString() {
		return "Registration [FName=" + FName + ", SName=" + SName + ", Email=" + Email + ", Dob=" + Dob + ", Abt="
				+ Abt + ", Number=" + Number + ", username=" + username + ", password=" + password + ", addrFirLine="
				+ addrFirLine + ", addrSecLine=" + addrSecLine + ", city=" + city + ", county=" + county + ", eircode="
				+ eircode + "]";
	}

}
