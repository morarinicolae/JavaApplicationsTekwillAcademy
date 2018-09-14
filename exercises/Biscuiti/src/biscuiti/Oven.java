

package biscuiti;



public class Oven {
  
    public void bake(Biscuit [] biscuits) {
        preheat(Biscuit.howManyDegreesCelsius);
       for (int i = 0;  i < biscuits.length; i++){
           startBaking(biscuits[i]);
           
       } 
        System.out.println("Time is up!");
    }
    public void preheat(int degrees){
        System.out.println("Oven is preheated up to !" + degrees + "C");
    }
    public void startBaking(Biscuit b){
        System.out.println("Baking biscuit!" + b + "!");
    }
}
