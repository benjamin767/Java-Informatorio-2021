import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<Employee>();
        Map<Integer,Employee> registers = new HashMap<>();

        employees.add(new Employee("Benjamin Miño",30314292, 320,20));
        employees.add(new Employee("Sebastian Sosa", 30314293, 300, 17));

        ArrayList<Employee> employees1 = new ArrayList<>(employees);

        for(int i = 0; i<2; i++){
            Employee person = employees1.get(i);
            registers.put(person.getDni(), employees1.get(i));
        }

        for(Map.Entry<Integer,Employee> register : registers.entrySet()){
            System.out.println("DNI: " + register.getKey() +" "+register.getValue() );
        }
    }

}
class Employee{
    private String nameYLastName;
    private Integer dni;
    private Integer hourlyValues;
    private Integer hoursWorked;
    private Integer salary;

    Employee(String nameYLastName, Integer dni, Integer hourlyValues, Integer hoursWorked) {
        this.nameYLastName = nameYLastName;
        this.dni = dni;
        this.hourlyValues = hourlyValues;
        this.hoursWorked = hoursWorked;
        salary = hourlyValues * hoursWorked;
    }


    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Integer getHourlyValues() {
        return hourlyValues;
    }

    public void setHourlyValues(Integer hourlyValues) {
        this.hourlyValues = hourlyValues;
    }

    public String getNameYLastName() {
        return nameYLastName;
    }

    public void setNameYLastName(String nameYLastName) {
        this.nameYLastName = nameYLastName;
    }

    @Override
    public String toString(){
        return "[" + nameYLastName + ": $" + salary + "]";
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
