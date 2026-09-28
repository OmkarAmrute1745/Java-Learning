/*
 * JAVA 8+
 * AREA: Java 8 Practice
 * CONCEPT: Employee Processing
 *
 * What is it?
 * This practice combines Java 8 features to process employee data.
 *
 * Why do we need it?
 * Interview and backend tasks often require filtering and transformation of objects.
 *
 * Key points:
 * - Use streams for collection processing.
 * - Use lambdas or method references where they improve readability.
 *
 * Interview note:
 * First solve the problem with a loop, then compare it with the Stream solution.
 */

import java.util.Arrays;
import java.util.List;

class EmployeeData {
    private final String name;
    private final double salary;

    EmployeeData(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Concept01_EmployeeProcessing {
    public static void main(String[] args) {
        List<EmployeeData> employees = Arrays.asList(
                new EmployeeData("Omkar", 50000),
                new EmployeeData("Amit", 35000),
                new EmployeeData("Sneha", 60000)
        );

        employees.stream()
                .filter(employee -> employee.getSalary() > 40000)
                .map(EmployeeData::getName)
                .forEach(System.out::println);
    }
}