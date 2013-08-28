/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author J-Tron
 */
public class HourlyEmployee extends Employee{
    
    private double hourlyPay;
    private double hoursWorked;
    
    public HourlyEmployee (String name, int age, String idNumber, double hourlyPay){
        super(name, age, idNumber);
        this.hourlyPay = hourlyPay;
        
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

   public double getPay(double hourlyPay, double hoursWorked){
       
       return hourlyPay * hoursWorked;
   }

    @Override
    public String toString() {
        String output;
       
       output = super.toString() + '\n' + "Hourly Rate: " + hourlyPay; 
       
       return output;
    }
    
    
}
