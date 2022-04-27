package Adapter;

import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.Order;
import com.springboot.carefirst.model.CodeQRAmount;
import com.springboot.carefirst.repository.ClientRepository;
//Adaptee
public class QRDiscount {

	private ClientRepository clientRepository;
	private Client client;
	Order order;

	
	public QRDiscount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QRDiscount(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	private void setCustomer(long customerId) {
		client = this.clientRepository.getById(customerId);
	}
	
	public double qrToAmount(int binary) {
		
		return new CodeQRAmount().amountAssociated(binary);
		
		
	}
//specific request
	public void redeemamount(double amount) {
		Double Balance = order.getCartPrice() - amount;
		order.setCartPrice(Balance);
	}

}
