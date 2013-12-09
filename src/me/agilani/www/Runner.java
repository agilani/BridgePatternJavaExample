package me.agilani.www;

public class Runner {

	public Runner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDrink drink1 = new Coffee(new Cream());
		drink1.make();
		
		System.out.println("\r\n");
		
		AbstractDrink drink2 = new Tea(new Milk());
		drink2.make();
		
		System.gc();
		
		System.out.println("\r\n");
	}

}
