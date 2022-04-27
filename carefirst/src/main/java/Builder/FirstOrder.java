package Builder;

import javax.persistence.Column;

public class FirstOrder {

	private Long firstappointmentId;

	
	private Long clientId;

	private int cartId;

	private int finalCost;
	private long discount;
	
	public FirstOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FirstOrder(Long firstappointmentId, Long clientId, int cartId, int finalCost, long discount) {
		super();
		this.firstappointmentId = firstappointmentId;
		this.clientId = clientId;
		this.cartId = cartId;
		this.finalCost = finalCost;
		this.discount = discount;
	}

	public Long getFirstappointmentId() {
		return firstappointmentId;
	}

	public void setFirstappointmentId(Long firstappointmentId) {
		this.firstappointmentId = firstappointmentId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}

	public long getDiscount() {
		return discount;
	}

	public void setDiscount(long discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FirstOrder [firstappointmentId=" + firstappointmentId + ", clientId=" + clientId + ", cartId=" + cartId
				+ ", finalCost=" + finalCost + ", discount=" + discount + "]";
	}
	
	
	

}