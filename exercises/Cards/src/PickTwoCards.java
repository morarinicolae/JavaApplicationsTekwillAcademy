//import javax.swing.JOptionPane; 
//import java.lang.NullPointerException;
	public class PickTwoCards {
        private Card CardOne;
        private Card CardTwo;		
	private String suitOne;		
	private String suitTwo;		
        private String numberOne;
	private String numberTwo;
		
	public static void main(String[] args)
		{
               
			PickTwoCards RandomCards = new PickTwoCards(); 
			RandomCards.genTwoCards();
			//RandomCards.displayCards();
		}

		public PickTwoCards()
		{
			numberOne = "One";
			suitOne = "Spades";
			numberTwo = "Two";
			suitTwo = "Diamonds";
		}		
		public void genTwoCards()
		{
			CardOne = new Card();
			CardTwo = new Card();					
			String[] suitArray = new String[]{"Clubs","Hearts","Spades","Diamonds"};
			int s1 = (int)(Math.random()*suitArray.length);
			int s2 = (int)(Math.random()*suitArray.length);
			suitOne = suitArray[s1];
			suitTwo = suitArray[s2];
			CardOne.setCardSuit(suitOne);
			CardTwo.setCardSuit(suitTwo);						
			String[] numArray = new String[]{"Ace","Two","Three","Four", "Five", "Six", "Seven"};
			int r1 = (int)(Math.random()*numArray.length);
			int r2 = (int)(Math.random()*numArray.length);
			numberOne = numArray[r1];
			numberTwo = numArray[r2];
			CardOne.setCardNum(numberOne);
			CardTwo.setCardNum(numberTwo);
		                  System.out.println(CardOne.getCardNum() + CardOne.getCardSuit() );
                                  System.out.println(CardTwo.getCardNum() + CardTwo.getCardSuit() );
                }
                
                
		
		
		/*public void displayCards()
		{
			try
			{
				JOptionPane.showMessageDialog(null,"The first card is the " + CardOne.getCardNum() + " of " + CardOne.getCardSuit());
				JOptionPane.showMessageDialog(null,"The second card is the " + CardTwo.getCardNum() + " of " + CardTwo.getCardSuit());		
			}
			
			catch(NullPointerException e)
			{
				System.err.println(e.getMessage());
			}
			
			finally
			{
				System.out.println("Exception handling practice");
			}
		}*/
	}