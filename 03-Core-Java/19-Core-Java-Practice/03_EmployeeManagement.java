/**
 * Topic: 03 EmployeeManagement
 *
 * Part of the Core Java learning roadmap.
 * Study the concept, run the example, then modify it and observe the result.
 */
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class 03EmployeeManagement {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "A"),
            new Employee(2, "B")
        };
        for (Employee employee : employees) {
            System.out.println(employee.id + " " + employee.name);
        }
    }
}
