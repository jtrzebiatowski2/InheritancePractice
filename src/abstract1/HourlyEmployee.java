/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author J-Tron
 */
public class HourlyEmployee extends Employee {
    private double hourlyPay;
    private double hoursWorked;

    public HourlyEmployee(double hourlyPay, double hoursWorked, String name, int age, String idNumber) {
        super(name, age, idNumber);
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPay() {
        return hourlyPay * hoursWorked;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

       @Override
    public String toString() {
        String output;
       
       output = super.toString() + '\n' + "Hourly Rate: " + hourlyPay; 
       
       return output;
    }
    
    
    
    
    
    
}
