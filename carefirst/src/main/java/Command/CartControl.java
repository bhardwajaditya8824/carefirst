package Command;

//Invoker 
public class CartControl {
	Command command;
	
	public CartControl() {
		
	}
	
	public void setCommand(Command command)
	{
		this.command=command;
	}
	
	public void actionSelected() {
		command.execute();
	}

}
