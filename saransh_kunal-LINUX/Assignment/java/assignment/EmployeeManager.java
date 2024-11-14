import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    public int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeManager {
    private static List<Employee> employees = new ArrayList<>();

    private static void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added: " + employee);
    }

    private static void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.id == id);
        System.out.println("Deleted Employee with ID: " + id);
    }

    private static void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    private static void sortEmployeesBySalary() {
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
    }
    public static void main(String[] args) {
        // Adding some employees
        addEmployee(new Employee(1, "Alice", 30, 50000));
        addEmployee(new Employee(2, "Bob", 28, 60000));
        addEmployee(new Employee(3, "Charlie", 35, 55000));

        // Display all employees
        System.out.println("All Employees:");
        showAllEmployees();

        // Deleting an employee
        deleteEmployee(2);
        System.out.println("\nAfter Deleting Employee with ID 2:");
        showAllEmployees();

        // Sorting employees by salary in ascending order
        System.out.println("\nEmployees Sorted by Salary:");
        sortEmployeesBySalary();
        showAllEmployees();
    }

}