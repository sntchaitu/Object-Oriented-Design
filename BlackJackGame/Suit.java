package BlackJack;

 enum Suit {

	SPADES("♠"),HEARTS("♥"),DIAMONDS("♦"),CLUBS("♣");
	 private String str;
	 Suit(String str)
	 {
		 this.str = str;
	 }
	 
	 public String toString()
	 {
		 return str;
	 }
}
