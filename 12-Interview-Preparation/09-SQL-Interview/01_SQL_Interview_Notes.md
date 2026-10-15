# SQL Interview Notes

## What is the difference between WHERE and HAVING?
- `WHERE` filters rows before grouping.
- `HAVING` filters groups after `GROUP BY`.

```sql
SELECT department_id, COUNT(*) AS employee_count
FROM employee
WHERE active = true
GROUP BY department_id
HAVING COUNT(*) > 5;
```

## INNER JOIN versus LEFT JOIN
- `INNER JOIN` returns matching rows from both tables.
- `LEFT JOIN` returns every row from the left side and matching rows from the right; unmatched right-side columns are NULL.

## Primary key versus unique constraint
- A primary key identifies each row and cannot be NULL.
- A unique constraint prevents duplicate values; NULL behavior depends on the database.

## Indexes
Indexes can speed up suitable reads and joins but consume storage and add write-maintenance cost. Choose indexes based on query patterns and validate with the query plan.

## Transactions and ACID
- Atomicity: all-or-nothing transaction.
- Consistency: constraints remain satisfied.
- Isolation: concurrent transactions are controlled by the chosen isolation level.
- Durability: committed changes persist according to database guarantees.

## Practice prompts
1. Find the second-highest salary.
2. Find duplicate email addresses.
3. Count employees by department.
4. Explain a composite index and column order.
5. Explain normalization and when denormalization may be justified.
6. Diagnose a slow query using an execution plan.
