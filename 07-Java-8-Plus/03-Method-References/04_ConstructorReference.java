/*
 * JAVA 8+
 * AREA: Method References
 * CONCEPT: Constructor Reference
 *
 * What is it?
 * A constructor reference uses ClassName::new to represent object creation.
 *
 * Why do we need it?
 * It provides a concise factory-style expression.
 *
 * Key points:
 * - Syntax: ClassName::new.
 * - The constructor must match the functional interface.
 *
 * Interview note:
 * Constructor references are commonly used with Supplier and Function.
 */

import java.util.function.Supplier;

class Employee {
    private String name = "New Employee";

    public String getName() {
        return name;
    }
}

class Concept04_ConstructorReference {
    public static void main(String[] args) {
        Supplier<Employee> employeeFactory = Employee::new;
        Employee employee = employeeFactory.get();

        System.out.println(employee.getName());
    }
}