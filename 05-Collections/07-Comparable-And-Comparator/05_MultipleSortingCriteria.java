/**
 * Topic: MultipleSortingCriteria
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Employee {
    String name;
    int salary;
    Employee(String name, int salary) { this.name = name; this.salary = salary; }
}
class Concept05_MultipleSortingCriteria {

    public static void main(String[] args) {
        java.util.List<Employee> employees = new java.util.ArrayList<>();
        employees.add(new Employee("A", 50000));
        employees.add(new Employee("B", 50000));
        employees.add(new Employee("C", 30000));
        employees.sort(java.util.Comparator.comparingInt((Employee e) -> e.salary).thenComparing(e -> e.name));
        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.salary);
        }
    }
}
