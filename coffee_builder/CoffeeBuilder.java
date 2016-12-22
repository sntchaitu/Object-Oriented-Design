package coffee_builder;

public class CoffeeBuilder extends BeverageBuilder{

	@Override
	void setBeverageType() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Coffee");
		getBeverage().setBeverageName("Coffee");
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
		System.out.println("Adding 50 ml of milk");
		getBeverage().setSugar(50);
		
	}

	@Override
	void setPowderQuantity() {
		// TODO Auto-generated method stub
		System.out.println("Adding 2 tbps of coffe powder");
		getBeverage().setPowderQuantity(2);
	}

	@Override
	Beverage createBeverage() {
		// TODO Auto-generated method stub
		return new Beverage();
	}

		
}
