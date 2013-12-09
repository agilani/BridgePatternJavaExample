package me.agilani.www;

public class Coffee extends AbstractDrink {

	public Coffee(IAdditives additive) {
		super(additive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		System.out.print("Coffee with ");
		additive.add();

	}

}
