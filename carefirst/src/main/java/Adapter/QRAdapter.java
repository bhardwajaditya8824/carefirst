package Adapter;

import com.springboot.carefirst.model.Discount;
import com.springboot.carefirst.repository.OrderRepository;

public class QRAdapter implements IDiscount {
	
	private int cost;

	private OrderRepository orderRepository;

	public QRAdapter(int cost) {
		super();
		// TODO Auto-generated constructor stub
		
		this.cost=cost;
	}

	@Override
	public void retrieve(Discount discount) {
		QRDiscount dis = new QRDiscount();

		double amount = dis.qrToAmount(discount.getBinary());

		dis.redeemamount(amount);
		
		

	}

}
