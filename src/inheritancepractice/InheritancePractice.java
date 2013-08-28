package inheritancepractice;

import concrete.Employee;
import concrete.HourlyEmployee;
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
        
        String name;
        int age;
        String idNumber;
        double hourlyPay;
        
        
        Employee he1 = new HourlyEmployee("Lucas", 58, "54YR22", 15.50);
        
        System.out.println(he1.toString());
        
        
        
        
        
        
        
        
        
        
        
    }
}
