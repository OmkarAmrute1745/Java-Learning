package methodreferences;

import java.util.function.Supplier;

class Employee {
    private String name = "New Employee";

    public String getName() {
        return name;
    }
}

public class Concept04_ConstructorReference {

    public static void main(String[] args) {
        Supplier<Employee> employeeFactory = Employee::new;

        Employee employee = employeeFactory.get();

        System.out.println(employee.getName());
    }
}