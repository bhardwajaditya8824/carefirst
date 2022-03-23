package Adapter;

import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.CodeQRAmount;
import com.springboot.carefirst.model.Order;
import com.springboot.carefirst.repository.ClientRepository;

public class CodeDiscount {

	private ClientRepository clientRepository;
	private Client client;
	Order order;

	public CodeDiscount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CodeDiscount(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	private void setCustomer(long customerId) {
		client = this.clientRepository.getById(customerId);
	}

	public double codeToAmount(String code) {
		return new CodeQRAmount().amountAssociated(code);
	}

	public void redeemAmount(double amount) {
		Double Balance = order.getCartPrice() - amount;
		order.setCartPrice(Balance);
	}

}
