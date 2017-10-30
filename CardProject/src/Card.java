


	public class Card{
		
		
		String suit;
		
		int faceValue;
		
		Card()
		{
			
		}
		
		Card(String s, int fv)
		{
			setSuit(s);
			
			setfaceValue(fv);
			}
		
		
		void setSuit(String s)
		{
			suit = s;
						
		}
		
		String getSuit()
		{
			return suit;
			
		}
		
		void setfaceValue(int fv)
		{
			faceValue = fv;
		}
		
		int faceValue()
		{
			return faceValue;			
		}
		
		void print()
		{
			System.out.print(faceValue());
			System.out.print("of");
			System.out.println(getSuit());
		}
		
	}