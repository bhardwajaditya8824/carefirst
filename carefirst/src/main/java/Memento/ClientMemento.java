package Memento;

//Memento
public class ClientMemento {

	private Long clientId;

	private String clientFName;

	private String clientSName;

	private String clientEmail;

	private String clientDob;

	private long clientAddressId;

	private String clientAbt;

	private String clientNumber;

	private int clientLoginId;

	public ClientMemento(Long clientId, String clientFName, String clientSName, String clientEmail, String clientDob,
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

	public Long getClientId() {
		return clientId;
	}

	public String getClientFName() {
		return clientFName;
	}

	public String getClientSName() {
		return clientSName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public String getClientDob() {
		return clientDob;
	}

	public long getClientAddressId() {
		return clientAddressId;
	}

	public String getClientAbt() {
		return clientAbt;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public int getClientLoginId() {
		return clientLoginId;
	}

	@Override
	public String toString() {
		return "ClientMemento [clientId=" + clientId + ", clientFName=" + clientFName + ", clientSName=" + clientSName
				+ ", clientEmail=" + clientEmail + ", clientDob=" + clientDob + ", clientAddressId=" + clientAddressId
				+ ", clientAbt=" + clientAbt + ", clientNumber=" + clientNumber + ", clientLoginId=" + clientLoginId
				+ "]";
	}
	
	

}
