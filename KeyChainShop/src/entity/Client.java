package entity;

public class Client {

	private String name;
	private Balance balance;
	private Order order;


	public Client() {

	}

	public Client(String name, Integer balance,Order order) {
		this.name = name;
		this.order = order;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}

	

}
