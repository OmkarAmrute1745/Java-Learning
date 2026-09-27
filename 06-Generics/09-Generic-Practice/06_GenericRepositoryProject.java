/**
 * Topic: GenericRepositoryProject
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface Repository<T, ID> {
    void save(ID id, T value);
    T findById(ID id);
}

class InMemoryRepository<T, ID> implements Repository<T, ID> {
    private final java.util.Map<ID, T> data = new java.util.HashMap<>();
    public void save(ID id, T value) { data.put(id, value); }
    public T findById(ID id) { return data.get(id); }
}
class Concept06_GenericRepositoryProject {

    public static void main(String[] args) {
        Repository<String, Integer> repository = new InMemoryRepository<>();
        repository.save(101, "Java Developer");
        System.out.println(repository.findById(101));
    }
}
