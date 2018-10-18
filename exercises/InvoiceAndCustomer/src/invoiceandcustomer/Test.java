
package invoiceandcustomer;

public class Test {


    public static void main(String[] args) {
        Customer customer=new Customer(45, "John", 12);
        System.out.println(customer.toString());
        Invoice invoice=new Invoice(30, customer, 450);
        System.out.println(invoice.getAmountAfterDiscount());
        
    }
    
}