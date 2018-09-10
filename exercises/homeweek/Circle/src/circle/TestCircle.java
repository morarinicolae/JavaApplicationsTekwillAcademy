
package circle;


public class TestCircle {
    
    public static void main (String [] args) {
        Circle defaultCircle = new Circle();
        Circle circle1 = new Circle ();
        Circle circle2 = new Circle();
        
        circle1.setRadius(5.0);
        circle2.setRadius(10.0);
        
        System.out.println("Values of 3 circle:");
        
        System.out.println("First circle:");
        System.out.println("The radius is:" + circle1.getRadius() +"diameter:" + circle1.getDiameter() + " area is:"
        + circle1.getArea());
        
        System.out.println("Second circle:");
        System.out.println("The radius is:" + circle2.getRadius()+ "diameter" + circle2.getDiameter() + "area is:"
        + circle2.getArea());
        
        System.out.println("Default circle:");
        System.out.println("The radius is:" + defaultCircle.getRadius() + "diameter:" + defaultCircle.getDiameter()+ "area is:"
         + defaultCircle.getArea());
        
        
        
    }
    
}
