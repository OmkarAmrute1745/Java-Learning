# 07 - Java 8+

Complete Java 8 learning section focused on the features used in modern Java and Spring Boot development.

## Structure

07-Java-8-Plus
- 01-Lambda-Expressions
- 02-Functional-Interfaces
- 03-Method-References
- 04-Stream-API
- 05-Collectors
- 06-Optional
- 07-Interface-Enhancements
- 08-Date-Time-API
- 09-Modern-Functional-Patterns
- 10-Java-8-Practice

Every Java file is standalone and follows the repository learning style:

**What is it? -> Why do we need it? -> Key points -> Interview note -> Runnable example**

## Core Flow

Lambda
  |
  v
Functional Interface
  |
  v
Stream API
  |
  +--> filter()
  +--> map()
  +--> flatMap()
  +--> sorted()
  +--> reduce()
  |
  v
Collectors
  |
  +--> groupingBy()
  +--> partitioningBy()
  +--> joining()
  |
  v
Result

Optional is used when a result may be absent.

The java.time API is used for modern date and time handling.

## Important Interview Topics

- Lambda expressions
- Functional interfaces
- Predicate, Consumer, Function, Supplier
- Method references
- Stream pipeline
- Intermediate vs terminal operations
- map() vs flatMap()
- filter() and reduce()
- Collectors.groupingBy()
- partitioningBy()
- Optional
- orElse() vs orElseGet()
- Default and static interface methods
- LocalDate, LocalDateTime, ZonedDateTime and Instant
- Period vs Duration
- Functional composition

## Practice Approach

For every example:

1. Understand the concept.
2. Read the comments.
3. Run the program.
4. Change the input.
5. Modify the logic.
6. Solve the practice requirement without looking at the solution.
7. Explain the code in interview-friendly words.

Do not commit generated .class files.
