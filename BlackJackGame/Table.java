package BlackJack;
import java.util.*;
public class Table implements GameMediator{

	private Dealer dealer;
	private final List<Player> players = new LinkedList<>();
	private final List<Player> playersToRemove = new LinkedList<>();
	
	public void registerDealer(Dealer dealer)
	{
		this.dealer = dealer;
	}
	public void enterTable(Player player)
	{
		players.add(player);
		System.out.println(String.format("%s sat at the table", player));
	}
	public void leaveTable(Player player)
	{
		playersToRemove.add(player);
		System.out.println(String.format("%s QUIT", player));
	}
	public Card hitMe()
	{
		return dealer.nextCard();
	}
	
	public void nextRound()
	{
		for(Player player:players)
		{
			player.play();
		}
		dealer.play();
	}
	public void finishRound()
	{
		printResults();
		for(Player player:players)
		{
			dealer.returnCards(player.returnHand());
			
		}
			dealer.returnCards(dealer.returnHand());
			for(Player player:playersToRemove)
			{
				players.remove(player);
				
			}
			playersToRemove.clear();
	}
	private void printResults()
	{
		if(dealer.isBusted())
		{
			for(Player player:players)
			{
				if(!player.isBusted())
				{
					System.out.println(String.format("[%s] has won with [%d] => [%s]", player,player.handValue(),player.handAsString()));
				}
				else
				{
					System.out.println(String.format("[%s] has busted with [%d] => [%s]", player,player.handValue(),player.handAsString()));
				}
			}
			System.out.println(String.format("Dealer has busted with [%d] => [%s]",dealer.handValue(),dealer.handAsString()));
		}
		else
		{
			int dealerValue = dealer.handValue();
			boolean dealerWon = true;
			for(Player player:players)
			{
				int handValue = player.handValue();
				if(!player.isBusted() && player.handValue()>=dealerValue)
				{
					System.out.println(String.format("[%s] beat the dealer with [%d] => [%s]", player,player.handValue(),player.handAsString()));
				}
				else if(player.isBusted())
				{
					System.out.println(String.format("[%s] busted with with [%d] => [%s]", player,player.handValue(),player.handAsString()));
				}
				else
				{
					System.out.println(String.format("[%s] lost against the dealer with [%d] => [%s]", player,player.handValue(),player.handAsString()));
				}
			}
			if(dealerWon==true)
			{
				System.out.println(String.format("dealer won  with [%d] => [%s]", dealer.handValue(),dealer.handAsString()));
			}
			else
			{
				System.out.println(String.format("dealer  lost  with [%d] => [%s]", dealer.handValue(),dealer.handAsString()));
			}
		}
		
	}
	

	
}
