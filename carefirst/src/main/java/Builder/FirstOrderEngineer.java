package Builder;

public class FirstOrderEngineer {
	private FirstOrderBuilder firstOrderBuilder;

	public FirstOrderEngineer(FirstOrderBuilder firstOrderBuilder) {
		this.firstOrderBuilder = firstOrderBuilder;
	}

	public FirstOrder assignFirstTimeAppointment() {
		this.firstOrderBuilder.buildCartId();
		this.firstOrderBuilder.buildCost();
		this.firstOrderBuilder.buildDiscount();
		this.firstOrderBuilder.buildClientId();
		return this.firstOrderBuilder.getFirstOrder();
	}

}
