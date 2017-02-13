package main;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Balance;
import entity.Client;
import entity.KeyChain;
import entity.Order;
import menu.Menu;

public class App {
	KeyChain key = new KeyChain();
	Order currentOrder = new Order();
	Scanner s = new Scanner(System.in);
	ArrayList<Client> clients = new ArrayList<Client>();
	Integer amount;
	boolean runningApp = true;
	
	//starting application
	public void run() {
		
		initUser();
		
		Menu m = new Menu();
		// m.displayMenu();

		while (runningApp) {
			m.displayMenu();
			Integer opt = s.nextInt();

			switch (opt) {
			case 1: // adding keychains to the order
				System.out.println("How many keychains you want to add to your order ?");
				amount = s.nextInt();
				addKeyChains(amount);
				break;
			case 2: // adjunsting the products in the current order
				System.out.println("How many keychains you want to adjust from your order ?");
				amount = s.nextInt();
				adjustCurrentOrder(amount);
				break;
			case 3: // display current order untill now
				displayCurrentOrder();
				break;
			case 4:// checkout
				checkout();
				runningApp = false;
				break;
			default:
				System.out.println("Wrong input, please try again!");

			}// end switch

		}//end while
	}
	
	
	// adding keychains to the order
	public void addKeyChains(Integer amount) {
		// Integer number = s.nextInt();
		this.getCurrentUser().setOrder(currentOrder);
		currentOrder.setKey(key);
		currentOrder.setNrOfKeyChains(amount);
		System.out.println(this.getCurrentUser().getOrder());
	}

	// adjusting the current order
	public void adjustCurrentOrder(Integer amount) {
		Integer currentO = currentOrder.getNrOfKeyChains();
		this.currentOrder.setNrOfKeyChains(currentO - amount);
		System.out.println("Your current order is right now: " + this.currentOrder.getNrOfKeyChains());
		}

	//display currentOrder
	public void displayCurrentOrder() {
		System.out.println("Current order is: ");
		System.out.println(this.getCurrentUser().getOrder().getNrOfKeyChains());
	}
	//checking out and showing current balance
	public void checkout(){
		System.out.println("Thank you for buying from us!!\n"
				 + "	"+this.getCurrentUser().getName()+"\n"
						+ "Have a nice day!!!");
		calculateTotalCost();
	}

	// first client created
	public void initUser() {
		Client c = new Client();
		Balance b = new Balance();
		System.out.println("Please enter your fullname. ");
		String fullname = s.nextLine();
		c.setName(fullname);
		System.out.println("Enter your initial account balance.");
		Integer initialBalance = s.nextInt();
		c.setBalance(b);
		c.getBalance().setAmount(initialBalance);
		clients.add(c);

	}

	// getting current user
	public Client getCurrentUser() {
		return this.clients.get(0);
	}
	
	//calculate the client's balance at the end 
	public void calculateTotalCost(){
		
	Integer finalOrder	= this.currentOrder.getNrOfKeyChains();
	Integer initialBalance = this.getCurrentUser().getBalance().getAmount();
	Integer totalOrderCost = this.currentOrder.getKey().getPrice()*finalOrder;
	Integer totalLeft = initialBalance -totalOrderCost;
	this.getCurrentUser().getBalance().setAmount(totalLeft);
	System.out.println("Yout balance is : "+this.getCurrentUser().getBalance().getAmount()+"$");
		
	}

}
