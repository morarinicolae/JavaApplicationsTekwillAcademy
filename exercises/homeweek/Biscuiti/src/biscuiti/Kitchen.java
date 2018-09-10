
package  biscuiti;

public class Kitchen {
    public static void main (String [] args){
        Oven o = new Oven();
        Biscuit [] biscuits = new Biscuit [5];       
        for( int i = 0; i<biscuits.length; i++){
            biscuits[i]= new Biscuit (350 - i, 230+i*10, "Squar - " +i);
            o.startBaking(biscuits[i]);
        } 
        
        
        o.bake(biscuits);
    }
}
