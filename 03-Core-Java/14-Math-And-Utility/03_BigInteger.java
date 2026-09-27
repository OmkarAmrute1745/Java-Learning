/**
 * Topic: BigInteger
 *
 * Core Java learning example.
 * Understand the concept, run the program, then modify it and practice.
 */
class Concept03_BigInteger {

    public static void main(String[] args) {
        java.math.BigInteger value = new java.math.BigInteger("999999999999999999999999");
        System.out.println(value.multiply(java.math.BigInteger.TWO));
    }
}
