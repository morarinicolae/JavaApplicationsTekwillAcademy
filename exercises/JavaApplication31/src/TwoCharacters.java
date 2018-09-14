
public class TwoCharacters {
    public static void main (String [] args){
         MyCharacter character1 = new MyCharacter (3,"White", 15);
        MyCharacter character2 = new MyCharacter (1,"Red", 5);
        MyCharacter character3 = new MyCharacter (58,"Purple", 2);
        //System.out.println("First Character:");
        System.out.println("First  Character:  " + "Number of eyes: " + character1.getNumberOfEyes()+ "; with color: "+ 
                character1.getEyeColor()+"; and number of lives:"+ character1.getNumberOfLives() );
        System.out.println("Second Character:  " + "Number of eyes: "  + character2.getNumberOfEyes()+ "; with color: "+ 
                character2.getEyeColor()+"; and number of lives:"+ character2.getNumberOfLives() );
        System.out.println("Third  Character:  " + "Number of eyes: " + character3.getNumberOfEyes()+ "; with color: "+ 
                character3.getEyeColor()+"; and number of lives:"+ character3.getNumberOfLives() );
        
        
        
    }
    
}
