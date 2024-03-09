import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;
    
    
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
}

class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John", 30, 50000);
        employees[1] = new Employee("Alice", 25, 60000);
        employees[2] = new Employee("Bob", 35, 40000);
        
        Arrays.sort(employees); //используется Comparable
        
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", " + emp.getAge());
        }
        
        Arrays.sort(employees, new EmployeeSalaryComparator()); //используется Comparator
        
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", " + emp.getSalary());
        }
    }
}
