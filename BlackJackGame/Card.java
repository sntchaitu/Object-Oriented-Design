package BlackJack;

public class Card {
	private final Suit suit;
	private final Rank rank;
	
	public Card(Suit suit,Rank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	public int value()
	{
		return rank.getValue();
	}
	public int altValue()
	{
		return rank.getAltValue()==null?rank.getValue():rank.getAltValue();
	}
	public String toString()
	{
		return String.format("%s %s",suit,rank);
	}
}
