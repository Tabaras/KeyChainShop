package entity;

public class Balance {

	
	Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Balance : +amount";
	}
	

	
	
}
