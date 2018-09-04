/*6.Mad Libs is a children’s game in which they provide a few words that are then incorporated into a silly story. The game helps children understand different parts of speech because they are asked to provide specific types of words. For example,you might ask a child for a noun, another noun, an adjective, and a past-tense verb. The child might reply with such answers as table, book, silly, and studied. The newly created Mad Lib might be:
Mary had a little table
Its book was silly as snow
And everywhere that Mary studied
The table was sure to go.*/




import java.util.Scanner;
public class MadLib { 
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        
        String noun, noun2;
        System.out.println("Enter a noun ");
        noun = keyboard.nextLine();
        System.out.println("Enter a second noun: ");
        noun2 = keyboard.nextLine();
       
     
        System.out.println("Mary had a little " + noun + "\nIts " + noun2 + " was silly as snow");
        System.out.println("And everywhere that Mary went");
        System.out.println("The " + noun + " was sure to go.");
        
  }

}