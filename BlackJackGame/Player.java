package BlackJack;
import java.util.*;
public class Player  extends BasicPlayer{
	private static final Random RANDOM = new Random();
	
	private final GameMediator gameMediator;
	private final int id;
	
	public Player(int id,GameMediator gameMediator)
	{
		this.gameMediator = gameMediator;
		this.id = id;
	}
	public void play()
	{
		while(shouldHit())
		{
			hand.add(gameMediator.hitMe());
		}
	}
	public String toString()
	{
		return "Player id:"+id+" ";
	}
	public boolean equals(Object o)
	{
		if(this==o)
		{
			return true;
		}
		if(o==null || getClass()!=o.getClass())
		{
			return false;
		}
		Player player = (Player) o;
		return id==player.id;
	}
	public int hashCode()
	{
		return id;
	}
}
