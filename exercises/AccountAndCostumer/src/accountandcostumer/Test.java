/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountandcostumer;

public class Test {


    public static void main(String[] args) {
        Customer customer=new Customer(4,"Customer1",'M');
        System.out.println(customer.toString());
        Account account=new Account(7,customer,500);
        System.out.println(account.toString());
        account.deposit(75);
        System.out.println(account.toString());
        account.withdraw(80);
        System.out.println(account.toString());
    }
    
}