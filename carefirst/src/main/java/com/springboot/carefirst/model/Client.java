package com.springboot.carefirst.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import Memento.ClientMemento;

//javax = loose coupling 
@Entity //this class is a table
@Table(name = "cli") //access : wecare.cli
//Originator
public class Client {

	@Id //next thing will be a primary key
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientId;

	@Column(name = "client_Fname") //first name / surname
	private String clientFName;
	
	@Column(name = "client_Sname")
	private String clientSName;
	
	@Column(name = "client_email")
	private String clientEmail;
	
	@Column(name = "client_dob")
	private String clientDob; //string or int in format YYYYMMDD?  

	@Column(name = "client_address_id")
	private long clientAddressId;
	
	@Column(name = "client_about")
	private String clientAbt; 
	
	@Column(name = "client_contact_no")
	private String clientNumber; //(max 31)
	
	@Column(name = "client_login_id")
	private int clientLoginId; //(max 31)
	
	public Client() {
		super();
	}

	public Long getClientId() {
		return clientId;
	}

	public Client(Long clientId, String clientFName, String clientSName, String clientEmail, String clientDob,
			long clientAddressId, String clientAbt, String clientNumber, int clientLoginId) {
		super();
		this.clientId = clientId;
		this.clientFName = clientFName;
		this.clientSName = clientSName;
		this.clientEmail = clientEmail;
		this.clientDob = clientDob;
		this.clientAddressId = clientAddressId;
		this.clientAbt = clientAbt;
		this.clientNumber = clientNumber;
		this.clientLoginId = clientLoginId;
	}

	public String getClientFName() {
		return clientFName;
	}

	public void setClientFName(String clientFName) {
		this.clientFName = clientFName;
	}

	public String getClientSName() {
		return clientSName;
	}

	public void setClientSName(String clientSName) {
		this.clientSName = clientSName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientDob() {
		return clientDob;
	}

	public void setClientDob(String clientDob) {
		this.clientDob = clientDob;
	}

	public long getClientAddressId() {
		return clientAddressId;
	}

	public void setClientAddressId(long clientAddressId) {
		this.clientAddressId = clientAddressId;
	}

	public String getClientAbt() {
		return clientAbt;
	}

	public void setClientAbt(String clientAbt) {
		this.clientAbt = clientAbt;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public int getClientLoginId() {
		return clientLoginId;
	}

	public void setClientLoginId(int clientLoginId) {
		this.clientLoginId = clientLoginId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	
	 public ClientMemento saveToMemento() {
		 ClientMemento clientMemento=new ClientMemento(this.clientId,this.clientFName,this.clientSName,this.clientEmail,this.clientDob,this.clientAddressId ,this.clientAbt,this.clientNumber,this.clientLoginId );
	        return clientMemento;
	    }
	    public  void undoFromMemento(ClientMemento memento)
	    {
	    	this.clientId = memento.getClientId();
			this.clientFName = memento.getClientFName();
			this.clientSName = memento.getClientSName();
			this.clientEmail = memento.getClientEmail();
			this.clientDob = memento.getClientDob();
			this.clientAddressId = memento.getClientAddressId();
			this.clientAbt = memento.getClientAbt();
			this.clientNumber = memento.getClientNumber();
			this.clientLoginId = memento.getClientLoginId();
	    }

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientFName=" + clientFName + ", clientSName=" + clientSName
				+ ", clientEmail=" + clientEmail + ", clientDob=" + clientDob + ", clientAddressId=" + clientAddressId
				+ ", clientAbt=" + clientAbt + ", clientNumber=" + clientNumber + ", clientLoginId=" + clientLoginId
				+ "]";
	}

	
	
}
