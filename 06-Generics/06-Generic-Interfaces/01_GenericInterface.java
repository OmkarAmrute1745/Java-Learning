/**
 * Topic: GenericInterface
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
interface Processor<T> {
    T process(T value);
}

class StringProcessor implements Processor<String> {
    public String process(String value) { return value.toUpperCase(); }
}
class Concept01_GenericInterface {

    public static void main(String[] args) {
        Processor<String> processor = new StringProcessor();
        System.out.println(processor.process("java"));
    }
}
