package entity;

public class KeyChain {
	
	String model;
	Integer price = 10;
	
	
	public KeyChain(){
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Price for each keychains is: "+price;
	}

	

	

}
