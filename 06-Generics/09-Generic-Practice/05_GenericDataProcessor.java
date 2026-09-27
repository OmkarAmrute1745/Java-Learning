/**
 * Topic: GenericDataProcessor
 *
 * Generics learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Processor<T> {
    void process(java.util.List<T> values) {
        for (T value : values) {
            System.out.println("Processing: " + value);
        }
    }
}
class Concept05_GenericDataProcessor {

    public static void main(String[] args) {
        Processor<String> processor = new Processor<>();
        processor.process(java.util.Arrays.asList("Java", "Spring"));
    }
}
