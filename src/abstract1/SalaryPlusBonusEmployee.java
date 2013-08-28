/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author J-Tron
 */
public class SalaryPlusBonusEmployee extends Employee{
    private double bonus;
    private double salary;

    public SalaryPlusBonusEmployee(double bonus, double salary, String name, int age, String idNumber) {
        super(name, age, idNumber);
        this.bonus = bonus;
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
      @Override
    public String toString() {
        String output;
       
       output = super.toString() + '\n' + "Bonus: $" + bonus; 
       
       return output;
    }
    
    
    
}
