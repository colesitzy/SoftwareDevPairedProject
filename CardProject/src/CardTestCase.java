import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CardTestCase {

	Card c = new Card("Spade", 10);
	Deck d = new Deck();
	
	@Test
	public void testCard() {
		assertNotNull(c);
		
		//test suit
		assertEquals(c.suit, "Spade");
		
		assertEquals(c.faceValue, 10);
		
	}
	@Test
	public void testDeck(){
		assertNotNull(d);
		
		assertEquals(d.cards.size(), 52);
		assertTrue(checkFaces(d));
		
		
		
	}
	
	
	
	public boolean checkFaces(Deck d)
	{
		int[] faceCount = {0,0,0,0};
		boolean retval = false;
		for(Card c : d)
		{
			System.out.print(c.getSuit());
		}
		
		
		return retval;
	}

}
