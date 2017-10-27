import java.util.ArrayList;
import java.util.Iterator;

public class Deck implements Iterable<Card>{
	
	ArrayList<String> faces;
	ArrayList<Card> cards;
	Deck()
	{
		faces = new ArrayList<String>();
		faces.add("Heart");
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


	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return cards.iterator();
	}
	
	
	
	
}