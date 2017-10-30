import java.util.ArrayList;

public class Player
{
	ArrayList<Card> hand; 
	Player()
	{
		hand = new ArrayList<Card>();
	}
	
	
	
	
	
	public void addCardToHand(Card c)
	{
		hand.add(c);
	}
	ArrayList<Card> getHand()
	{
		return hand;
	}
	
	
	
}