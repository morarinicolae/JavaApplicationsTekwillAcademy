
package employee;

public class Employee {
private int id;
private String firstName;
private String lastName;
private int salary;
  public static void main (String [] args){
      
//Employee Employee = new Employee(int id, String firstName, String lastName, int salary);
//Employee();//int id, String firstName, String lastName, int salary){
    int id = 1;
    String firstName= "Arcodionovici";
    String lastName= "Saxafonovici";
    //salary = 299;
        double yearlySalary;
        int salary = 3000;
        yearlySalary = (salary * 12);
       // return yearlySalary;
      System.out.println(id + " " + firstName + " " + lastName +" " + salary + " "+yearlySalary);  
  }

 Employee(int id, String firstName, String lastName, int salary){
    id = 1;
    firstName= "Arcodionovici";
    lastName= "Saxafonovici";
    salary = 299;
}

    

    
    public int getId() {
        return id;
    }
    public String getFirstName () {
        return firstName;
        
    }
    public void setFirstName (String firstName){
        this.firstName=firstName;
    }
    public String getLastName (){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName= lastName;
    }
    public int getSalary(){
        return salary;
    }
    
    @Override
    public String toString () {
    double yearlySalary = (salary * 12);
        return "Employee {" + " id"+ id + " firstName " + firstName + " LastName" + lastName + "salary" + salary + "yarlySalary " + yearlySalary + "}" ;
    }
}
    

