
package breads;

public class Bread {
    
    private String breadType;
    private int caloriesPerSlice;
    
    public  static String MOTTO="The Sfaff of Life";
    
    public Bread (String breadType, int caloriesPerSlice){
       this.breadType= breadType;
       this.caloriesPerSlice=caloriesPerSlice;
    }
    public String getBreadType() {
        return breadType;
    }
    //public void breadType (String breadType){
        //this.breadType = breadType;
    //} 
    public int getCaloriesPerSlice (){
        return caloriesPerSlice;
    }
    //public void caloriesPerSlice (int caloriesPerSlice){
     //   this.caloriesPerSlice=caloriesPerSlice;
   // }
   public static String getMOTTO() {
        return MOTTO;
   }
}
