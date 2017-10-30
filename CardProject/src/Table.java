import java.util.ArrayList;

public class Table
{
	ArrayList <Player> table;
	int numberPlayers;
	
	Deck tableDeck;
	Table(int numPlayers)
	{
		table = new ArrayList<Player>();
		numberPlayers = numPlayers;
		addPlayers(numberPlayers);
		tableDeck = new Deck();
		dealCards();
		
	}
	
	void addPlayers( int numplayers)
	{	
		
		for(int i=0; i < numplayers; i++)
		{
			Player newplayer = new Player();
			table.add(newplayer);
		}
		
		
	}
	
	void dealCards()
	{
		for(int i = 0; i < 5; i++)
		{
			
			for(Player p : table)
			{
				p.addCardToHand(tableDeck.deal());
			}
		}
	}
	ArrayList<Player> getPlayers()
	{
		return table;
	}
	
}