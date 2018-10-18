
package circleandcylindre;


public class CircleAndCylinder {


    public static void main(String[] args) {
        Circle circle=new Circle(7, "Blue");
        Cylinder cylinder=new Cylinder(8, 9, "Green");
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
    
}