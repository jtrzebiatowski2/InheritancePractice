package interface1;

/**
 *
 * @author J-Tron
 */
public class SalaryPlusBonusEmployee implements Employee{
     private double salary;
    private double bonus;
    
    @Override
    public double getPay() {
        return salary + bonus;
    }
    
    public SalaryPlusBonusEmployee (String name, int age, String idNumber, double salary, double bonus){

    }

    public SalaryPlusBonusEmployee(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
}
