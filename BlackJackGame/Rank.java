package BlackJack;

 enum Rank {
	
	ACE(1,11,"Ace"),
	TWO(2,"Two"),
	THREE(3,"Three"),
	FOUR(4,"Four"),
	FIVE(5,"Five"),
	SIX(6,"Six"),
	SEVEN(7,"Seven"),
	EIGHT(8,"Eight"),
	NINE(9,"Nine"),
	TEN(10,"Ten"),
	KING(10,"King"),
	QUEEN(10,"Queen"),
	JACK(2,"King");
	
	
	private final Integer value;
	private final Integer altValue;
	private final String str;
	public Integer getValue() {
		return value;
	}
	public Integer getAltValue() {
		return altValue;
	}
	public String toString() {
		return str;
	}
	
	
	Rank(int value,int altValue,String s)
	{
		this.value = value;
		this.altValue = value;
		this.str = s;
	}
	Rank(int value,String s)
	{
		this.value = value;
		this.altValue = null;
		this.str = s;
	}
	
	
}
