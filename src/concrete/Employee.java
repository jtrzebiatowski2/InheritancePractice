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
    
    Employee e1 = new Employee("Steve", 27, "45PO78");
    Employee e2 = new Employee ("Bill", 32, "74TY87");
    

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
         
         output = "Employee " + name + '\n' + "Age: " + age + '\n' + "ID Number: " + idNumber;
         
         return output;
    }
    
     
}
