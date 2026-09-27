/**
 * Topic: BigDecimal
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept04_BigDecimal {

    public static void main(String[] args) {
        java.math.BigDecimal price = new java.math.BigDecimal("99.99");
        java.math.BigDecimal tax = new java.math.BigDecimal("10.01");
        System.out.println(price.add(tax));
    }
}
