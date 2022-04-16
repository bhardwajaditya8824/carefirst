package Builder;

public interface FirstOrderBuilder {

	void buildClientId();

	void buildCartId();

	void buildDiscount();

	void buildCost();

	FirstOrder getFirstOrder();

}
