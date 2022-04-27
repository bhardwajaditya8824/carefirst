package Command;

//Concrete Command
public class AddToCartCommand implements Command{
	
	Cart cart;
	
	public AddToCartCommand(Cart cart)
	{
		this.cart=cart;
	}

	@Override
	public void execute() {
		cart.addToCart();
		
	}

}
