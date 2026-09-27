/**
 * Topic: GenericServiceInterface
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface Service<T, R> {
    R execute(T input);
}

class NameService implements Service<String, Integer> {
    public Integer execute(String input) { return input.length(); }
}
class Concept04_GenericServiceInterface {

    public static void main(String[] args) {
        Service<String, Integer> service = new NameService();
        System.out.println(service.execute("Omkar"));
    }
}
