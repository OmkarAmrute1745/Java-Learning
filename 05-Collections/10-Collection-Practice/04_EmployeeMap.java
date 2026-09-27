/**
 * Topic: EmployeeMap
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Employee {
    String name;
    Employee(String name) { this.name = name; }
    public String toString() { return name; }
}
class Concept04_EmployeeMap {

    public static void main(String[] args) {
        java.util.Map<Integer, Employee> employees = new java.util.HashMap<>();
        employees.put(101, new Employee("Omkar"));
        employees.put(102, new Employee("Amit"));
        System.out.println(employees);
    }
}
