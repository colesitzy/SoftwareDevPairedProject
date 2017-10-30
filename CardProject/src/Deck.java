import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Deck implements Iterable<Card>{
	
	ArrayList<String> faces;
	ArrayList<Card> cards;
	Deck()
	{
		faces = new ArrayList<String>();
		faces.add("Hearts");
		faces.add("Diamonds");
		faces.add("Clubs");
		faces.add("Spades");
		cards = new ArrayList<Card>();
		generate();
	}
	
	
	public void generate()
	{
		for(String s: faces)
		{
			for(int i = 2; i < 15 ; i++)
			{
				cards.add(new Card(s,i));
			}
			
		}
		
		
	}


	public void shuffle()
	{
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		
		
		for(int i = 0; i < cards.size(); i ++)
		{
			//Card copyCard = new Card();
			int curSize = cards.size();
			
			if(curSize > 1)
			{
				int cardToRemove = random(0,cards.size());
				shuffledDeck.add(cards.remove(cardToRemove));
			}
			else
			{
				shuffledDeck.add(cards.remove(0));
			}
			
			//copyCard = cards.get(cardToRemove);
			
			
			
		}
		cards = shuffledDeck;
		
		printDeck();
		
	}
	
	
	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return cards.iterator();
	}
	
	
	public int  random(int lowBound, int highBound)
	{
		
		int retval = 0;
		int dif =  highBound - lowBound;
		Random rand = new Random();
		retval = rand.nextInt(dif) + lowBound;
		
		return retval;
	}
	
	public void printDeck()
	{
		/*for(int i = 0; 0 < cards.size(); i++)
		{
			cards.get(i).print();
		}*/
		
		for(Card c: cards)
		{
			c.print();
		}
		
	}
	
	public Card deal()
	{
		Card returnCard = null;
		if(cards.size() > 0 )
		{
			returnCard = cards.remove(0);
		}
		else
		{
			System.out.println("there are no cards in the deck to draw");
		}
		
		return returnCard;
		
	}
	
	
	public Object[] toArray()
	{
		return cards.toArray();
	}
	
}