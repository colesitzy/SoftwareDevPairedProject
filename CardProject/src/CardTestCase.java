import static org.junit.Assert.*;

import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class CardTestCase {

	Card c = new Card("Spade", 10);
	
	
	@Test
	public void testCard() {
		assertNotNull(c);
		
		//test suit
		assertEquals(c.suit, "Spade");
		
		assertEquals(c.faceValue, 10);
		
	}
	@Test
	public void testDeck(){
		Deck d = new Deck();

		assertNotNull(d);
		
		assertEquals(d.cards.size(), 52);
		assertEquals(checkFaces(d), true);
		//System.out.print(checkFaces(d));
		
		Object[] oldDeck= d.toArray();
		d.shuffle();
		
		assertNotSame(oldDeck,d.toArray());
		
		
	}
	
	@Test
	public void testTable()
	{
		Table t = new Table(5);
		for(Player p : t.getPlayers())
		{
			assertEquals(5, p.getHand().size());
		}
	}
	
	public boolean checkFaces(Deck d)
	{
		int[] faceCount = {0,0,0,0};
		boolean retval = false;
		for(Card c : d)
		{
			//System.out.print(c.getSuit());
			if (c.getSuit().equals("Hearts"))
			{
				faceCount[0] = faceCount[0] + 1;
			}
			else if (c.getSuit().equals("Diamonds"))
			{
				faceCount[1] = faceCount[1] + 1;
			}
			else if (c.getSuit().equals("Clubs"))
			{
				faceCount[2] = faceCount[2] + 1;
			}
			else if (c.getSuit().equals("Spades"))
			{
				faceCount[3] = faceCount[3] + 1;
			}
		}
		
		if(faceCount[0] == 13 && faceCount[1] == 13 && faceCount[2] == 13 && faceCount[3] == 13)
		{
			//System.out.print("switch");
			retval = true;
		}
		
		
		return retval;
	}
	
	
	

}
