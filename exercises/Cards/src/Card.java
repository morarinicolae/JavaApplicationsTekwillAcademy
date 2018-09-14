public class Card 
	{		private String suit;
private String number;
public Card()
{
suit = "Spades";		
number = "Jack";
}		
public String getCardNum()
{
return number;
}				
public String getCardSuit()
{
return suit;
}				
public void setCardNum(String number)
{
this.number = number;
}
public void setCardSuit(String suit)
{
this.suit = suit;
}
}