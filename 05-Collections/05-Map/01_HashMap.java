/**
 * Topic: HashMap
 *
 * Java Collections learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept01_HashMap {

    public static void main(String[] args) {
        java.util.Map<Integer, String> employees = new java.util.HashMap<>();
        employees.put(101, "Omkar");
        employees.put(102, "Rahul");
        System.out.println(employees.get(101));
        System.out.println(employees);
    }
}
