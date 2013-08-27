/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author J-Tron
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double salary;
    private double bonus;
    
    public SalaryPlusBonusEmployee (String name, int age, String idNumber, double salary, double bonus){
        super(name, age, idNumber, salary);
        this.bonus = bonus;
    }
    
    SalaryPlusBonusEmployee spbe1 = new SalaryPlusBonusEmployee ("Marge", 45, "88DF74", 32500.00, 6000.00);
    
    public double getYearlyPay(double salary, double bonus){
        return salary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        String output;
       
       output = super.toString() + '\n' + "Bonus: $" + bonus; 
       
       return output;
    }

    
}
