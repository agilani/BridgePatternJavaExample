package me.agilani.www;

public abstract class AbstractDrink {
	
	IAdditives additive;
	
	public AbstractDrink(IAdditives additive)
	{
		this.additive = additive;
	}
	
	public abstract void make();

}
