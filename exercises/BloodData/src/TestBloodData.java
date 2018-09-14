
public class TestBloodData {
    public static void main (String [] args){
        
        BloodData blood1 = new BloodData();
        System.out.println("Blood Type: " + blood1.getBloodType());
        System.out.println("Rh Factor: " + blood1.getRhFactor());
        
        
        BloodData blood2 = new BloodData("A" , "-");
        blood1.setBloodType ( "A" );
        blood2.setRhFactor( "-" ) ;
        
        System.out.println();
        System.out.println(" Blood Type: " + blood2.getBloodType());
        System.out.println("Rh Factor: " + blood2.getRhFactor());
        System.out.println();
        
        
        BloodData blood3 = new BloodData ( "B" , " + ");
        System.out.println("Blood Type: " + blood3.getBloodType());
        System.out.println("Rh Factor: " + blood3.getRhFactor());
    } 
}
