/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author J-Tron
 */
public class HourlyEmployee implements Employee{
    
    private double hourlyPay;
    private double hoursWorked;
    
    public HourlyEmployee (String name, int age, String idNumber, double hourlyPay){
    }
    
    @Override
    public double getPay() {
        return hoursWorked * hourlyPay;
    }

    public HourlyEmployee(double hourlyPay, double hoursWorked) {
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
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
    
    
}
