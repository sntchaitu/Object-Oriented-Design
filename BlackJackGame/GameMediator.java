package BlackJack;

public interface GameMediator {
	void registerDealer(Dealer dealer);
	void enterTable(Player player);
	void leaveTable(Player player);
	Card hitMe();
	void nextRound();
	void finishRound(); 
	
}
