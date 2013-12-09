package me.agilani.www;

public class Tea extends AbstractDrink {

	public Tea(IAdditives additive) {
		super(additive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void make() {
		System.out.print("Tea with ");
		additive.add();
	}

}
