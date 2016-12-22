package coffee_builder;

public class TeaBuilder extends BeverageBuilder{

	@Override
	void setBeverageType() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Tea");
		getBeverage().setBeverageName("Tea");
	}

	@Override
	void setWater() {
		// TODO Auto-generated method stub
		System.out.println("Adding 15 ml of water");
		getBeverage().setWater(15);
		
	}

	@Override
	void setMilk() {
		// TODO Auto-generated method stub
		System.out.println("Adding 30 ml of milk");
		getBeverage().setMilk(30);
	}

	@Override
	void setSugar() {
		// TODO Auto-generated method stub
		System.out.println("Adding 50 ml of sugar");
		getBeverage().setSugar(50);
		
	}

	@Override
	void setPowderQuantity() {
		// TODO Auto-generated method stub
		System.out.println("Adding 3 table spoons  of tea Powder");
		getBeverage().setPowderQuantity(3);
	}

	@Override
	Beverage createBeverage() {
		// TODO Auto-generated method stub
		return new Beverage();
	}

		
}
