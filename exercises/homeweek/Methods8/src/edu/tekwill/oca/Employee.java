
package edu.tekwill.oca;


public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthySalary;
    
    public Employee (String firstName, String lastName, double monthySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthySalary = monthySalary;
    }
   public String getFirstName() {
       return firstName;
   } 
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   public String getLastName() {
   return lastName;
}
   public void setLastName (String lastName){
       this.lastName=lastName;
       
   }
   public double getMonthySalary (){
       return monthySalary;
   }
   public void setMonthySalary (double monthySalary){
       if (monthySalary > 0){
       this.monthySalary= monthySalary;
       }
   }

  // int getMounthySalary() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

