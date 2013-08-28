package inheritancepractice;

import concrete.Employee;
import concrete.HourlyEmployee;
import concrete.SalariedEmployee;
import concrete.SalaryPlusBonusEmployee;
import java.util.Scanner;

/**
 *
 * @author J-Tron
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        Employee he1 = new HourlyEmployee("Lucas", 58, "54YR22", 15.50);
        
        System.out.println(he1.toString());
        
        Employee sep1 = new SalariedEmployee("Ted", 34, "45KL77", 48250.00);
        
        System.out.println(sep1.toString());
        
        Employee spbe1 = new SalaryPlusBonusEmployee("Fran", 41, "23DS12", 47500.00, 18000.00);
        
        System.out.println(spbe1.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
