package concrete;

/**
 *
 * @author J-Tron
 */
public class Employee {
    private String name;
    private int age;
    private String idNumber;
    
    public Employee(String name, int age, String idNumber){
        this.name = name;
        this.age =age;
        this.idNumber = idNumber;
    }
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
         String output;
         
         output = "Employee: " + name + '\n' + "Age: " + age + '\n' + "ID Number: " + idNumber;
         
         return output;
    }
    
     
}
