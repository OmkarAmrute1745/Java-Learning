# Lambda Expressions

## Concept

A lambda expression provides a concise way to represent the implementation of a functional interface.

## Why it is needed

Before Java 8, behavior was commonly written using anonymous classes. Lambda expressions reduce boilerplate and make functional-style code easier to read.

## Syntax

(parameters) -> expression
(parameters) -> { statements }

## Flow

Functional Interface
        |
        v
Lambda Expression
        |
        v
Behavior is supplied
        |
        v
Method executes the behavior

## Examples

- Concept01_LambdaBasics - anonymous class vs lambda
- Concept02_LambdaSyntax - common syntax forms
- Concept03_LambdaWithParameters - parameters and return values
- Concept04_LambdaWithCollection - lambda with collections
- Concept05_LambdaPractice - simple practice problem

## Practice

1. Create a lambda that subtracts two numbers.
2. Create a lambda that checks whether a number is even.
3. Create a lambda that prints names starting with A.
