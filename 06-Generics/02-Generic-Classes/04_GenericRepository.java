/**
 * Topic: GenericRepository
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Repository<T> {
    private final java.util.List<T> values = new java.util.ArrayList<>();
    void save(T value) { values.add(value); }
    java.util.List<T> findAll() { return values; }
}
class Concept04_GenericRepository {

    public static void main(String[] args) {
        Repository<String> repository = new Repository<>();
        repository.save("Java");
        repository.save("Spring Boot");
        System.out.println(repository.findAll());
    }
}
