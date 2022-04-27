package Command;

//Concrete Command
public class RemoveFromCartCommand implements Command{
	
	Cart cart;
	
	public RemoveFromCartCommand(Cart cart)
	{
		this.cart=cart;
	}

	@Override
	public void execute() {
		cart.removeFromCart();
		
	}

}
