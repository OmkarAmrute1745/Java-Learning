# Functional Interfaces

## Flow

Functional Interface -> Lambda -> Functional Behavior -> Method Execution

## Important interfaces

- Predicate<T> -> takes a value and returns boolean
- Consumer<T> -> takes a value and returns nothing
- Function<T, R> -> converts T into R
- Supplier<T> -> supplies a value
- BiFunction<T, U, R> -> takes two values and returns a result
- BiPredicate<T, U> -> takes two values and returns boolean

## Practice

Create a Predicate for positive numbers, a Function that converts Celsius to Fahrenheit, and a Supplier that generates a welcome message.