package Builder;

import com.springboot.carefirst.model.Client;
import com.springboot.carefirst.model.Discount;

import Adapter.IDiscount;

public class ConcreteFirstOrderBuilder implements FirstOrderBuilder {
	
	Client client;
	IDiscount dis;
	Discount discount;

	private FirstOrder firstOrder;

	public ConcreteFirstOrderBuilder() {
		this.firstOrder = new FirstOrder();
	}

	public ConcreteFirstOrderBuilder(Client client, Discount discount) {
		this.firstOrder = new FirstOrder();
		this.client=client;
		this.discount=discount;
	}

	@Override
	public void buildClientId() {
		firstOrder.setClientId(client.getClientId());
		
	}

	@Override
	public void buildCartId() {
		firstOrder.setCartId(firstOrder.getCartId());
		
	}

	@Override
	public void buildDiscount() {
		// TODO Auto-generated method stub
		firstOrder.setDiscount(discount.getDiscountId());
		
	}

	@Override
	public void buildCost() {
		// TODO Auto-generated method stub
		firstOrder.setFinalCost(125);
		
	}

	@Override
	public FirstOrder getFirstOrder() {
		// TODO Auto-generated method stub
		return this.firstOrder;
	}

}
