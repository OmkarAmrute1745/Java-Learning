/**
 * Topic: GenericRepositoryInterface
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface Repository<T> {
    void save(T value);
}

class StringRepository implements Repository<String> {
    public void save(String value) { System.out.println("Saved: " + value); }
}
class Concept03_GenericRepositoryInterface {

    public static void main(String[] args) {
        Repository<String> repository = new StringRepository();
        repository.save("Java");
    }
}
