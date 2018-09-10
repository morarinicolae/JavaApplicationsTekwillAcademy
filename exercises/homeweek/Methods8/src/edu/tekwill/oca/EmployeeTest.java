/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tekwill.oca;

/**
 *
 * @author hcamp
 */
public class EmployeeTest {
    public static void main (String [] args){
        Employee e1 = new Employee ("John", "Doe", 1500.0);
        Employee e2 = new Employee ("Vasea", "Pupkin", -500.0);
        
        double annualSalary1= e1.getMonthySalary() *12;
        double annualSalary2= e2.getMonthySalary () *12;
        
        System.out.println("Annual salary : " + annualSalary1);
        System.out.println("Annual salary : " + annualSalary2);
        e2.setMonthySalary(-500.0);
        
        System.out.println("Annual salary : " + annualSalary1);
        System.out.println("Annual salary : " + annualSalary2);
    }
    
}
