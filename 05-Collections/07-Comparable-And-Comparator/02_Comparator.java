/**
 * Topic: Comparator
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Employee {
    String name;
    int salary;
    Employee(String name, int salary) { this.name = name; this.salary = salary; }
}
class Concept02_Comparator {

    public static void main(String[] args) {
        java.util.List<Employee> employees = new java.util.ArrayList<>();
        employees.add(new Employee("A", 50000));
        employees.add(new Employee("B", 30000));
        employees.sort(java.util.Comparator.comparingInt(employee -> employee.salary));
        System.out.println(employees.get(0).name);
    }
}
