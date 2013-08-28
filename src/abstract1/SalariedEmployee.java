/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author J-Tron
 */
public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(double salary, String name, int age, String idNumber) {
        super(name, age, idNumber);
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
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
