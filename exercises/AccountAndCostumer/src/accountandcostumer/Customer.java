/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountandcostumer;

public class Customer {
private int ID;
private String name;
private char gender;

public Customer(int ID, String name, char gender){
this.ID=ID;
this.gender=gender;
this.name=name;
}

public int getID(){
return this.ID;
}

public String getName(){
return this.name;
}

public char getGender(){
return this.gender;
}

@Override
public String toString(){
return getName()+"("+getID()+","+getGender()+")";
}
}