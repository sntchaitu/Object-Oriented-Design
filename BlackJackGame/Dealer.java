package BlackJack;
import java.util.*;
public class Dealer extends BasicPlayer {

	private static final int NUMBER_OF_DECKS = 6;
	private final Deque<Card> cards;
	private final GameMediator gameMediator;
	
	public Dealer(GameMediator gameMediator)
	{
		this.gameMediator = gameMediator;
		this.cards = buildCards();
	}
	
	@Override
	
	protected void play() {
		// TODO Auto-generated method stub
		while(shouldHit())
		{
			hand.add(gameMediator.hitMe());
		}
		gameMediator.finishRound();
	}
	public Card nextCard()
	{
		return cards.pollFirst();
	}
	public void returnCards(List<Card> cards)
	{
		for(Card card:cards)
		{
			this.cards.addLast(card);
		}
	}
	private static Deque<Card> buildCards()
	{
		Deque<Card> cards = new LinkedList<>();
		for(int i=0;i<NUMBER_OF_DECKS;i++)
		{
			cards.addAll(shuffledCards());
		}
		return cards;
	}
	private static Collection<Card> shuffledCards()
	{
		List<Card> cards = new ArrayList<>();
		for(Suit suit:Suit.values())
		{
			for(Rank rank: Rank.values())
			{
				cards.add(new Card(suit,rank));
			}
		}
		Collections.shuffle(cards);
		return cards;
	}
	

	
}
