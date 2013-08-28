/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author J-Tron
 */
public abstract class Employee {
    
   private String name;
   private int age;
   private String idNumber;
   
   public Employee(String name, int age, String idNumber){
       this.name = name;
       this.age = age;
       this.idNumber = idNumber;
   }
   
    /**
     *
     * @return
     */
    public abstract double getPay();

    public int getAge() {
        return age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
         String output;
         
         output = "Employee: " + name + '\n' + "Age: " + age + '\n' + "ID Number: " + idNumber;
         
         return output;
    }
   
   
}
