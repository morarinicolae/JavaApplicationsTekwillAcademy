/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcamp
 */
public class Foo {
    private int x;
    private int y;
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int [] getXY(){
        return new int [] {this.x, this.y};
    } 
    public double distance (Foo anotherPoint){
        return Math.sqrt((Math.pow(this.x - anotherPoint.x, 2))+ (Math.pow(this.y - anotherPoint, 2)));
    }
    @Override
    public String toString(){
        return "Foo{ "+ "x=" + x + "y=" + ']';
    }
}
