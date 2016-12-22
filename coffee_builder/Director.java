package coffee_builder;
//Also called as Waiter
public class Director {

			public static Beverage takeOrder(String beverageType)
			{
				BeverageBuilder bb = null;
				if(beverageType.equalsIgnoreCase("Tea"))
				{
					bb = new TeaBuilder();
				}
				else if(beverageType.equalsIgnoreCase("Coffee"))
				{
					bb = new CoffeeBuilder();
				}
				else
				{
					System.out.println("Sorry we cannot take order other than Coffee and Tea");
				}
				
				return bb.buildBeverage();
			}

}
