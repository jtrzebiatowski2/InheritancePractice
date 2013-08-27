/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author J-Tron
 */
public class SalariedEmployee implements Employee {
    private double salary;
    
    @Override
    public double getPay() {
        return salary;
    }
    
    public SalariedEmployee(String name, int age, String idNumber, double salary){
    
    }

    public SalariedEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
