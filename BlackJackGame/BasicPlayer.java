package BlackJack;
import java.util.*;
public abstract class BasicPlayer {
	private static final int HIT_TRESHOLD = 17;
	private static final int BUST_TRESHOLD = 22;
	
	protected final List<Card> hand = new LinkedList<>();
	
	protected abstract void play();
	
	protected boolean shouldHit()
	{
		return underThreshold(HIT_TRESHOLD);
	}
	
	private boolean underThreshold(int threshold)
	{
		int [] sum = sums();
		return sum[0] < threshold || sum[1] < threshold;
	}
	
	protected boolean isBusted()
	{
		return !underThreshold(BUST_TRESHOLD);
	}
	private int[] sums()
	{
		int[] s= new int[2];
		for(Card c:hand)
		{
			s[0]+=c.value();
			s[1]+=c.altValue();
		}
		return s;
	}
	public String handAsString()
	{
		StringBuilder sb = new StringBuilder();
		for(Card c:hand)
		{
			sb.append(c.toString()).append(" ");
		}
		return sb.toString();
	}
	
	public int handValue()
	{
		int [] sums = sums();
		if(!isBusted())
		{
			if(sums[0]<BUST_TRESHOLD && sums[1]>=BUST_TRESHOLD)
			{
				return sums[0];
			}
			else if(sums[1]<BUST_TRESHOLD && sums[0]>=BUST_TRESHOLD)
			{
				return sums[1];
			}
			else
			{
				return Math.max(sums[0], sums[1]);
			}
		}
		else
		{
			return Math.min(sums[0], sums[1]);
		}
	}
	
	public List<Card> returnHand()
	{
		List<Card> cards = new LinkedList<>();
		for(Card c:hand)
		{
			cards.add(c);
		}
		hand.clear();
		return cards;
	}
	
}
