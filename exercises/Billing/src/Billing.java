
public class Billing {
    double priceOfAPhotobook;
    double quantityOrdered;
    int cpuponValue;
    float totalDue;
    
    
    public Billing (double priceOfAPhotobook){
         totalDue (priceOfAPhotobook, quantityOrdered);
    }
    public Billing (double priceOfAPhotobook, double quantityOrdered){
        totalDue (priceOfAPhotobook, quantityOrdered);
    }
    public Billing (double priceOfAPhotobook, int quantityOrdered, int couponValue){
        totalDue (priceOfAPhotobook, quantityOrdered, couponValue);
    }
    public void totalDue(double priceOfAPhotobook, double quantityOrdered1){
        System.out.println("Total due is: " + (priceOfAPhotobook+(priceOfAPhotobook*0.8)));       
    }
    public void totalDue(double priceOfAPhotobook, int quantityOrdered, int couponValue){
        System.out.println("Total due is: " + (((priceOfAPhotobook*quantityOrdered)-couponValue)+priceOfAPhotobook*quantityOrdered)*0.8);
    }
}
