
package breads;


public class TestBread {
    public static void main (String [] args){
        Bread bread1 = new Bread ("White", 150);
        Bread bread2 = new Bread ("Rye", 60);
        Bread bread3 = new Bread ("Black", 45);
        System.out.println("First bread!:");
        System.out.println("Bread type is:" + bread1.getBreadType()+ ", with:"+ 
                bread1.getCaloriesPerSlice()+"calories per slice."+ " Company MOTTO: " + Bread.MOTTO);
        System.out.println("Second bread!: ");
        System.out.println("Bread type is:" + bread2.getBreadType()+ ", with:"+ 
                bread2.getCaloriesPerSlice() + " calories per slice."+ "Company MOTTO:" + Bread.MOTTO );
        System.out.println("Thrid bread!:");
        System.out.println("Bread type is:"+ bread3.getBreadType()+ "with:" + 
                bread3.getCaloriesPerSlice()+ "calories per slice"+ " Company MOTTO:" + Bread.MOTTO);
        
    }  
    
}
