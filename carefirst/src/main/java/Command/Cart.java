package Command;

//Receiver
public class Cart {
	
	String name;
	
	public Cart(String name)
	{
		this.name=name;
	}
	
	public void addToCart()
	{
		System.out.println("Added To Cart");
	}
	
	public void removeFromCart()
	{
		System.out.println("Remove To Cart");
	}
	
	

}
