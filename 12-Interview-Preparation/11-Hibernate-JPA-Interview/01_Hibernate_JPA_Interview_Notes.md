# Hibernate and JPA Interview Notes

## JPA versus Hibernate
JPA is a persistence specification; Hibernate is a widely used implementation with additional capabilities.

## Entity lifecycle
Common states include transient, managed, detached, and removed.

## Lazy versus eager loading
Lazy loading postpones association retrieval until needed; eager loading requests it earlier. The right fetch plan depends on the use case and can be expressed with fetch joins or entity graphs.

## N+1 query problem
A query loads a set of parent rows, then additional queries load related data for each parent. Diagnose SQL logs and query counts; fix using a suitable fetch plan, batching, or projections.

## Persistence context
The persistence context tracks managed entities and synchronizes changes with the database during flush/transaction processing.

## Optimistic locking
A version column can detect conflicting updates and prevent silent overwrites.

## Practice prompts
1. What is the difference between save and saveAndFlush?
2. What does cascading mean?
3. What is the owning side of a relationship?
4. Why can bidirectional relationships recurse in JSON serialization?
5. How do transaction boundaries affect lazy loading?
6. How would you investigate slow ORM-based batch processing?
