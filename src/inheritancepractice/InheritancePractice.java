package inheritancepractice;

import concrete.Employee;
import concrete.HourlyEmployee;
import concrete.SalariedEmployee;
import concrete.SalaryPlusBonusEmployee;

/**
 *
 * @author J-Tron
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee he1 = new HourlyEmployee("Lucas", 58, "54YR22", 15.50);
        
        System.out.println(he1.toString());
        
        Employee sep1 = new SalariedEmployee("Ted", 34, "45KL77", 48250.00);
        
        System.out.println(sep1.toString());
        
        Employee spbe1 = new SalaryPlusBonusEmployee("Fran", 41, "23DS12", 47500.00, 18000.00);
        
        System.out.println(spbe1.toString());
        
        HourlyEmployee he2 = new HourlyEmployee("Bert", 19, "45MB64", 14.75);
        
        System.out.println(he2.toString() + '\n' + "Weekly Pay: $" + he2.getPay(he2.getHourlyPay(), 40));
         
        SalaryPlusBonusEmployee spbe2 = new SalaryPlusBonusEmployee("Justin" , 25, "45XZ69", 149250.00, 25000.00);
        
        System.out.println(spbe2.toString() + '\n' + "Yearly Pay: $" + spbe2.getYearlyPay(spbe2.getSalary(), spbe2.getBonus()));
        
        
        
        
        
        
        
        
        
        
        
    }
}
