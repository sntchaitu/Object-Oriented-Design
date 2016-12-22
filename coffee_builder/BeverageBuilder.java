package coffee_builder;

public abstract class BeverageBuilder {
	private Beverage beverage;

	public Beverage getBeverage() {
		return beverage;
	}

	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	public final Beverage buildBeverage()
	{
		beverage = createBeverage();
		setBeverage(beverage);
		setBeverageType();
		setWater();
		setMilk();
		setSugar();
		setPowderQuantity();
		System.out.println(beverage.getBeverageName() + "Delivered");
		return beverage;
	}

	abstract void setBeverageType();
	abstract void setWater();
	abstract void setMilk();
	abstract void setSugar();
	abstract void setPowderQuantity();
	abstract Beverage createBeverage();
	 
}
