/**
 * Topic: EmployeeManagement
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Employee {
    int id;
    String name;
    Employee(int id, String name) { this.id = id; this.name = name; }
}

class Concept03_EmployeeManagement {

    public static void main(String[] args) {
        Employee[] employees = {new Employee(1, "A"), new Employee(2, "B")};
        for (Employee employee : employees) System.out.println(employee.id + " " + employee.name);
    }
}
