package entity;

public class Order {

	KeyChain key;
	Integer nrOfKeyChains;
	
	
	public KeyChain getKey() {
		return key;
	}


	public void setKey(KeyChain key) {
		this.key = key;
	}


	public Integer getNrOfKeyChains() {
		return nrOfKeyChains;
	}


	public void setNrOfKeyChains(Integer nrOfKeyChains) {
		this.nrOfKeyChains = nrOfKeyChains;
	}

	@Override
	public String toString() {
		return "Number of keychains in your order: "+nrOfKeyChains+""
				+ " price for each keychain is: "+key.getPrice()+"$";
	}

	
	
	
	
}
