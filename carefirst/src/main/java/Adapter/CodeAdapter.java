package Adapter;

import com.springboot.carefirst.model.Discount;

//Adapter
public class CodeAdapter implements IDiscount {
	
	private int cost;
	
	public CodeAdapter(int cost )
	{
		this.cost=cost;
	}

	@Override
	public void retrieve(Discount discount) {
		// TODO Auto-generated method stub

		CodeDiscount dis = new CodeDiscount();
		
		if(discount.getCode()=="12")
		{
			
			dis.redeemAmount(cost);
		}
		else {
			
			

			double amount = dis.codeToAmount(discount.getCode());
			dis.redeemAmount(amount);
		}



	}

}
