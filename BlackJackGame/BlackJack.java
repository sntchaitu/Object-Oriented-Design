package BlackJack;
import java.util.*;
public class BlackJack {
	public static final Random RANDOM = new Random();
	private Integer initialPlayerCount =0;
	private Integer playerCount = 0;
	private Table table;
	
	public BlackJack(int playerCount)
	{
		this.initialPlayerCount = playerCount;
	}
	
	public void play()
	{
		if(table==null)
		{
			init();
		}
		table.nextRound();
	}
	public void init()
	{
		table = new Table();
		while(playerCount < initialPlayerCount)
		{
			table.enterTable(new Player(playerCount++,table));
		}
		table.registerDealer(new Dealer(table));
	}
	public static void main(String args[]) throws InterruptedException
	{
		int rounds  = 10;
		BlackJack blackjack = new BlackJack(4);
		for(int i=0;i<rounds;i++)
		{
			blackjack.play();
			System.out.println("**********************************************************");
			Thread.sleep(2000L);
		}
	}
}
