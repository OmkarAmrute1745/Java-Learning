/**
 * Topic: GenericStudentRepository
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class StudentRepository<T> {
    private final java.util.List<T> students = new java.util.ArrayList<>();
    void save(T student) { students.add(student); }
    java.util.List<T> findAll() { return students; }
}
class Concept01_GenericStudentRepository {

    public static void main(String[] args) {
        StudentRepository<String> repository = new StudentRepository<>();
        repository.save("Omkar");
        repository.save("Amit");
        System.out.println(repository.findAll());
    }
}
