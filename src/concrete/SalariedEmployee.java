/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author J-Tron
 */
public class SalariedEmployee extends Employee{
    private double salary;
    
    public SalariedEmployee(String name, int age, String idNumber, double salary){
    super(name, age, idNumber);
    this.salary = salary;
    
}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String output;
       
       output = super.toString() + '\n' + "Salary: $" + salary; 
       
       return output;
    }
    
    
    
}
