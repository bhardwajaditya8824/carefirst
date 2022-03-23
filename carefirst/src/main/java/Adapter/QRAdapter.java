package Adapter;

import com.springboot.carefirst.model.Discount;
import com.springboot.carefirst.repository.OrderRepository;

public class QRAdapter implements IDiscount {

	private OrderRepository orderRepository;

	public QRAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retrieve(Discount discount) {
		QRDiscount dis = new QRDiscount();

		double amount = dis.qrToAmount(discount.getBinary());

		dis.redeemamount(amount);

	}

}
