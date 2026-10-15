/*
 * JAVA INTERVIEW PREPARATION
 * AREA: Exception handling
 * CONCEPT: Checked versus unchecked exceptions
 *
 * What is it?
 * Checked exceptions are checked by the compiler; RuntimeException subclasses are unchecked.
 *
 * Why do we need it?
 * It helps communicate recoverable conditions and programming errors clearly.
 *
 * Key points:
 * - Handle or declare checked exceptions; unchecked exceptions do not require that rule.
 * - Run this example and change the input to observe the behavior.
 *
 * Interview note:
 * Explain when to use a domain-specific exception instead of returning unclear status values.
 */

import java.io.IOException;
class Concept01_CheckedVsUnchecked {
    static void readConfig(boolean available) throws IOException {
        if (!available) throw new IOException("Configuration file is missing");
    }
    public static void main(String[] args) {
        try { readConfig(false); }
        catch (IOException ex) { System.out.println(ex.getMessage()); }
    }
}
