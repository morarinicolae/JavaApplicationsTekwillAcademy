
package biscuiti;


public class Biscuit {
    private int amountOfFlour;
    private int amountOfSugar;
    private String shape;
    
    public static int howManyDegreesCelsius = 350;
    public static int howMuchTimeInMinutes = 30;
    
    public Biscuit (int amountOfFlour, int amountOfSugar, String shape){
        this.amountOfFlour = amountOfFlour;
        this.amountOfSugar = amountOfSugar;
        this.shape = shape;
    }
    public int getAmountOfFlour() {
        return amountOfFlour;
    }
    public void setAmountFlour (int amountOfFlour){
        this.amountOfFlour = amountOfFlour;
    }
    public int getAmountOfSugar() {
        return amountOfSugar;
    }
    public void setAmountSugar (int amountOfSugar){
        this.amountOfSugar = amountOfSugar;
    }
    public int shape() {
        return amountOfFlour;
    }
    public void shape (String shape){
        this.shape = shape;
    }
    @Override
    public String toString () {
        return "Biscuit {" + " amountOfFlour="+ amountOfFlour + " amountOfSugar= " + amountOfSugar + " shape=" + shape + "}" ;
    }
    
}
    

