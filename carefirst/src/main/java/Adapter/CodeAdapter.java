package Adapter;

import com.springboot.carefirst.model.Discount;

public class CodeAdapter implements IDiscount {

	@Override
	public void retrieve(Discount discount) {
		// TODO Auto-generated method stub

		CodeDiscount dis = new CodeDiscount();

		double amount = dis.codeToAmount(discount.getCode());

		dis.redeemAmount(amount);

	}

}
